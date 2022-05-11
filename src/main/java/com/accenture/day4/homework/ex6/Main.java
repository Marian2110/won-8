package com.accenture.day4.homework.ex6;


public class Main {
    public static void main(String[] args) {
        var samsung = new Company("Samsung");
        samsung.employ(new Person("John", 31, "Manager"));
        samsung.employ(new Person("Doe", 24, "Analyst"));
        samsung.employ(new Person("George", 25, "Developer"));

        System.out.println(samsung.getPersons(20));

    }
}
