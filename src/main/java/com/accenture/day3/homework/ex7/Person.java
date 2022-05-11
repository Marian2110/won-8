package com.accenture.day3.homework.ex7;

public class Person {
    private final String name;
    private final int age;
    private final boolean married;
    private int bankAccountId;
    private Bank bank;

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    public int getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(int bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public void openBankAccount(Bank bank) {
        bank.openAccount(this);
        this.bank = bank;
    }

    public void deposit(int amount) {
        bank.deposit(amount, bankAccountId);
    }

    public void withdraw(int amount) {
        bank.withdraw(amount, bankAccountId);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", married=" + isMarried() +
                '}';
    }

}
