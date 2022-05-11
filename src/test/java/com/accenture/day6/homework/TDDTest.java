package com.accenture.day6.homework;

import com.accenture.day8.dsadsad.TDD;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TDDTest {

    // Write a method "max" that gets as an input a list of Integers and returns the max two values.
    // If List is null return null
    // if List has one element return null
    // if list has at least 2 elements return max 2 elements

    @Test
    void testIfClassExists() {
        TDD tdd = new TDD();
    }

    @Test
    void testMethodExistsWithProperParams() {
        TDD tdd = new TDD();
        tdd.max(List.of(1, 2, 5, 7, 5));
    }

    @Test
    void testMethodHasProperReturnType() {
        TDD tdd = new TDD();
        MaxValues values = tdd.max(List.of(1, 2, 5, 7, 3));
    }

    @Test
    void testNullReturnValueIfListIsNull() {
        TDD tdd = new TDD();
        MaxValues values = tdd.max(null);
        Assertions.assertNull(values);
    }

    @Test
    void testNullReturnValueIfListHasOneElement() {
        TDD tdd = new TDD();
        MaxValues values = tdd.max(List.of(1));
        Assertions.assertNull(values);
    }



    @Test
    void testReturnNotNullIfListSizeBiggerThenOne() {
        TDD tdd = new TDD();
        MaxValues values = tdd.max(List.of(1, 2, 5, 7, 3));
        Assertions.assertNotNull(values);
    }

    @Test
    void testMaxIsCorrect() {
        TDD tdd = new TDD();
        MaxValues values = tdd.max(List.of(1, 2, 5, 7, 3));

        int expected = 7;
        Assertions.assertNotNull(values);
        Assertions.assertEquals(expected, values.max());
    }

}
