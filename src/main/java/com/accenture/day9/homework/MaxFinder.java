package com.accenture.day9.homework;

import java.util.List;

public class MaxFinder {
    public static MaxValuePerson findTwoOldestPersons(List<Person> list) {
        if (list != null && list.size() > 1) {
            Person max = null;
            Person secondMax = null;

            for (Person person : list) {
                if (person == null) {
                    continue;
                }
                if (max == null) {
                    max = person;
                }
                if (secondMax == null) {
                    secondMax = person;
                }
                if (person.compareTo(max) > 0) {
                    secondMax = max;
                    max = person;
                } else if (person.compareTo(secondMax) > 0 && secondMax.compareTo(max) == 0) {
                    secondMax = person;
                }
            }
            return new MaxValuePerson(max, secondMax);
        }
        return null;
    }

    /*
     * What should happen if exist 2 persons with same age?
     * 1. sort based on other field
     * 2. Refactor Object that store value to store List<Person> instead of Person
     */



}
