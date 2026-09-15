package com.busycoder.example10_generic_class_methods1;
/*
elements = new T[size];   //  Compile-time error
Java doesn't allow this because T is a type parameter,
and at runtime Java uses type erasure. The actual type of T is not known when the array is created.

class Stack<T> {

    private T[] elements;
    private int top = -1;

    public Stack(int size) {
        elements = (T[]) new Object[size];
    }

    public void push(T value) {
        elements[++top] = value;
    }

    public T pop() {
        return elements[top--];
    }
}
 */
class Stack {

    private int[] elements;
    private int top = -1;

    public Stack(int size) {
        elements = new int[size];
    }

    public void push(int value) {
        elements[++top] = value;
    }

    public int pop() {
        return elements[top--];
    }
}
public class C_Generic_Stack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
