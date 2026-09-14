package com.busycoder.topic7_oo;

import java.util.Scanner;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
//cat

class Cat extends Animal {
    // Overriding
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
// dog

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
public class DemoPolymorphism {
    // Polymorphism: One form can take many forms.
    public static void main(String[] args) {
        //runtime polymorphism
        //take the value from the user which animal sound you want
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for cat and 2 for dog");
        int choice=sc.nextInt();
        Animal animal = null;
        if(choice==1){
            animal=new Cat();
        }else if(choice==2){
            animal=new Dog();
        }else{
            System.out.println("Invalid choice");
        }

        animal.sound();
    }
}
