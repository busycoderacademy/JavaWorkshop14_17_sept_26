package com.session2.ex5_performance;

import java.io.*;

public class CopyPhotoWithBufferedStreams {
    public static void main(String[] args) throws IOException {
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("/home/raj/Desktop/photo/mali.jpg"));

        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("/home/raj/Desktop/photo/mali_copy.jpg"));
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
