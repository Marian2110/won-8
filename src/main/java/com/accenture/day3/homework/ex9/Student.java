package com.accenture.day3.homework.ex9;

public class Student {
    private final String name;
    private final double grade;

    private static int count;
    private static int sumOfGrades;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        count++;
        sumOfGrades += grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public static int calculateAverageOfNotes() {
        return sumOfGrades / count;
    }
}
