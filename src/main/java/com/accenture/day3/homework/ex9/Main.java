package com.accenture.day3.homework.ex9;

public class Main {
    public static void main(String[] args) {
        var student1 = new Student("Ion", 10);
        var student2 = new Student("Maria", 9);
        var student3 = new Student("Vasile", 8);
        var student4 = new Student("Vlad", 7);

        System.out.println(Student.calculateAverageOfNotes());
    }
}
