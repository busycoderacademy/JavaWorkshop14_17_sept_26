package com.session2.ex5_performance;

import java.io.*;

public class CopyPhotoWithBufferedStreams {
    public static void main(String[] args) throws IOException {
        BufferedInputStream fis = new BufferedInputStream
                (new FileInputStream("c://demo//mali.jpg"));

        BufferedOutputStream fos = new BufferedOutputStream
                (new FileOutputStream("c://demo//mali_copy2.jpg"));
        long start = System.nanoTime();
        int byteRead = 1;
        while ((byteRead = fis.read()) != -1) {
            fos.write(byteRead);
        }
        fis.close();
        fos.close();
        long end = System.nanoTime();
        System.out.println("time taken: " + (end - start) + " ns");
    }
}
