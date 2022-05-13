package com.accenture.day8.homework.mockito.contract;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class ContractService {

    private final ContractRepository contractRepository;

    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public boolean isEmployed(int personId) {
        if (personId < 0) {
            return false;
        }
        Optional<Contract> personContract = contractRepository.findByPersonId(personId);

        return personContract.map(contract -> contract.expirationDate().isAfter(LocalDateTime.now())).orElse(false);
    }

    public List<Integer> getContractIdsWhereExpirationDateBiggerThen(LocalDateTime date) {
        List<Integer> contractIds = contractRepository.getContractIdsWhereExpirationDateBiggerThen(date);
        if (contractIds.size() > 0) {
            return contractIds;
        }
        return null;
    }
}
