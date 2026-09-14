package com.busycoder.topic13_final;
//final class: should be define with lots of care: sr dev

//final class A1 extends String{
//    /// define some method
//    public void show(){
//        System.out.println("A1");
//    }
//}

import com.busycoder.topic6_interface_vs_abclass.Employee;

class Dog{
    private String name;

    public Dog(String name){
        this.name=name;
    }
    //setter
    public void setName(String name){
        this.name=name;
    }
    void bark(){
        System.out.println("Bark: name of the dog "+ this.name);
    }
    //final method cannot be overridden by a subclass.
    public final void affection(){
        System.out.println("affection to the owner can not foget");
    }
}
class CostlyDog extends Dog{
    public CostlyDog(String name) {
        super(name);
    }

}
class Emp{

}
//final method argument
class EmployeePaymentProcssor{
    public void processPayment(final Employee employee){
        System.out.println("Processing payment for employee: ");
    }
}
public class FinalKeywordDemo {

    public static void main(String[] args) {

        String s = new String("hello");

        //final method





        // final variable: reference cannot be reassigned.
      //  final  int i=44;
        //i=55; // Compile error: final variable cannot be reassigned.
//        final Dog dog=new Dog("foo");// reference
//        //u can not assign a noew object but obect state can be changed
//        dog.setName("bar");
//        dog.bark();


        // account = new Account(102, 20_000); // Compile error: final reference.

        // final method cannot be overridden by a subclass.


        // Blank final fields can be assigned once, typically in a constructor.
    }
}
