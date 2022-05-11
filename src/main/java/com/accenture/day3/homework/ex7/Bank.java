package com.accenture.day3.homework.ex7;

import java.util.ArrayList;
import java.util.List;

public abstract class Bank {
    protected static class Account {
        private final Person owner;
        private double balance;
        private final int id;

        public Account(Person owner, int balance, int id) {
            this.id = id;
            this.owner = owner;
            this.balance = balance;
        }

        public Person getOwner() {
            return owner;
        }

        public double getBalance() {
            return balance;
        }

        public int getId() {
            return id;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "owner=" + owner +
                    ", balance=" + balance +
                    ", id=" + id +
                    '}';
        }
    }

    protected final String bankName;
    protected List<Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public Account getAccount(int id) {
        return accounts.get(id);
    }

    public abstract void openAccount(Person person);

    public abstract void deposit(double amount, int accountNumber);

    public abstract void withdraw(double amount, int accountNumber);
}
