package com.session3.ex1_object_class;

import java.util.Objects;

public class Employee {
    private final int id;
    private final double salary;

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    //Define equals method
    //Define toString method
    //Define hashCode method
    //Override equals, toString, and hashCode methods


}
