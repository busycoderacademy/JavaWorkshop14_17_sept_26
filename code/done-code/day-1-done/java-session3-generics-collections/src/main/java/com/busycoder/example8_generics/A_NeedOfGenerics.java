package com.busycoder.example8_generics;
import  java.util.*;
public class A_NeedOfGenerics {
    public static void main(String[] args) {
        List list = new ArrayList(); // Raw type: legacy style.
        list.add("foo");
        list.add(22);

        System.out.println("Raw list: " + list);

        List<String> stringList = new ArrayList<>();
        stringList.add("foo");
        stringList.add("bar");

        System.out.println("Generic list: " + stringList);

        // stringList.add(22); // Compile-time error.

        for (String value : stringList) {
            System.out.println(value);
        }
    }
}
