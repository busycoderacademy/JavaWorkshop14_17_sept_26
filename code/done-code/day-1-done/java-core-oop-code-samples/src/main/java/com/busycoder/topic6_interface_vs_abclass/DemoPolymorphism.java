package com.busycoder.topic6_interface_vs_abclass;

public class DemoPolymorphism {

    public static void main(String[] args) {
        // Inheritance creates an IS-A relationship.
        Employee e1=new FullTimeEmployee("John");
        Employee e2=new PartTimeEmployee("Jane");

        PaymentProcessingSystem.processPayment(e1);
        PaymentProcessingSystem.processPayment(e2);
    }
}
