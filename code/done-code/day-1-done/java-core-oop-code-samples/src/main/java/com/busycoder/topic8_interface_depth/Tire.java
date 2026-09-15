package com.busycoder.topic8_interface_depth;

public class Tire implements Payable, Bounceable {

    @Override
    public void pay(double amount) {
        System.out.println("Processing payment of " + amount);
    }

    @Override
    public void bounce() {
        System.out.println("Tire is bouncing.");
    }
}
