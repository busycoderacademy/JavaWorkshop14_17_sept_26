package com.busycoder.ex5_map;

import java.util.HashMap;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");

        System.out.println("map.get(6): " + map.get(6));
        System.out.println();

        System.out.println("Iterating using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println();
        System.out.println("Iterating using entrySet() - recommended for key/value:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
        System.out.println("Iterating using forEach():");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        System.out.println();
        System.out.println("Contains key 6: " + map.containsKey(6));
        System.out.println("Contains value 'Six': " + map.containsValue("Six"));
        System.out.println("Size: " + map.size());
    }
}
