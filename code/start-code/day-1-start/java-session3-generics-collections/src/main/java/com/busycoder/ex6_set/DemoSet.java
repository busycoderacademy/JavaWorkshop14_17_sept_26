package com.busycoder.ex6_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Blue");
        hashSet.add("Yellow");
        hashSet.add("Green");
        hashSet.add("Red");
        hashSet.add("Yellow"); // duplicate ignored

        System.out.println("HashSet: " + hashSet);
        System.out.println("Contains Yellow? " + hashSet.contains("Yellow"));

        System.out.println();
        System.out.println("Using Iterator:");
        //iterating set

        System.out.println();

        System.out.println("Using for-each:");


        Set<String> linkedHashSet = new LinkedHashSet<>(hashSet);
        Set<String> treeSet = new TreeSet<>(hashSet);

        System.out.println();

        System.out.println();
        //Demo
        System.out.println("HashSet      -> hash table, no ordering guarantee.");
        System.out.println("LinkedHashSet -> hash table + linked list, insertion order.");
        System.out.println("TreeSet       -> sorted set using a tree.");
    }
}
