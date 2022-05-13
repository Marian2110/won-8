package com.accenture.day9.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var person5 = new Person(5, "Jill", 25);
        var person2 = new Person(2, "John", 22);
        var person6 = new Person(6, "Joe", 26);
        var person3 = new Person(3, "Jane", 23);
        var person7 = new Person(7, "Jill", 26);
        var person4 = new Person(4, "Jack", 24);
        var person = new Person(1, "Doe", 21);

        var list = List.of(person5, person2, person6, person3, person7, person4, person);
        List<Person> listWithNulls = new ArrayList<>();

        listWithNulls.add(null);
        listWithNulls.add(null);

        System.out.println(MaxFinder.findTwoOldestPersons(list));
    }
}
