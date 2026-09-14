package com.busycoder.topic6_interface_vs_abclass;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String name) {
        super(name);
    }

    @Override
    public void payable() {
        System.out.println(name + " gets paid based on working hours.");
    }
}