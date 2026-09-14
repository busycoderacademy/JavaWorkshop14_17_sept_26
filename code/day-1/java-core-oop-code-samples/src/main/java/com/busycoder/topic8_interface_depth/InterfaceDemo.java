package com.busycoder.topic8_interface_depth;

public class InterfaceDemo {

    public static void main(String[] args) {
        Tire tire = new Tire();

        tire.pay(500);
        tire.bounce();

        // One class can implement multiple interfaces.
        // An interface defines a contract; the implementing class provides behavior.
        //
        // Payable payable = new Payable(); // Compile error: no direct instantiation.
    }
}
