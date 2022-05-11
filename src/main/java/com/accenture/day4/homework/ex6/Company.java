package com.accenture.day4.homework.ex6;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final String name;
    private int countManagers;
    private final List<Person> employees;

    public Company(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public Person getManager() {
        for (Person person : employees) {
            if (person.getPosition().equals("Manager")) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPersons(String position) {
        List<Person> result = new ArrayList<>();
        for (Person person : employees) {
            if (person.getPosition().equals(position)) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPersons(int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : employees) {
            if (person.getAge() > age) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPersonsWithName(String name) {
        List<Person> result = new ArrayList<>();
        for (Person person : employees) {
            if (person.getName().equals(name)) {
                result.add(person);
            }
        }
        return result;
    }

    public void employ(Person person) {
        if (person.getName().isEmpty() ||
                person.getName() == null ||
                person.getAge() < 18 ||
                person.getPosition().isEmpty() ||
                person.getPosition() == null) {
            throw new IllegalArgumentException("Invalid person");
        }

        if (person.getPosition().equals("Manager")) {
            countManagers++;
            if (countManagers > 1) {
                System.out.println("Company can have only one manager");
                return;
            }
            employees.add(person);
            System.out.println("Company  " + name + " has a new manger: " + person.getName());
        } else {
            employees.add(person);
            System.out.println("Company  " + name + " has a new employee: " + person.getName() + " with position: " + person.getPosition());
        }
    }
}
