package com.session3.ex3_performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformaceAL_LL {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(20);
        List<Integer> linkedList = new LinkedList<>();

        addAtEnd("ArrayList", arrayList);
        addAtEnd("LinkedList", linkedList);

        arrayList.add(0, 999);
        linkedList.add(0, 999);

        System.out.println("ArrayList : " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        System.out.println();
        System.out.println("ArrayList get(5)  : " + arrayList.get(5));
        System.out.println("LinkedList get(5) : " + linkedList.get(5));

        System.out.println();
        System.out.println("ArrayList is backed by a growable array.");
        System.out.println("LinkedList is a doubly linked list.");
        System.out.println("ArrayList is normally preferred for random access.");
        System.out.println("LinkedList is useful when frequent insert/remove operations fit the access pattern.");
    }

    private static void addAtEnd(String type, List<Integer> list) {
        long start = System.nanoTime();

        for (int i = 0; i < 15_000; i++) {
            list.add(i);
        }

        long end = System.nanoTime();
        System.out.println(type + " add-at-end time: " + (end - start) / 1_000_000.0 + " ms");
    }
}
