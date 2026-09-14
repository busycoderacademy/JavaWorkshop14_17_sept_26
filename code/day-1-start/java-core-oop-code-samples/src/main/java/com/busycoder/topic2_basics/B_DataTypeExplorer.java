package com.busycoder.topic2_basics;

public class B_DataTypeExplorer {

    public static void main(String[] args) {
        // Primitive types store simple values directly.
        int accountNumber = 101;
        double balance = 25_000.50;
        boolean active = true;
        char grade = 'A';

        // Reference variables hold references to objects.
        String customerName = "Raj";

        System.out.println("Account : " + accountNumber);
        System.out.println("Balance : " + balance);
        System.out.println("Active  : " + active);
        System.out.println("Grade   : " + grade);
        System.out.println("Customer: " + customerName);
    }
}
