package com.busycoder.ex2_intro_collections;

import java.util.*;

public class IntroductionToJavaCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        Collections.sort(list);
        int index=Collections.binarySearch(list, "zoo");
        System.out.println(index);
        System.out.println(list);
//        Set<String> set = new HashSet<>();
//        set.add("Java");
//        set.add("Java");
//        set.add("AWS");
//
//        Map<Integer, String> map = new HashMap<>();
//        map.put(101, "Amit");
//        map.put(102, "Vijay");
//
//        PriorityQueue<String> queue = new PriorityQueue<>();
//        queue.offer("Task-1");
//        queue.offer("Task-2");
//
//        System.out.println("List  : " + list);
//        System.out.println("Set   : " + set);
//        System.out.println("Map   : " + map);
//        System.out.println("Queue : " + queue);
//
//        System.out.println();
//        System.out.println("List sorted using Collections.sort():");
//
//        System.out.println(list);
    }
}
