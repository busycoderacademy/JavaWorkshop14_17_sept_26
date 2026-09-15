package com.busycoder.topic6_interface_vs_abclass;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    public void payable() {
        System.out.println(name + " gets a fixed monthly salary.");
    }
}