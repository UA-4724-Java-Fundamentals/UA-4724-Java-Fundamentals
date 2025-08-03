package com.softserve.academy.homework16;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class PracticalTask1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/com/softserve/academy/homework16/mytext.txt");
        String[] lines = Files.readAllLines(Path.of(file.getPath())).toArray(new String[0]);

        // count and write the number of symbols in every line
        Arrays.stream(lines).map(String::length).forEach(System.out::println);

        // find the longest and the shortest line.
        String maxLine = Arrays.stream(lines).max(Comparator.naturalOrder()).toString();
        System.out.println(maxLine);
        String minLine = Arrays.stream(lines).min(Comparator.naturalOrder()).toString();
        System.out.println(minLine);

        // find and write only that lines, which consist of word «var»
        Arrays.stream(lines).filter(line -> line.contains("var")).forEach(System.out::println);

        // find and output to the console all words starting with a vowel.
        Arrays.stream(lines)
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .filter(word -> word.startsWith("vowel"))
                .forEach(System.out::println);

        // find and output to the console all words for which the last letter of one word
        //matches the first letter of the next word.

        String[] strings = Arrays.stream(lines)
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .filter(s -> !s.isEmpty())
                .map(s -> s.replaceAll("[^a-zA-Z]", ""))
                .toArray(String[]::new);

        for (int i = 0; i < strings.length - 1; i++) {
            String current = strings[i].toLowerCase();
            String next = strings[i + 1].toLowerCase();
            if (current.endsWith(next.substring(0, 1))) {
                System.out.println(strings[i]);
            }
        }
    }
}
