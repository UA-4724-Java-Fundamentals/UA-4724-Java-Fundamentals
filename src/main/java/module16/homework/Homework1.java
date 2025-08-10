package module16.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Homework1 {

    public static void main(String[] args) {
        String inputFile = "file1.txt";
        String outputFile = "file2.txt";

        try {
            Path inputPath = Paths.get(inputFile);
            List<String> lines = Files.readAllLines(inputPath);

            int numberOfLines = lines.size();
            String longestLine = "";
            if (!lines.isEmpty()) {
                longestLine = Collections.max(lines, Comparator.comparingInt(String::length));
            }

            String myInfo = "Ihor, 10.08.1995";

            List<String> outputLines = List.of(
                    "Number of lines in file1.txt: " + numberOfLines,
                    "The longest line in file1.txt: " + longestLine,
                    "My name and birthday: " + myInfo
            );

            Files.write(Paths.get(outputFile), outputLines);
            System.out.println("Task 1 completed. Check the file " + outputFile);

        } catch (IOException e) {
            // Більш детальне повідомлення про помилку
            System.err.println("Error working with files: " + e.getMessage());
            System.err.println("Please make sure the file '" + inputFile + "' exists in the project root directory.");
        }
    }
}