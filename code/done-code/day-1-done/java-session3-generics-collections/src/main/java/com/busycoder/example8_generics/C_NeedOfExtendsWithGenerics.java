package com.busycoder.example8_generics;

import java.util.ArrayList;
import java.util.List;

public class C_NeedOfExtendsWithGenerics {
    public static void main(String[] args) {
        List<Integer> intNumbers = new ArrayList<Integer>();
        intNumbers.add(1);
        intNumbers.add(2);
        //double numbers
        List<Double> doubleNumbers = new ArrayList<Double>();
        doubleNumbers.add(1.0);
        doubleNumbers.add(2.0);


    }
}
