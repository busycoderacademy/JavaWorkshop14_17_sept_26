package com.session3.example9;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("White"));
        dogs.add(new Dog("Red"));
        dogs.add(new Dog("Black"));

        System.out.println("Producer: ? extends");
        PecsDemo.printAnimals(dogs);

        System.out.println();
        System.out.println("Consumer: ? super");
        PecsDemo.addDogs(dogs);
        System.out.println(dogs);

        List<Animal> animals = new ArrayList<>();
        PecsDemo.addDogs(animals);
        System.out.println("List<Animal> after addDogs(): " + animals);

        List<Object> objects = new ArrayList<>();
        PecsDemo.addDogs(objects);
        System.out.println("List<Object> after addDogs(): " + objects);

        List<Integer> integers = List.of(10, 20, 30);
        List<Double> doubles = List.of(1.1, 2.2);

        System.out.println();
        System.out.println("Producer accepts List<Integer> and List<Double>:");
        printNumbers(integers);
        printNumbers(doubles);
    }

    private static void printNumbers(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.println(number);
        }
    }
}
