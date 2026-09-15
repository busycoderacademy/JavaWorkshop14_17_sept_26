package com.busycoder.ex4_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//default sorting aka natural sort vs extra sort sequece
public class DemoComparatorComparable {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(121, "Rama", 80_000));
        employees.add(new Employee(102, "Sita", 95_000));
        employees.add(new Employee(150, "Krishna", 70_000));
        //print the emp
        System.out.println("Before sorting");
        printEmps(employees);
        //sort them before printing
        Collections.sort(employees);
        System.out.println("After sorting");
        printEmps(employees);

        //sort them by name
        Collections.sort(employees, new EmployeeSorterAsPerName());
        System.out.println("After sorting by name");
        printEmps(employees);

        //u can inner classes
        Comparator<Employee> comparatorAsPerSalary=
                ( o1,  o2)-> Double.compare(o1.getSalary(), o2.getSalary());
        Collections.sort(employees, comparatorAsPerSalary);
        System.out.println("After sorting by salary");
        printEmps(employees);

        //Streams processing
        employees.stream()
                .filter(e->e.getSalary() > 80_000)
                .forEach(e->System.out.println(e));


    }

    private static void printEmps(List<Employee> employees) {
        for(Employee employee: employees){
            System.out.println(employee);
        }
    }
}
