package com.busycoder.ex7_queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Amit");
        queue.add("Jai");
        queue.add("Rahul");

        System.out.println("Head using element(): " + queue.element());
        System.out.println("Head using peek(): " + queue.peek());

        System.out.println();
        System.out.println("Iterator order is NOT guaranteed to be priority order:");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("Priority order using poll():");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println();
        System.out.println("Custom object example: Employee ordered by lowest salary first.");

        Queue<Employee> employeeQueue = new PriorityQueue<>(
                Comparator.comparingDouble(Employee::getSalary)
        );

        employeeQueue.add(new Employee(101, "Amit", 50_000));
        employeeQueue.add(new Employee(102, "Vijay", 30_000));
        employeeQueue.add(new Employee(103, "Karan", 70_000));
        employeeQueue.add(new Employee(104, "Jai", 40_000));

        System.out.println("Head (lowest salary): " + employeeQueue.peek());

        System.out.println("Processing employees by priority:");
        while (!employeeQueue.isEmpty()) {
            System.out.println(employeeQueue.poll());
        }
    }
}
