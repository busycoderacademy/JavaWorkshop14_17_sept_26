package com.busycoder.example9_generics_super;

import java.util.ArrayList;
import java.util.List;

class Animal {
    private final String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}
class CostlyDog extends Dog {
    public CostlyDog(String name) {
        super(name);
    }
}
public class Extends_Super {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("White"));
        dogs.add(new Dog("Red"));
        dogs.add(new Dog("Black"));

    }

    /*
    This list contains Animal objects or objects of a subclass of Animal.
     You (compiler) can let me read them as Animal, but don't let me add anything to this list.”

     Animal: The unknown type ? can be Animal or any subclass of Animal, but it cannot go above Animal.
     */
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        // Compile-time error:
        // animals.add(new Dog("Dog"));
    }

    /*
    ? super Dog means I can pass a List of Dog or any parent type of Dog,
    such as List<Dog>, List<Animal>, or List<Object>.

    Inside this method, I can safely add a Dog or any subclass of Dog.
    I cannot add Animal because Animal is a parent of Dog

    super gives flexibility in the List type, while the objects we add must be Dog or below.
     */

    public static void addDogs(List<? super Dog> dogs) {
        dogs.add(new Dog("Dog"));
        dogs.add(new CostlyDog("CostlyDog"));
        // Compile-time error:
        // dogs.add(new Animal("Animal"));
    }
}





