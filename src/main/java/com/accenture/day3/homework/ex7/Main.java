package com.accenture.day3.homework.ex7;

public class Main {
    public static void main(String[] args) {

        var person1 = new Person("John", 21, false);
        var person2 = new Person("Johny", 211, false);

        var ingBank = new ING("ING Bank");
        var bt = new BT("Banca Transilvania");

        person1.openBankAccount(ingBank);
        person2.openBankAccount(bt);

        person1.deposit(100);
        person1.deposit(100);

        person1.withdraw(50);
    }
}
