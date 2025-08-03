package com.softserve.academy.homework16;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class FindLongestWordInFile {
    public static void main(String[] args) {
        String pathToFile = "src/main/java/com/softserve/academy/homework16/GetFileSize.java";
        File file = new File(pathToFile);
        if (file.isFile()) {
            try (Stream<String> stream = Files.lines(file.toPath())) {
                Optional<String> longestWord = stream
                        .flatMap(line -> Arrays.stream(line.trim().split("\\W+")))
                        .filter(word -> !word.isEmpty())
                        .max(Comparator.comparingInt(String::length));

                longestWord.ifPresent(word -> System.out.println("Longest word: " + word));
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("File not found or not a regular file.");
        }
    }
}
