package com.softserve.academy.homework16;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ReadFirst3LinesOfFile {
    public static void main(String[] args) {
        String pathToFile = "src/main/java/com/softserve/academy/homework16/GetFileSize.java";
        File file = new File(pathToFile);
        if (file.isFile()) {
            try (Stream<String> stream = Files.lines(file.toPath())) {
                stream.limit(3).forEach(System.out::println);
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("File not found or not a regular file.");
        }
    }
}
