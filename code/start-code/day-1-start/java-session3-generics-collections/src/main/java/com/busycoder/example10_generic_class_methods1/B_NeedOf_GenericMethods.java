package com.busycoder.example10_generic_class_methods1;

public final class B_NeedOf_GenericMethods {
    private B_NeedOf_GenericMethods() {
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

//    public static <T extends Comparable<T>> T max(T a, T b, T c) {
//        T max = a;
//
//        if (b.compareTo(max) > 0) {
//            max = b;
//        }
//
//        if (c.compareTo(max) > 0) {
//            max = c;
//        }
//
//        return max;
//    }
}
