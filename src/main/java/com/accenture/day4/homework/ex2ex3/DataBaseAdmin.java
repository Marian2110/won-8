package com.accenture.day4.homework.ex2ex3;

import java.time.LocalDateTime;

public class DataBaseAdmin extends Employee {
    private String dbTechnology;

    public DataBaseAdmin(String firstName, String lastName, LocalDateTime birthDate, String address, LocalDateTime dateOfEmployment, String position) {
        super(firstName, lastName, birthDate, address, dateOfEmployment, position);
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

    @Override
    public String getAddress() {
        return "db admin: " + super.getAddress();
    }

    @Override
    public String toString() {
        return super.toString() + " " + dbTechnology;
    }
}
