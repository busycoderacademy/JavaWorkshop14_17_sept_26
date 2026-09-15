package com.busycoder.solid.ocp;
class Circle {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Square {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

//
//class Triangle {
//    public void draw() {
//        System.out.println("Drawing Triangle");
//    }
//}


public class OCP_Demo {
    public static void process(Object shape) {
        if (shape instanceof Circle) {
            ((Circle) shape).draw();

        } else if (shape instanceof Rectangle) {
            ((Rectangle) shape).draw();

        } else if (shape instanceof Square) {
            ((Square) shape).draw();
        }
    }

    public static void main(String[] args) {
        process(new Circle());
        process(new Rectangle());
        process(new Square());
    }
}


