package com.accenture.day4.homework.ex2ex3;

import java.time.LocalDateTime;

public class Programmer extends Employee {
    private String language;

    public Programmer(String firstName, String lastName, LocalDateTime birthDate, String address, LocalDateTime dateOfEmployment) {
        super(firstName, lastName, birthDate, address, dateOfEmployment, "Programmer");
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "language='" + language + '\'' +
                '}';
    }
}
