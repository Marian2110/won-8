package com.accenture.day6.homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Andrei", null, 43, "Cluj"),
                new Person("Claudiu", "Sagapao", 67, "Oradea"),
                new Person("Andrei", "Chiru", 28, "Bucuresti"),
                new Person("Andrei", "Chiru", 24, "Bucuresti"),
                new Person("Irina", "Belu", 44, "Cluj")
        );

        PersonService personService = new PersonService();

        System.out.println("People before sorting:");
        people.forEach(System.out::println);

        System.out.println("\nPeople after sorting by firstName:");
        personService.getPersonsSortedByFirstName(people).forEach(System.out::println);
        System.out.println("\nPeople after sorting by lastName:");
        personService.getPersonsSortedByLastName(people).forEach(System.out::println);
        System.out.println("\nPeople after sorting by firstname, lastName and age:");
        personService.getPersonsSortedByFirstNameLastNameAndAge(people).forEach(System.out::println);

        System.out.println("\nPeople having firstName starting with A:");
        personService.getPersonsHavingFirstNameStartingWithA(people).forEach(System.out::println);

        System.out.println("\nMajor people:");
        personService.getMajorPerson(people).forEach(System.out::println);

        System.out.println("\nPeople having age between 18 and 60:");
        personService.getPersonsWithAgeBetween18And60(people).forEach(System.out::println);

        System.out.println("\nUnique firsNames:");
        personService.getAllUniqueFirstNames(people).forEach(System.out::println);

    }
}
