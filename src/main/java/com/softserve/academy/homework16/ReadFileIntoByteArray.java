package com.softserve.academy.homework16;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReadFileIntoByteArray {
    public static void main(String[] args) {
        String pathToFile = "src/main/java/com/softserve/academy/homework16/GetFileSize.java";
        File file = new File(pathToFile);
        if (file.isFile()) {
            try {
                byte[] bytes = Files.readAllBytes(file.toPath());
                System.out.println("File read. Bytes count: " + bytes.length);
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("File not found or not a regular file.");
        }
    }
}
