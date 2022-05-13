package com.accenture.day9.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxFinderTest {

    @Test
    void findTwoOldestPersons_shouldReturnMaxValue() {
        //given
        var list = List.of(
                new Person(1, "Kowalski", 21),
                new Person(2, "Nowak", 22),
                new Person(3, "Kowalski", 23),
                new Person(4, "Nowak", 24),
                new Person(5, "Carl", 24)
        );

        //when
        var result = MaxFinder.findTwoOldestPersons(list);

        //then
        var expected = new MaxValuePerson(list.get(3), list.get(2));
        MaxValuePerson actual = MaxFinder.findTwoOldestPersons(list);

        // This will fail if MaxValuePerson is class but pass if MaxValuePerson is record
        //        assertEquals(expected, actual);

        assertEquals(expected.getMax(), actual.getMax());
        assertEquals(expected.getSecondMax(), actual.getSecondMax());

    }

}