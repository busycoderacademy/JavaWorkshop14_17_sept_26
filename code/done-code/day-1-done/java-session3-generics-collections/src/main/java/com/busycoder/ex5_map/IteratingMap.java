package com.busycoder.ex5_map;

import java.util.*;

//that u should avoide user define key: String or Integer etc
//but if u want to use user define key then make sure it is Immutable
//if we want to sort diff i must i must not chage the key class or it obect
//i should create comparator
class KeyRevSort implements Comparator<Key>{
    @Override
    public int compare(Key o1, Key o2) {
        return Integer.compare(o2.getK(), o1.getK());
    }
}
class Key implements Comparable<Key>{
    int k;
    public Key(int k) {
        this.k = k;
    }
    public int getK() {
        return k;
    }
    public void setK(int k) {
        this.k = k;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Key key = (Key) object;
        return k == key.k;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(k);
    }

    @Override
    public int compareTo(Key o) {
        return Integer.compare(this.k, o.k);
    }

    @Override
    public String toString() {
        return "Key{" +
                "k=" + k +
                '}';
    }
}
public class IteratingMap {
    public static void main(String[] args) {
        //Question : why hell i should give due respect to hashcode
        //Answer : because it is used by the map to store and retrieve the values
        // let we take a user defined key
    //hey u expect me to arrange it into aka balance BT but tell me how
        //key class must impl comparble
        //but my key class is not implemetion comparable--> ClassCastExcetion :
        Map<Key, Integer> map = new TreeMap<>(new KeyRevSort());
       final Key k1=new Key(5);
        map.put(k1, 5);
        k1.setK(60);


        map.put(new Key(8), 8);
        map.put(new Key(6), 6);
        map.put(new Key(4), 4);
        map.put(new Key(2), 2);

//        System.out.println(map);
        System.out.println(map.containsKey(new Key(5)));




//        Map<Key, Integer> map = new HashMap<>();
//        map.put(new Key(5), 5);
//        map.put(new Key(8), 8);
//        map.put(new Key(6), 6);
//        map.put(new Key(4), 4);
//        map.put(new Key(2), 2);
//
//        System.out.println(map.containsKey(new Key(5)));


//        Map<String, Integer> map = new HashMap<>();
//        map.put("Five", 5);//Five has a hashcode 5655%16=15
//        map.put("Eight", 8);// 64656%16=8
//        map.put("Six", 6);//13243%16=13
//        map.put("Four", 4);//566%12=10
//        map.put("Two", 2);//287686%16=10

        //how to print map
        //key set vs entryset

//        map.entrySet()
//                .forEach(entry-> System.out.println(entry.getKey() + " -> " + entry.getValue()));

//        for(Map.Entry<String, Integer> entry: map.entrySet()){
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }


//        for(String key: map.keySet()){
//            System.out.println(key + " -> " + map.get(key));
//        }


//        Map<Integer, String> map = new HashMap<>();
//
//        map.put(5, "Five");
//        map.put(8, "Eight");
//        map.put(6, "Six");
//        map.put(4, "Four");
//        map.put(2, "Two");
//
//        System.out.println("map.get(6): " + map.get(6));
//        System.out.println();
//
//        System.out.println("Iterating using keySet():");
//        for (Integer key : map.keySet()) {
//            System.out.println(key + " -> " + map.get(key));
//        }
//
//        System.out.println();
//        System.out.println("Iterating using entrySet() - recommended for key/value:");
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
//
//        System.out.println();
//        System.out.println("Iterating using forEach():");
//        map.forEach((key, value) -> System.out.println(key + " -> " + value));
//
//        System.out.println();
//        System.out.println("Contains key 6: " + map.containsKey(6));
//        System.out.println("Contains value 'Six': " + map.containsValue("Six"));
//        System.out.println("Size: " + map.size());
    }
}
