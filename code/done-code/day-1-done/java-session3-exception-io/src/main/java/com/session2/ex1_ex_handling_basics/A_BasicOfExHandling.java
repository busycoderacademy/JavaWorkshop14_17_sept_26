package com.session2.ex1_ex_handling_basics;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
class Car{
    void move(){
        System.out.println("Car is moving");
    }
}
public class A_BasicOfExHandling {
    public static void main(String[] args)  {
        //divideByZeroExampleWithThrows();
        System.out.println();

        checkedExceptionExample();
    }

    //if ur code may throw uncheckedException u need not not handle even u dont need to mention throws
    // private static void divideByZeroExampleWithThrows()
    private static void divideByZeroExampleWithThrows() {
            int i, j ,k;
            Scanner scanner=new Scanner(System.in);

            i=scanner.nextInt();
            j=scanner.nextInt();
            k=i/j;
            System.out.println("k = " + k);

        System.out.println("Execution completed");
    }



    private static void divideByZeroExample() {
        try{
            int i, j ,k;
            Scanner scanner=new Scanner(System.in);

            i=scanner.nextInt();
            j=scanner.nextInt();
            k=i/j;
            System.out.println("k = " + k);
        }catch (InputMismatchException ex){ //goto statement bad
            System.out.println("Please enter valid numbers");
        }
        catch (ArithmeticException ex){
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Execution completed");
    }

    private static void checkedExceptionExample() {
      //File handling example
        // i want unique words from the file
        Set<String> words=new HashSet<>();
        try{
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(new File("C:\\demo\\demo.txt")));
            //read the file and echo it
            String line=null;

            while((line=bufferedReader.readLine())!=null){
                //token of the line
                String[] tokens=line.split(" ");
                for(String token:tokens){
                    words.add(token.toLowerCase());
                }
                System.out.println(line);
            }
            //print the hashset
            for(String word: words){
                System.out.println(word);
            }

        }catch (FileNotFoundException ex){
            System.out.println("File not found");
        }
        catch(IOException ex){
            System.out.println("IO Exception");
        }
    }
}
