package com.busycoder.topic6_interface_vs_abclass;

public class PaymentProcessingSystem {

    public static void processPayment(Payable payable) {
        // business logic and some tax calculation, put into db (jdbc)
        payable.payable();
    }
}
