package com.busycoder.topic1_plateform;

/**
 * Demonstrates the relationship between Java source code and the Java runtime.
 *
 * The slide describes Java as a language + JVM + rich libraries.
 * This program does not implement the JVM; it simply lets us inspect the
 * runtime environment in which Java code executes.
 */
public class JavaPlatformOverview {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println("Java version : " + System.getProperty("java.version"));
        System.out.println("JVM vendor   : " + System.getProperty("java.vm.vendor"));
        System.out.println("JVM name     : " + System.getProperty("java.vm.name"));
        System.out.println("OS           : " + System.getProperty("os.name"));
        System.out.println("Available CPU: " + runtime.availableProcessors());

        // The same Java bytecode can run on different operating systems
        // as long as a compatible JVM is available.
    }
}
