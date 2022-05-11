package com.accenture.day3.homework.ex7;

public class ING extends Bank {
    protected static int numOfAccounts;


    public ING(String bankName) {
        super(bankName);
    }

    public static int getNumOfAccounts() {
        return numOfAccounts;
    }
    @Override
    public void openAccount(Person person) {
        System.out.println(person.getName() + " opened an account at " + getBankName());
        numOfAccounts++;
        accounts.add(new Account(person, 0, numOfAccounts));
        System.out.println(numOfAccounts);
        person.setBankAccountId(numOfAccounts);
    }

    @Override
    public void deposit(double amount, int accountNumber) {
        System.out.println("Deposit of " + amount + " to account " + accountNumber + " at " + getBankName());
        var account = accounts.get(accountNumber-1);
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited " + amount + " to account " + accountNumber);
        System.out.println("New balance is " + account.getBalance());

    }

    @Override
    public void withdraw(double amount, int accountNumber) {
        System.out.println("Withdrawal of " + amount + " from account " + accountNumber + " at " + getBankName());
        var account = accounts.get(accountNumber-1);
        account.setBalance(account.getBalance() - amount);
        System.out.println("Withdrew " + amount + " from account " + accountNumber);
        System.out.println("New balance is " + account.getBalance());
    }
}
