package com.session3.example10;

public final class GenericMethods {
    private GenericMethods() {
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }
}
