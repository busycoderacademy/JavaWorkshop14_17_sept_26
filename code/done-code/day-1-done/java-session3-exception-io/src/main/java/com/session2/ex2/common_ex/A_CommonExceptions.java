package com.session2.ex2.common_ex;/*
10 Common Java Exceptions

1. NullPointerException — accessing a null object/reference
2. ArrayIndexOutOfBoundsException— accessing an invalid array index
3. ArithmeticException— invalid arithmetic operation, such as integer division by zero
4. NumberFormatException— converting an invalid String to a number
5. IllegalArgumentException— passing an invalid argument to a method
6. IllegalStateException— performing an operation when the object is in an inappropriate state
7. ClassCastException— attempting an incompatible type cast
8. StringIndexOutOfBoundsException— accessing an invalid String index
9. IOException— general input/output failure
10. FileNotFoundException — requested file cannot be found or opened
*/

import java.io.FileInputStream;
import java.io.IOException;


class Animal { }
class Dog extends Animal { }
class Cat extends Animal {}

// Custom Runtime Exception
class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}
public class A_CommonExceptions {

    public static void main(String[] args) {
//        nullPointerException();
//        arrayIndexOutOfBoundsException();
//        arithmeticException();
//        numberFormatException();
//        illegalArgumentException();
//        illegalStateException();
//        classCastException();
//        stringIndexOutOfBoundsException();
//        ioException();
//        fileNotFoundException();
//        stackTraceExample();
//        customExceptionExample();
    }


    // 1. NullPointerException
    private static void nullPointerException() {
        try {
            String name = null;

            System.out.println(name.length());

        } catch (NullPointerException exception) {

            System.out.println("1. NullPointerException");
            System.out.println("Caught: " + exception);
        }
    }


    // 2. ArrayIndexOutOfBoundsException
    private static void arrayIndexOutOfBoundsException() {
        try {
            int[] values = {10, 20, 30};

            System.out.println(values[10]);

        } catch (ArrayIndexOutOfBoundsException exception) {

            System.out.println("2. ArrayIndexOutOfBoundsException");
            System.out.println("Caught: " + exception);
        }
    }

    // 3. ArithmeticException
    private static void arithmeticException() {
        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);

        } catch (ArithmeticException exception) {

            System.out.println("3. ArithmeticException");
            System.out.println("Caught: " + exception);
        }
    }

    // 4. NumberFormatException
    private static void numberFormatException() {
        try {
            String value = "abc";

            int number = Integer.parseInt(value);

            System.out.println(number);

        } catch (NumberFormatException exception) {

            System.out.println("4. NumberFormatException");
            System.out.println("Caught: " + exception);
        }
    }
    // 5. IllegalArgumentException
    private static void illegalArgumentException() {

        try {
            setAge(-10);

        } catch (IllegalArgumentException exception) {

            System.out.println("5. IllegalArgumentException");
            System.out.println("Caught: " + exception);
        }
    }

    private static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }
        System.out.println("Age: " + age);
    }

    // 6. IllegalStateException
    private static void illegalStateException() {
        try {
            Account account = new Account();

            account.withdraw(100);

        } catch (IllegalStateException exception) {

            System.out.println("6. IllegalStateException");
            System.out.println("Caught: " + exception);
        }
    }


    // 7. ClassCastException
    private static void classCastException() {
        try {
            Animal animal = new Cat();

            Dog dog = (Dog) animal;

            System.out.println(dog);

        } catch (ClassCastException exception) {

            System.out.println("7. ClassCastException");
            System.out.println("Caught: " + exception);
        }
    }


    // 8. StringIndexOutOfBoundsException
    private static void stringIndexOutOfBoundsException() {

        try {
            String name = "Raj";

            System.out.println(name.charAt(10));

        } catch (StringIndexOutOfBoundsException exception) {

            System.out.println("8. StringIndexOutOfBoundsException");
            System.out.println("Caught: " + exception);
        }
    }


    // 9. IOException
    private static void ioException() {

        try {
            throw new IOException("Something went wrong during I/O operation");

        } catch (IOException exception) {

            System.out.println("9. IOException");
            System.out.println("Caught: " + exception);
        }
    }


    // 10. FileNotFoundException
    private static void fileNotFoundException() {

        try {
            FileInputStream inputStream =
                    new FileInputStream("does-not-exist.txt");

        } catch (java.io.FileNotFoundException exception) {

            System.out.println("10. FileNotFoundException");
            System.out.println("Caught: " + exception);
        }
    }


    // Stack trace demonstration
    private static void stackTraceExample() {

        try {
            method1();

        } catch (Exception exception) {

            System.out.println();
            System.out.println("========== STACK TRACE ==========");

            System.err.println("Message: " + exception.getMessage());

            exception.printStackTrace();
        }
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        method3();
    }

    private static void method3() {

        throw new IllegalStateException(
                "Something went wrong in method3()"
        );
    }


    // Custom exception demonstration
    private static void customExceptionExample() {

        try {
            doSomething(-1);

        } catch (MyException exception) {

            System.out.println();
            System.out.println("========== CUSTOM EXCEPTION ==========");

            System.out.println(
                    "Custom exception: " + exception.getMessage()
            );
        }
    }

    private static void doSomething(int number) {

        if (number < 0) {

            throw new MyException(
                    "Number cannot be negative: " + number
            );
        }
    }
}


// Supporting classes
class Account {
    private boolean active = false;
    public void withdraw(int amount) {
        if (!active) {
            throw new IllegalStateException("Account is not active");
        }
        System.out.println("Withdrawing: " + amount);
    }
}


