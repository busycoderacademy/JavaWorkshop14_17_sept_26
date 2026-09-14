package com.session3.ex4_comparable_comparator;
//Demo Comparable and comparator
public class Employee  {
    private final int id;
    private final String name;
    private final double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "[" + id + ", " + name + ", " + salary + "]";
    }
}
