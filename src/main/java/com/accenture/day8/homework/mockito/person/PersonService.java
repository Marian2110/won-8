package com.accenture.day8.homework.mockito.person;

import com.accenture.day8.homework.mockito.contract.ContractRepository;
import com.accenture.day8.homework.mockito.contract.ContractService;

import java.time.LocalDateTime;
import java.util.List;

public class PersonService {
    PersonRepository personRepository;
    ContractService contractService;

    public PersonService(PersonRepository productRepository, ContractService contractService, ContractRepository contractRepository) {
        if (productRepository == null) {
            throw new IllegalArgumentException("ProductRepository is null");
        }
        if (contractService == null) {
            throw new IllegalArgumentException("ContractService is null");
        }
        if (contractRepository == null) {
            throw new IllegalArgumentException("ContractRepository is null");
        }
        this.personRepository = productRepository;
        this.contractService = new ContractService(contractRepository);
    }

    public List<Person> findAllEmployedPersonsMoreEfficiently() {
       List<Integer> employedPersonIds = contractService.getContractIdsWhereExpirationDateBiggerThen(LocalDateTime.now());
        return personRepository.findPersonsWhereIdIn(employedPersonIds);
    }

    public List<Person> findAllEmployedPersons() {

        List<Person> people = personRepository.findAll().stream()
                .filter(person -> contractService.isEmployed(person.id()))
                .toList();
        System.out.println(people);
        return people;
    }
    public List<Person> findByName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        return personRepository.findByName(name);
    }
    /**
     * TODO: Unde se face verificarea parametrilor pasați in functție?
     * -controller
     * -service
     */
}
