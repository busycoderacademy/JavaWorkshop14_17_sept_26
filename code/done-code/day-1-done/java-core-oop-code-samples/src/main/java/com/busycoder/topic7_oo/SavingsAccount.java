package com.busycoder.topic7_oo;

public class SavingsAccount extends Account {

    public SavingsAccount(int number, double balance) {
        super(number, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.03;
    }
}
