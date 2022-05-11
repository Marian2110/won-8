package com.accenture.day6.homework;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class PersonService {

    public List<String> getPersonNames(List<Person> persons) {
        return persons.stream()
                .map(person -> person.firstName() + " " + person.lastName())
                .toList();
    }

    public List<Person> getMajorPersons(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.age() >= 18)
                .toList();
    }

    public List<Person> getAllPersonFromOradea(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.city().equals("Oradea"))
                .toList();
    }

    public List<Person> getAllPersonFromOradeaOrCluj(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.city().equals("Oradea") || person.city().equals("Cluj"))
                .toList();
    }

    public List<String> getPersonFirstNameCapitalized(List<Person> persons) {
        return persons.stream()
                .map(person -> person.firstName().toUpperCase())
                .toList();
    }

    public List<String> getPersonFirstNameAndFirstLetterFormLastName(List<Person> persons) {
        return persons.stream()
                .map(person -> person.firstName() + " " + person.lastName().charAt(0))
                .toList();
    }

    public List<Person> getPersonsWithAgeBetween18And60(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.age() > 18 && person.age() < 60)
                .toList();
    }

    public List<Person> getPersonsHavingFirstNameStartingWithA(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.firstName().charAt(0) == 'A')
                .toList();
    }

    public List<String> getAllUniqueFirstNames(List<Person> persons) {
        return persons.stream()
                .map(Person::firstName)
                .distinct()
                .toList();
    }

    public List<Person> getPersonsSortedByFirstName(List<Person> persons) {
        return persons.stream()
                .sorted((person1, person2) -> person1.firstName().compareTo(person2.firstName()))
                .toList();
    }

    public List<Person> getPersonsSortedByLastName(List<Person> persons) {
        return persons.stream()
                .sorted((person1, person2) -> person1.lastName().compareTo(person2.lastName()))
                .toList();
    }

    public List<Person> getPersonsSortedByFirstNameLastNameAndAge(List<Person> persons) {
        return persons.stream()
                .sorted(Comparator.comparing(Person::firstName)
                        .thenComparing(Person::lastName, Comparator.nullsLast(Comparator.comparing(Function.identity())))
                        .thenComparing(Comparator.comparing(Person::age).reversed()))
                .toList();
    }
}


