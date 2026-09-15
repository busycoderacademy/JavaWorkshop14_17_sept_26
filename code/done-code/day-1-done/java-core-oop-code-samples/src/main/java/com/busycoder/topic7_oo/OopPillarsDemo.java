package com.busycoder.topic7_oo;

public class OopPillarsDemo {

    public static void main(String[] args) {
        // Abstraction: Account exposes what every account can do.
        // Encapsulation: Account protects its state.
        // Inheritance: SavingsAccount extends Account.
        // Polymorphism: calculateInterest() behaves differently per object.

        Account account = new SavingsAccount(101, 20_000);
        account.deposit(1_000);

        System.out.println("Account = " + account.getNumber());
        System.out.println("Interest = " + account.calculateInterest());

        // Modularity is represented by separating each responsibility into classes.
    }
}
