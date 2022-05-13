package com.accenture.day8.homework.mockito.contract;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ContractServiceTest {


    @Test
    void givenPersonId_WhenIsEmployedInvoked_ThenReturnBooleanValueOFEmploymentStatus() {
        ContractRepository contractRepository = Mockito.mock(ContractRepository.class);

        Mockito.when(contractRepository.findByPersonId(1))
                .thenReturn(Optional.of(
                        new Contract(1, LocalDateTime.of(
                                2022, 12, 1, 0, 0)
                        )
                ));

        ContractService contractService = new ContractService(contractRepository);
        assertTrue(contractService.isEmployed(1));
    }
}