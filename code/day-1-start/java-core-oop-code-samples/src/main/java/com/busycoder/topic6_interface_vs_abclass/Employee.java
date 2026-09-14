package com.busycoder.topic6_interface_vs_abclass;

public class Employee implements Payable{

    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void payable() {
        System.out.println(name + " gets paid.");
    }
}