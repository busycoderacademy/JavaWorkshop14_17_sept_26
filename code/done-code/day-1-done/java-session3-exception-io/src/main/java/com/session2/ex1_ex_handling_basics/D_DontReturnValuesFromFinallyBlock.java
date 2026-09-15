package com.session2.ex1_ex_handling_basics;

public class D_DontReturnValuesFromFinallyBlock {
    public static void main(String[] args) {
//       int result = foo();
//       System.out.println("Result: " + result);
       bar();
    }



    //why we should not return values from finally block
    private static int foo() {
        try {
            return 10;
        } finally {
           return 20;
        }
    }
    //never throw a ex from finally block

    private static void bar() {
        try {
            if(1==1)
                throw new NullPointerException();
        } finally {
            throw new ArithmeticException();
        }
    }
}
