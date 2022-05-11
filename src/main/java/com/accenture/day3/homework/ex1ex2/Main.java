package com.accenture.day3.homework.ex1ex2;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("John", 23, false);
        Person person2 = new Person("Gigi", 34, true);
        Person person3 = new Person("Klaus", 44, false);

        System.out.println("Person1: "+ "name = " + person1.getName() + ", age = " + person1.getAge() + ", married = " + person1.isMarried());
        System.out.println("Person2: "+ "name = " + person2.getName() + ", age = " + person2.getAge() + ", married = " + person2.isMarried());
        System.out.println("Person3: "+ "name = " + person3.getName() + ", age = " + person3.getAge() + ", married = " + person3.isMarried());
    }

}
