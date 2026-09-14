package com.session2.ex4_bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class App {
    public static void main(String[] args) throws IOException {
        byteStreamExample();
        System.out.println();

        characterStreamExample();
        System.out.println();

        layeredStreamExample();
    }

    private static void byteStreamExample() throws IOException {
        System.out.println("=== Byte-Based I/O ===");

        byte[] inputData = "hello".getBytes(StandardCharsets.UTF_8);

        try (InputStream input = new ByteArrayInputStream(inputData);
             ByteArrayOutputStream output = new ByteArrayOutputStream()) {

            int value;

            while ((value = input.read()) != -1) {
                output.write(value);
            }

            System.out.println("Byte stream output: "
                    + output.toString(StandardCharsets.UTF_8));
        }
    }

    private static void characterStreamExample() throws IOException {
        System.out.println("=== Character-Based I/O ===");

        try (Reader reader = new StringReader("hello");
             Writer writer = new StringWriter()) {

            int value;

            while ((value = reader.read()) != -1) {
                writer.write(value);
            }

            System.out.println("Character stream output: " + writer);
        }

        System.out.println("InputStreamReader converts bytes to characters.");
        System.out.println("BufferedReader reads character data efficiently.");
    }

    private static void layeredStreamExample() throws IOException {
        System.out.println("=== Layered / Chained Streams ===");

        byte[] inputData = "Java I/O stream chaining".getBytes(StandardCharsets.UTF_8);

        try (InputStream input = new BufferedInputStream(
                new ByteArrayInputStream(inputData));
             ByteArrayOutputStream rawOutput = new ByteArrayOutputStream();
             var output = new BufferedOutputStream(rawOutput)) {

            int value;

            while ((value = input.read()) != -1) {
                output.write(value);
            }

            output.flush();

            System.out.println("Buffered stream output: "
                    + rawOutput.toString(StandardCharsets.UTF_8));
        }

        dataStreamExample();
    }

    private static void dataStreamExample() throws IOException {
        System.out.println();
        System.out.println("=== BufferedInputStream + DataInputStream ===");

        ByteArrayOutputStream bytes = new ByteArrayOutputStream();

        try (DataOutputStream dataOutput = new DataOutputStream(
                new BufferedOutputStream(bytes))) {
            dataOutput.writeInt(100);
            dataOutput.writeDouble(99.50);
            dataOutput.writeUTF("Java");
        }

        try (DataInputStream dataInput = new DataInputStream(
                new BufferedInputStream(
                        new ByteArrayInputStream(bytes.toByteArray())))) {

            System.out.println("int    : " + dataInput.readInt());
            System.out.println("double : " + dataInput.readDouble());
            System.out.println("String : " + dataInput.readUTF());
        }
    }
}
