package com.session2.ex1_ex_handling_basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C_HelloWorld {
    public static void main(String[] args) {


        //Java 7: ARM: Auto Resource Management, hey u just use a special syntex , jvm will understand
        //do the dirty job of cleanup ...
       //Try with resources
//        try(Scanner scanner=new Scanner(System.in)){
//            int i, j ,k;
//            i=scanner.nextInt();
//            j=scanner.nextInt();
//            k=i/j;
//            System.out.println("k = " + k);
//        }catch (InputMismatchException | ArithmeticException ex){ //goto statement bad
//            System.out.println("Exception occurred: "+ex.getMessage());
//        }
//
//        System.out.println("Execution completed");


       //java 6

        Scanner scanner=null;
        try{
            int i, j ,k;
             scanner=new Scanner(System.in);
            i=scanner.nextInt();
            j=scanner.nextInt();
            k=i/j;
            System.out.println("k = " + k);
        }catch (InputMismatchException | ArithmeticException ex){ //goto statement bad
            System.out.println("Exception occurred: "+ex.getMessage());
        }

        if (scanner != null) {
                scanner.close();
        }

        System.out.println("Execution completed");
    }
}
