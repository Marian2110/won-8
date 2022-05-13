package com.accenture.day9.homework;

public class MaxValuePerson {
    private final Person max;
    private final Person secondMax;

    public MaxValuePerson(Person max, Person secondMax) {
        this.max = max;
        this.secondMax = secondMax;
    }

    public Person getMax() {
        return max;
    }

    public Person getSecondMax() {
        return secondMax;
    }

    @Override
    public String toString() {
        return "MaxValuePerson [max=" + max + ", secondMax=" + secondMax + "]";
    }

}
