package com.busycoder.ex3_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingBasics {
    public static void main(String[] args) {
        File directory = new File("data/example3");
        File file = new File(directory, "demo.txt");

        createDirectory(directory);
        createFile(file);
        writeFile(file);
        readFile(file);
    }

    private static void createDirectory(File directory) {
        if (!directory.exists()) {
            boolean created = directory.mkdirs();
            System.out.println("Directory created: " + created);
        } else {
            System.out.println("Directory already exists: " + directory.getPath());
        }
    }

    private static void createFile(File file) {
        try {
            boolean created = file.createNewFile();
            System.out.println("File created: " + created);
        } catch (IOException exception) {
            System.out.println("Could not create file: " + exception.getMessage());
        }
    }

    private static void writeFile(File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Java is key");
            writer.newLine();
            writer.write("BufferedWriter writes text efficiently using a buffer.");
            writer.flush();
            System.out.println("File written: " + file.getPath());
        } catch (IOException exception) {
            System.out.println("Write failed: " + exception.getMessage());
        }
    }

    private static void readFile(File file) {
        System.out.println();
        System.out.println("Reading file using BufferedReader:");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\s+");

                for (String token : tokens) {
                    System.out.println(token);
                }
            }
        } catch (IOException exception) {
            System.out.println("Read failed: " + exception.getMessage());
        }
    }
}
