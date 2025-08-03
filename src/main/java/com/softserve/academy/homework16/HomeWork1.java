package com.softserve.academy.homework16;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class HomeWork1 {
    public static void main(String[] args) throws IOException {
        String pathToFile1 = "src/main/java/com/softserve/academy/homework16/file1.txt";
        String pathToFile2 = "src/main/java/com/softserve/academy/homework16/file2.txt";
        File file1 = new File(pathToFile1);
        File file2 = new File(pathToFile2);
        file2.createNewFile();

        String[] lines = Files.readAllLines(Path.of(file1.getPath())).toArray(new String[0]);

        System.out.println(Arrays.toString(lines));

        // number of lines in file1.txt.
        Files.writeString(file2.toPath(), "" + lines.length + System.lineSeparator(), StandardOpenOption.APPEND);

        // the longest line in file1.txt.
        String longestLine = Arrays.stream(lines)
                .max(Comparator.naturalOrder())
                .orElse("");
        Files.writeString(file2.toPath(), longestLine + System.lineSeparator(), StandardOpenOption.APPEND);


        String name = "Alex";
        LocalDate date = LocalDate.of(1996, 1, 27);
        // your name and birthday date.
        Files.writeString(file2.toPath(), name + " " + date + System.lineSeparator(), StandardOpenOption.APPEND);
    }
}
