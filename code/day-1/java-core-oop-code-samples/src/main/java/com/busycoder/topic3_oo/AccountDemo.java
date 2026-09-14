package com.busycoder.topic3_oo;

public class AccountDemo {

    public static void main(String[] args) {
        // Account is the class (blueprint).
        Account account = new Account(101, 10_000);

        // account is an object (instance of Account).
        account.deposit(2_500);

        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Balance      : " + account.getBalance());
    }
}
