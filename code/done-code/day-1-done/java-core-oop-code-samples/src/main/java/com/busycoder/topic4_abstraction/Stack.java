package com.busycoder.topic4_abstraction;

public interface Stack {
    void push(int value);
    int pop();
    int peek();
    boolean isEmpty();
    boolean isFull();
}