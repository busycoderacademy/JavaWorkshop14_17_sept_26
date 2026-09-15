package com.busycoder.example8_generics;

import java.util.ArrayList;
import java.util.List;

class Animal {
}
class Cat extends Animal {
}
class Dog extends Animal {
}
public class B_Generics_Polymorphic {
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
