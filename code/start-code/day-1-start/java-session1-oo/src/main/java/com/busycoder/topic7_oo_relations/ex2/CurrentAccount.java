package com.busycoder.topic7_oo_relations.ex2;

public class CurrentAccount extends Account {

    public CurrentAccount(int number, double balance) {
        super(number, balance);
    }

    @Override
    public double calculateInterest() {
        return 0.0;
    }
}
