package com.session3.example10;

public class GenericStack<E> {
    private final int size;
    private int top;
    private final E[] elements;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public GenericStack(int size) {
        this.size = size > 0 ? size : 10;
        this.top = -1;
        this.elements = (E[]) new Object[this.size];
    }

    public void push(E pushValue) {
        if (top < size - 1) {
            elements[++top] = pushValue;
        }
    }

    public E pop() {
        if (top > -1) {
            E value = elements[top];
            elements[top--] = null;
            return value;
        }
        return null;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
