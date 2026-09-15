package com.session2.ex5_performance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
What happens:

Creates a 4 KB buffer
Reads a block of bytes into the buffer
Writes the whole block
Much more efficient than reading one byte at a time.
 */
public class Copying_Photo_Using_Own_Buffer {

    public static void main(String[] args) throws IOException {
        // time taken: buffer
         // time taken: 1 ms

        FileInputStream fis = new FileInputStream("/home/raj/Desktop/photo/mali.jpg");
        FileOutputStream fos = new FileOutputStream("/home/raj/Desktop/photo/mali_copy.jpg");

        long start = System.nanoTime();

        byte[] byteBuffer = new byte[4 * 1024];

        int numberOfByteRead = 1;

        while ((numberOfByteRead = fis.read(byteBuffer)) != -1) {
            fos.write(byteBuffer, 0, numberOfByteRead);
        }

        fis.close();
        fos.close();

        long end = System.nanoTime();

        System.out.println("time taken: " + (end - start) + " ms");
    }
}
