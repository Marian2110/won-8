package com.accenture.day8.homework.mockito.contract;

import java.time.LocalDateTime;

public record Contract(int personId, LocalDateTime expirationDate) {

    public Contract(int personId, LocalDateTime expirationDate) {
        if (expirationDate == null) {
            throw new IllegalArgumentException("Expiration date cannot be null");
        }
        if (expirationDate.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Expiration date cannot be in the past");
        }
        if (personId <= 0) {
            throw new IllegalArgumentException("Person id must be greater than 0");
        }
        this.personId = personId;
        this.expirationDate = expirationDate;
    }
}
