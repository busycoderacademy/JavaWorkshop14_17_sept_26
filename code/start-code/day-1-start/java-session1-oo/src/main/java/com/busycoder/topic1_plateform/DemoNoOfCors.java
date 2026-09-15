package com.busycoder.topic1_plateform;

public class DemoNoOfCors {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //no of cor in my machine
        Runtime runtime = Runtime.getRuntime();
        int processors = runtime.availableProcessors();
        System.out.println("Number of processors: " + processors);
    }
}
