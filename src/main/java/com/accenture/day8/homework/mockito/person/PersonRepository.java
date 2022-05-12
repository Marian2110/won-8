package com.accenture.day8.homework.mockito.person;

import java.util.List;

public class PersonRepository {
    private final List<Person> personList = List.of(
            new Person(1, "John", 21),
            new Person(2, "Jane", 22),
            new Person(3, "Jack", 23),
            new Person(4, "Jill", 24),
            new Person(5, "Jim", 25),
            new Person(6, "Jenny", 26)

    );

    public List<Person> findAll() {
        return List.copyOf(personList);
    }
    public List<Person> findByName(String name) {
        return findAll().stream().filter(person -> person.name().equals(name)).toList();
    }

    public List<Person> findPersonsWhereIdIn(List<Integer> personIds) {
        return findAll().stream()
                .filter(person -> personIds.contains(person.id()))
                .toList();
    }


}
