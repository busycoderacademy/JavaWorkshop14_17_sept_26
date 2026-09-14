package com.busycoder.topic4_abstraction;

public class NeedOfAbstraction {
    public static void main(String[] args) {
        //Using ravi stack,
        Stack stack = new StackImplArray(10);
        stack.push(33);
        System.out.println(stack.pop());


    }
}
