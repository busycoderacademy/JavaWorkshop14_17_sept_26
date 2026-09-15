package com.busycoder.ex2.common_ex;
/*
NullPointerException — accessing a null object/reference
ArrayIndexOutOfBoundsException — accessing an invalid array index
ArithmeticException — invalid arithmetic operation, such as integer division by zero
NumberFormatException — converting an invalid String to a number
IllegalArgumentException — passing an invalid argument to a method
IllegalStateException — performing an operation when the object is in an inappropriate state
ClassCastException — attempting an incompatible type cast
StringIndexOutOfBoundsException — accessing an invalid String index
IOException — general input/output failure
FileNotFoundException — requested file cannot be found or opened
 */
public class A_CommonExceptions {
    public static void main(String[] args) {

    }

    private static void arrayIndexOutOfBoundsExceptionExample() {
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
