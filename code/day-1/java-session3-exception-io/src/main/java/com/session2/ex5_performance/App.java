package com.session2.ex5_performance;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class App {
    private static final Path DATA_DIRECTORY = Path.of("data", "example5");
    private static final Path SOURCE = DATA_DIRECTORY.resolve("source.bin");
    private static final Path COPY_WITHOUT_BUFFER = DATA_DIRECTORY.resolve("copy-without-buffer.bin");
    private static final Path COPY_WITH_OWN_BUFFER = DATA_DIRECTORY.resolve("copy-with-own-buffer.bin");
    private static final Path COPY_WITH_BUFFERED_STREAMS = DATA_DIRECTORY.resolve("copy-with-buffered-streams.bin");

    public static void main(String[] args) throws IOException {
        Files.createDirectories(DATA_DIRECTORY);
        createTestFile();

        long noBufferTime = copyWithoutBuffer();
        long ownBufferTime = copyWithOwnBuffer();
        long bufferedStreamTime = copyWithBufferedStreams();

        System.out.println();
        System.out.println("=== Performance Comparison ===");
        System.out.println("Without buffer (FileInputStream + FileOutputStream): "
                + noBufferTime + " ms");
        System.out.println("With our own byte[] buffer (4 * 1024): "
                + ownBufferTime + " ms");
        System.out.println("With BufferedInputStream + BufferedOutputStream: "
                + bufferedStreamTime + " ms");

        System.out.println();
        System.out.println("Same copy operation, different I/O strategy.");
        System.out.println("Buffered streams use an internal buffer to reduce physical I/O operations.");
    }

    private static void createTestFile() throws IOException {
        if (Files.exists(SOURCE) && Files.size(SOURCE) >= 8 * 1024 * 1024) {
            return;
        }

        byte[] buffer = new byte[1024 * 1024];
        Random random = new Random(42);

        try (FileOutputStream output = new FileOutputStream(SOURCE.toFile())) {
            for (int i = 0; i < 8; i++) {
                random.nextBytes(buffer);
                output.write(buffer);
            }
        }
    }

    private static long copyWithoutBuffer() throws IOException {
        long start = System.nanoTime();

        try (FileInputStream input = new FileInputStream(SOURCE.toFile());
             FileOutputStream output = new FileOutputStream(COPY_WITHOUT_BUFFER.toFile())) {

            int byteRead;

            while ((byteRead = input.read()) != -1) {
                output.write(byteRead);
            }
        }

        return elapsedMillis(start);
    }

    private static long copyWithOwnBuffer() throws IOException {
        long start = System.nanoTime();

        try (FileInputStream input = new FileInputStream(SOURCE.toFile());
             FileOutputStream output = new FileOutputStream(COPY_WITH_OWN_BUFFER.toFile())) {

            byte[] byteBuffer = new byte[4 * 1024];
            int numberOfBytesRead;

            while ((numberOfBytesRead = input.read(byteBuffer)) != -1) {
                output.write(byteBuffer, 0, numberOfBytesRead);
            }
        }

        return elapsedMillis(start);
    }

    private static long copyWithBufferedStreams() throws IOException {
        long start = System.nanoTime();

        try (BufferedInputStream input = new BufferedInputStream(
                new FileInputStream(SOURCE.toFile()));
             BufferedOutputStream output = new BufferedOutputStream(
                     new FileOutputStream(COPY_WITH_BUFFERED_STREAMS.toFile()))) {

            int byteRead;

            while ((byteRead = input.read()) != -1) {
                output.write(byteRead);
            }
        }

        return elapsedMillis(start);
    }

    private static long elapsedMillis(long startNanos) {
        return (System.nanoTime() - startNanos) / 1_000_000;
    }
}
