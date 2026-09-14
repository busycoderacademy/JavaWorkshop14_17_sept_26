package com.busycoder.topic3_oo;

/**
 * A simple domain object representing a bank account.
 * how to craete class, ctr , getter setter , busines logic
 * encapsulation understanding
 * demo this keyword
 */
public class Account {
    private final int accountNumber;
    private double balance;

    public Account(int accountNumber1, double balance1) {
        accountNumber = accountNumber1;
        balance = balance1;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
