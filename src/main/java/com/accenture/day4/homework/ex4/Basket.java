package com.accenture.day4.homework.ex4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Basket {
    private final List<String> fruits;
    private static int count;

    public Basket() {
        fruits = new ArrayList<>();
    }
    public void add(String fruit) {
        if (fruit == null) {
            throw new IllegalArgumentException("Fruit cannot be null");
        }
        fruits.add(fruit);
        System.out.println("Fruit " + fruit + " added");
        count++;
    }

    public void remove(String fruit) {
        if (fruit == null) {
            throw new IllegalArgumentException("Fruit cannot be null");
        }
        if (!fruits.contains(fruit)) {
            throw new IllegalArgumentException("Fruit not found");
        }
        fruits.remove(fruit);
        System.out.println("Fruit " + fruit + " removed");
        count--;
    }

    public boolean find(String fruit) {
        return fruits.contains(fruit);
    }

    public void position(String fruit) {
        if (fruit == null) {
            throw new IllegalArgumentException("Fruit cannot be null");
        }
        if (!fruits.contains(fruit)) {
            throw new IllegalArgumentException("Fruit not found");
        }
        System.out.println("Fruit " + fruit + " is at position " + (fruits.indexOf(fruit) + 1) + " in the basket");
        System.out.println("Position is not zero based");
    }

    public void count() {
        System.out.println("Basket contains " + count + " fruits");
    }

    public void customCount() {
        int customCounter = 0;
        for (String fruit : fruits) {
            customCounter++;
        }
        System.out.println("Custom count: Basket contains " + customCounter + " fruits");
    }

    public Collection<String> printDistinctFruits() {
        return new HashSet<>(fruits);
    }
}

