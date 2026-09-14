package com.session3.example8;

import java.util.ArrayList;
import java.util.List;

public class AnimalListDemo {
    private AnimalListDemo() {
    }

    public static void run() {
        Animal[] animals = new Cat[4];
        animals[0] = new Cat();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat());
        animalList.add(new Dog());

        // List<Animal> wrong = new ArrayList<Cat>(); // Compile-time error:
        // generic types are invariant in Java.

        System.out.println("Animal[] can be assigned from Cat[].");
        System.out.println("List<Animal> cannot be assigned from List<Cat>.");
        System.out.println("Animal list: " + animalList);
    }
}
