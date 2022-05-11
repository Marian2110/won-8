package com.accenture.day4.homework.ex2ex3;

import java.time.LocalDateTime;

public class Employee implements Person {
    private final String firstName;
    private final String lastName;
    private final LocalDateTime birthDate;
    private final String address;
    private final LocalDateTime dateOfEmployment;
    private final String position;

    public Employee(String firstName, String lastName, LocalDateTime birthDate, String address, LocalDateTime dateOfEmployment, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public LocalDateTime getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

}
