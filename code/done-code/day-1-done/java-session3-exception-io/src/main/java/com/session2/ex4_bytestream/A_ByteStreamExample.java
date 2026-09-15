package com.session2.ex4_bytestream;

import java.io.*;

/*
What happens:

Reads 1 byte at a time
Writes 1 byte at a time
Simple, but usually slow for large files.
 */
public class A_ByteStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/raj/Desktop/photo/mali.jpg");
        FileOutputStream fos = new FileOutputStream("/home/raj/Desktop/photo/mali_copy.jpg");

        long start = System.currentTimeMillis();
        int byteRead = 1;
        while ((byteRead = fis.read()) != -1) {
            fos.write(byteRead);
        }
        fis.close();
        fos.close();
        long end = System.currentTimeMillis();

        System.out.println("time taken: " + (end - start) + " ms");
    }
}
