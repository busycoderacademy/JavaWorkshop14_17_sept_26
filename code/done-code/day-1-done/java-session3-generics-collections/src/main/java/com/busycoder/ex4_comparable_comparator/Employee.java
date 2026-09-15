package com.busycoder.ex4_comparable_comparator;

import java.util.Comparator;

//U need extra sort sequence: - Comparator
class EmployeeSorterAsPerName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
//Demo Comparable and comparator
public class Employee implements Comparable<Employee> {
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

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id, o.id);
    }
}
