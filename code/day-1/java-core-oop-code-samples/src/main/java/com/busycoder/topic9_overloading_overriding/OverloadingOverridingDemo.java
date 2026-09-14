package com.busycoder.topic9_overloading_overriding;
//overriding happens bw 2 classes son and parent: runtime polymorphism
//overloading happens bw 2 methods: compile time polymorphism, it can be in same class or different classes
class Calculator{
    public int add(int a, int b) {
        System.out.println("Adding two numbers");
        return a + b;
    }
//    public int add(int a, int b, int c) {
//        System.out.println("Adding three numbers");
//        return a + b+c;
//    }
    //what if i have to add 100s
    public int add(int ...a) {
        System.out.println("Adding many numbers");
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
//class AdvancedCalculator extends Calculator{
//    public int add(int a, int b, int c, int d) {
//        return a + b+c+d;
//    }
//}

public class OverloadingOverridingDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Result = " + calculator.add(10, 20,30));

    }
}
