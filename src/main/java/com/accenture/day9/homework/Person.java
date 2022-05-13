package com.accenture.day9.homework;

public record Person(int id, String name, int age) implements Comparable<Person> {
    public Person(int id, String name, int age) {
        if (id < 0) {
            throw new IllegalArgumentException("Id must be positive");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must be not empty");
        }
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person other) {
        return this.age - other.age;
    }
}
