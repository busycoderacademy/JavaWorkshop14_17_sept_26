package com.busycoder.topic4_abstraction;

public class RaviStack {

    private int[] elements;
    private int top = -1;

    public RaviStack(int capacity) {
        elements = new int[capacity];
    }

    // Add an element to the top of the stack
    public void push(int value) {
        if (top == elements.length - 1) {
            throw new IllegalStateException("Stack is full");
        }

        elements[++top] = value;
    }

    // Remove and return the top element
    public int pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }

        return elements[top--];
    }

    // Return the top element without removing it
    public int peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }

        return elements[top];
    }

    // Check whether stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check whether stack is full
    public boolean isFull() {
        return top == elements.length - 1;
    }
}
