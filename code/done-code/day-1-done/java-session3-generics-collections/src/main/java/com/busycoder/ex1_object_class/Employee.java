package com.busycoder.ex1_object_class;

import java.util.Objects;

public class Employee extends Object{
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

    //toString() to show the object in a readable format
    @Override
    public String toString() {
        return "Employee [id=" + id + ", salary=" + salary + "]";
    }

    //Define equals method
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return id == employee.id && Double.compare(salary, employee.salary) == 0;
    }

    //Objects vs Object
    @Override
    public int hashCode() {
        return Objects.hash(id, salary);
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

//Define toString method
    //Define hashCode method
    //Override equals, toString, and hashCode methods


}
