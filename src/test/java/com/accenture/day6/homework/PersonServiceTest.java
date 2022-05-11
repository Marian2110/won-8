package com.accenture.day6.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class PersonServiceTest {

    List<Person> persons;
    PersonService personService = new PersonService();


    @BeforeEach
    void setUp() {
        persons = List.of(
                new Person("Andrei", "George", 18, "Cluj"),
                new Person("Claudiu", "Sagapao", 67, "Oradea"),
                new Person("Andrei", "Chiru", 15, "Bucuresti"),
                new Person("Andrei", "Chiru", 13, "Bucuresti"),
                new Person("Irina", "Belu", 44, "Cluj")
        );
    }

    @Test
    void getPersonNames() {
        Assertions.assertEquals(List.of(
                "Andrei George",
                "Claudiu Sagapao",
                "Andrei Chiru" ,
                "Andrei Chiru",
                "Irina Belu"
        ), personService.getPersonNames(persons));
    }

    @Test
    void getMajorPersons() {
        Assertions.assertEquals(List.of(
                new Person("Andrei", "George", 18, "Cluj"),
                new Person("Claudiu", "Sagapao", 67, "Oradea"),
                new Person("Irina", "Belu", 44, "Cluj")

        ), personService.getMajorPersons(persons));
    }

    @Test
    void getAllPersonFromOradea() {
        Assertions.assertEquals(List.of(
                new Person("Claudiu", "Sagapao", 67, "Oradea")
        ), personService.getAllPersonFromOradea(persons));
    }

    @Test
    void getAllPersonFromOradeaOrCluj() {
        Assertions.assertEquals(List.of(
                new Person("Andrei", "George", 18, "Cluj"),
                new Person("Claudiu", "Sagapao", 67, "Oradea"),
                new Person("Irina", "Belu", 44, "Cluj")
        ), personService.getAllPersonFromOradeaOrCluj(persons));
    }

    @Test
    void getPersonFirstNameCapitalized() {
        Assertions.assertEquals(List.of(
                "ANDREI",
                "CLAUDIU",
                "ANDREI",
                "ANDREI",
                "IRINA"
        ), personService.getPersonFirstNameCapitalized(persons));
    }

    @Test
    void getPersonFirstNameAndFirstLetterFormLastName() {
        Assertions.assertEquals(List.of(
                "Andrei G",
                "Claudiu S",
                "Andrei C",
                "Andrei C",
                "Irina B"
        ), personService.getPersonFirstNameAndFirstLetterFormLastName(persons));
    }

    @Test
    void getPersonsWithAgeBetween18And60() {
        Assertions.assertEquals(List.of(
                new Person("Irina", "Belu", 44, "Cluj")
        ), personService.getPersonsWithAgeBetween18And60(persons));

    }

    @Test
    void getPersonsHavingFirstNameStartingWithA() {
        Assertions.assertEquals(List.of(
                new Person("Andrei", "George", 18, "Cluj"),
                new Person("Andrei", "Chiru", 15, "Bucuresti"),
                new Person("Andrei", "Chiru", 13, "Bucuresti")
        ), personService.getPersonsHavingFirstNameStartingWithA(persons));
    }

    @Test
    void getAllUniqueFirstNames() {
        Assertions.assertEquals(List.of(
                "Andrei",
                "Claudiu",
                "Irina"
        ), personService.getAllUniqueFirstNames(persons));
    }

    @Test
    void getPersonsSortedByFirstName() {
        Assertions.assertEquals(List.of(
                new Person("Andrei", "George", 18, "Cluj"),
                new Person("Andrei", "Chiru", 15, "Bucuresti"),
                new Person("Andrei", "Chiru", 13, "Bucuresti"),
                new Person("Claudiu", "Sagapao", 67, "Oradea"),
                new Person("Irina", "Belu", 44, "Cluj")
        ), personService.getPersonsSortedByFirstName(persons));
    }

    @Test
    void getPersonsSortedByLastName() {
        Assertions.assertEquals(List.of(
                new Person("Irina", "Belu", 44, "Cluj"),
                new Person("Andrei", "Chiru", 15, "Bucuresti"),
                new Person("Andrei", "Chiru", 13, "Bucuresti"),
                new Person("Andrei", "George", 18, "Cluj"),
                new Person("Claudiu", "Sagapao", 67, "Oradea")
        ), personService.getPersonsSortedByLastName(persons));
    }

    @Test
    void getPersonsSortedByFirstNameLastNameAndAge() {
        Assertions.assertEquals(List.of(
                new Person("Andrei", "Chiru", 15, "Bucuresti"),
                new Person("Andrei", "Chiru", 13, "Bucuresti"),
                new Person("Andrei", "George", 18, "Cluj"),
                new Person("Claudiu", "Sagapao", 67, "Oradea"),
                new Person("Irina", "Belu", 44, "Cluj")
        ), personService.getPersonsSortedByFirstNameLastNameAndAge(persons));
    }
}