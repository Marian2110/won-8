package com.accenture.day4.homework.ex2ex3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DemoPerson {
    private final Person person;

    public DemoPerson(Person person) {
        this.person = person;
    }

    public void printPersonFullName() {
        System.out.println(person.getFirstName() + " " + person.getLastName());
    }

    public void printPersonAge() {
        var age= ChronoUnit.YEARS.between(person.getBirthDate(), LocalDateTime.now());
        System.out.println(age);
    }
}

