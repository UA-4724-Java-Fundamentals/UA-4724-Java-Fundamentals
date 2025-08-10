package module16.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Homework2 {

    public static void main(String[] args) {
        String inputFile = "JavaCode.java";
        String outputFile = "ModifiedJavaCode.java";

        try {
            Path inputPath = Paths.get(inputFile);
            Path outputPath = Paths.get(outputFile);

            String content = Files.readString(inputPath);
            String modifiedContent = content.replaceAll("public", "private");
            Files.writeString(outputPath, modifiedContent);

            System.out.println("Task 2 completed. Check the file " + outputFile);

        } catch (IOException e) {
            System.err.println("Error working with files: " + e.getMessage());
            System.err.println("Please make sure the file '" + inputFile + "' exists in the project root directory.");
        }
    }
}
