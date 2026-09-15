package com.busycoder.topic7_oo;

public abstract class Account {
    private final int number;
    protected double balance;

    protected Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance += amount;
    }

    public abstract double calculateInterest();
}
