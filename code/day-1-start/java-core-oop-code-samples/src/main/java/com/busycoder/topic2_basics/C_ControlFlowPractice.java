package com.busycoder.topic2_basics;

public class C_ControlFlowPractice {

    public static void main(String[] args) {
        int amount = 7500;

        // if-else is used when a decision depends on a condition.
        if (amount <= 10_000) {
            System.out.println("Transfer is within the basic approval limit.");
        } else {
            System.out.println("Additional approval is required.");
        }

        // for loop is useful when the number of iterations is known.
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.println("Validation attempt: " + attempt);
        }

        // switch is useful when one value selects one of several cases.
        String status = "APPROVED";
        switch (status) {
            case "APPROVED" -> System.out.println("Payment approved.");
            case "REJECTED" -> System.out.println("Payment rejected.");
            default -> System.out.println("Payment is pending.");
        }
    }
}
