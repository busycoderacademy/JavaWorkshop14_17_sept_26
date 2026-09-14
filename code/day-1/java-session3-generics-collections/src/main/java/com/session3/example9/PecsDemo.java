package com.session3.example9;

import java.util.List;

public class PecsDemo {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // animals.add(new Dog("Dog")); // Compile-time error.
    }

    public static void addDogs(List<? super Dog> dogs) {
        dogs.add(new Dog("Dog"));
        dogs.add(new CostlyDog("CostlyDog"));

        // dogs.add(new Animal("Animal")); // Compile-time error.
    }
}
