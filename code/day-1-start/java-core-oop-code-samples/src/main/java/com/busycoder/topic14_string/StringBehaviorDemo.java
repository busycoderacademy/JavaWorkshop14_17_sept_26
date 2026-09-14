package com.busycoder.topic14_string;

public class StringBehaviorDemo {

    public static void main(String[] args) {
        // String literals are stored in the String Pool.
        String first = "india";
        String second = "india";

        // new String creates a distinct String object.
        String third = new String("india");

        System.out.println("first == second : " + (first == second));
        System.out.println("first == third  : " + (first == third));
        System.out.println("first.equals(third): " + first.equals(third));

        // String is immutable: concatenation creates a new String.
        String country = "paki";
        String updated = country + "stan";

        System.out.println("Original : " + country);
        System.out.println("Updated  : " + updated);

        // Common String operations.
        System.out.println("Length   : " + updated.length());
        System.out.println("Uppercase: " + updated.toUpperCase());
        System.out.println("Substring: " + updated.substring(0, 4));
        System.out.println("Replace  : " + updated.replace("paki", "indo"));

        // Always use equals() when comparing String content.
    }
}
