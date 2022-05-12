package com.accenture.day8.homework.mockito.contract;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class ContractRepository {
    private final List<Contract> contracts = List.of(
//            new Contract(1, LocalDateTime.of(2022, 12, 1, 0, 0)),
//            new Contract(2, LocalDateTime.of(2023, 11, 2, 0, 0)),
//            new Contract(3, LocalDateTime.of(2024, 10, 3, 0, 0)),
            new Contract(4, LocalDateTime.of(2025, 9, 4, 0, 0)),
            new Contract(5, LocalDateTime.of(2026, 8, 7, 0, 0)),
            new Contract(6, LocalDateTime.of(2027, 7, 8, 0, 0))
    );

    public List<Contract> findAll() {
        return List.copyOf(contracts);
    }
    public Optional<Contract> findByPersonId(int id) {
        return findAll().stream()
                .filter(contract -> contract.personId() == id)
                .findFirst();
    }

    public List<Integer> getContractIdsWhereExpirationDateBiggerThen(LocalDateTime date) {
        return findAll().stream()
                .filter(contract -> contract.expirationDate().isAfter(date))
                .map(Contract::personId)
                .toList();
    }
}