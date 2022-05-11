package com.accenture.day4.homework.ex2ex3;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        var marian = new Programmer(
                "Marian",
                "Datcu",
                LocalDateTime.of(1998, 10, 21, 0, 0),
                "Bucharest",
                LocalDateTime.of(2022, 5, 2, 0, 0)
                );
        DemoPerson demoPerson = new DemoPerson(marian);
        demoPerson.printPersonFullName();
        demoPerson.printPersonAge();
    }
}
