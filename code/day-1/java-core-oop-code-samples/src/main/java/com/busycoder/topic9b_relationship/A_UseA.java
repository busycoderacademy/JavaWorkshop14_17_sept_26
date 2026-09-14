package com.busycoder.topic9b_relationship;
//abstraction:focus on essential things nothing to do with keywords
//  ..abstract class vs interface
//  ..abstract class: can have both abstract and non-abstract methods
//  ..interface: can have only abstract methods

abstract class Vehicle{
    private String color;
    private int speed;
    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }
   abstract public void move(String source , String destination);
}
class Metro extends  Vehicle{
    public Metro(String color, int speed) {
        super(color, speed);
    }
    public void move(String source , String destination){
        System.out.println("Moving from " + source + " to " + destination+ " using Metro");
    }
}
class Car extends Vehicle{
    public Car(String color, int speed) {
        super(color, speed);
    }
    public void move(String source , String destination){
        System.out.println("Moving from " + source + " to " + destination+ " using Car");
    }
}
class Passanger {
    private String name;
    public Passanger(String name) {
        this.name = name;
    }
    public void travel(Vehicle vehicle, String source, String destination) {
        vehicle.move(source, destination);
    }
}
public class A_UseA {
    public static void main(String[] args) {
        //Metro metro = new Metro();
//        Vehicle vehicle = new Car();
//        Passanger passanger = new Passanger("John");
//        passanger.travel(vehicle, "Moon Light Hotel", "Zoo");

    }
}
