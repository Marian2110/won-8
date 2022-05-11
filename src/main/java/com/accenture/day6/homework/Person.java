package com.accenture.day6.homework;

public record Person(String firstName, String lastName, int age, String city) {

    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be positive");
        }

        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name must be not empty");
        }

        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name must be not empty");
        }

        if (city == null || city.isEmpty()) {
            throw new IllegalArgumentException("City must be not empty");
        }

    }
}
