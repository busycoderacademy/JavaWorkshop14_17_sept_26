package com.session2.ex2.common_ex;

public class A_CommonExceptions {
    public static void main(String[] args) {
        System.out.println("=== Exception Hierarchy ===");
        System.out.println("Throwable");
        System.out.println("  |-- Error");
        System.out.println("  |-- Exception");
        System.out.println("       |-- RuntimeException");
        System.out.println("       |-- IOException");
        System.out.println("       |-- SQLException");
        System.out.println();

        commonExceptions();
        System.out.println();

        customExceptionExample();
        System.out.println();

        stackTraceExample();
    }

    private static void commonExceptions() {
        try {
            int[] values = {10, 20, 30};
            System.out.println(values[10]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Caught: " + exception);
        }

        try {
            String value = null;
            System.out.println(value.length());
        } catch (NullPointerException exception) {
            System.out.println("Caught: " + exception);
        }
    }

    private static void customExceptionExample() {
        try {
            doSomething(-1);
        } catch (MyException exception) {
            System.out.println("Custom exception: " + exception.getMessage());
        }
    }

    private static void doSomething(int number) {
        if (number < 0) {
            throw new MyException("Number cannot be negative: " + number);
        }
    }

    private static void stackTraceExample() {
        try {
            method1();
        } catch (Exception exception) {
            System.err.println("Message: " + exception.getMessage());
            System.err.println();
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
        throw new IllegalStateException("Something went wrong in method3()");
    }
}
