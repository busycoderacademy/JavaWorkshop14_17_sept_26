package com.busycoder.topic2_basics;

/**
 * The smallest useful Java program.
 */
public class A_HelloWorld {

    public static void main(String[] args) {
        // main is the entry point used by the JVM to start this program.
//        System.out.println("Welcome to the world of Java!");
        /*
            this is multilie comment
            annther line
         */
        //create a array and print the data
        // ref  stack         data heap
        int[] numbers = {1, 2, 3, 4, 5};

//        for(int i=0; i<=numbers.length; i++){
            numbers[0]=1;
//            System.out.println(numbers[i]);
//        }

        // enhanced for loop
       for(int number: numbers){
           System.out.println(number);
       }


    }
}
