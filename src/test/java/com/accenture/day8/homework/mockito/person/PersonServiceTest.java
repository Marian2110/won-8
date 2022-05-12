package com.accenture.day8.homework.mockito.person;

import com.accenture.day8.homework.mockito.contract.Contract;
import com.accenture.day8.homework.mockito.contract.ContractRepository;
import com.accenture.day8.homework.mockito.contract.ContractService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@ExtendWith(MockitoExtension.class)
//@MockitoSettings(strictness = Strictness.LENIENT)
public class PersonServiceTest {

    @Test
    public void givenStringPersonName_WhenFindByNameInvoked_ThenReturnListOfPersonsWithInputName() {
        var personRepoMock = Mockito.mock(PersonRepository.class);
        var contractServiceMock = Mockito.mock(ContractService.class);
        var contractRepoMock = Mockito.mock(ContractRepository.class);
        var reqName = "Gigi";
        var expected = List.of(
                new Person(1, "Gigi", 21),
                new Person(2, "Gigi", 22));

        Mockito.when(personRepoMock.findByName(reqName))
                .thenReturn(expected);

        PersonService personService = new PersonService(personRepoMock, contractServiceMock, contractRepoMock);
        var actual = personService.findByName(reqName);
        assertEquals(expected, actual);
    }


    @Test
    public void whenFindAllEmployedPersonsInvoked_ThenReturnListOfEmployedPersons() {
        var personRepoMock = Mockito.mock(PersonRepository.class);
        var contractServiceMock = Mockito.mock(ContractService.class);
        var contractRepoMock = Mockito.mock(ContractRepository.class);

        Mockito.when(personRepoMock.findAll())
                .thenReturn(List.of(
                        new Person(1, "Gigi", 21),
                        new Person(2, "Gigi", 22),
                        new Person(3, "Gigi", 23)
                ));

        Mockito.when(contractRepoMock.findByPersonId(1))
                .thenReturn(Optional.of(new Contract(
                        1,
                        LocalDateTime.of(
                                2022, 12, 1, 0, 0))
                ));

        Mockito.when(contractRepoMock.findByPersonId(2))
                .thenReturn(Optional.of(new Contract(
                        2,
                        LocalDateTime.of(
                                2023, 11, 2, 0, 0))
                ));

        PersonService personService = new PersonService(personRepoMock, contractServiceMock, contractRepoMock);

        var expected = List.of(
                new Person(1, "Gigi", 21),
                new Person(2, "Gigi", 22));

        var actual = personService.findAllEmployedPersons();

        assertEquals(expected, actual);
    }
//    @Test
//    public void whenFindAllEmployedPersonsInvoked_ThenReturnListOfEmployedPersons2() {
//        var personRepoMock = Mockito.mock(PersonRepository.class);
//        var contractServiceMock = Mockito.mock(ContractService.class);
//        var contractRepoMock = Mockito.mock(ContractRepository.class);
//        var expected = List.of(
//                new Person(1, "Gigi", 21),
//                new Person(2, "Gigi", 22),
//                new Person(3, "Gigi", 22),
//                new Person(4, "Gigi", 22));
//
//        Mockito.when(personRepoMock.findAll())
//                .thenReturn(expected);
//        Mockito.when(personRepoMock.findPersonsWhereIdIn(List.of(1, 2, 3, 4)))
//                .thenReturn(expected);
//        Mockito.when(contractServiceMock.getContractIdsWhereExpirationDateBiggerThen(LocalDateTime.now()))
//                .thenReturn(List.of(1, 2, 3, 4));
//        var personService = new PersonService(personRepoMock, contractServiceMock, contractRepoMock);
//        List<Person> actual = personService.findAllEmployedPersons();
//        assertEquals(expected, actual);
//    }
}
