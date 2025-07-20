package com.softserve.academy.homework12;

import java.util.Scanner;
import java.util.Arrays;

public class SentenceAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence with exactly five words:");
        String input = scanner.nextLine().trim();
        String[] words = input.split("\\s+");

        if (words.length != 5) {
            System.out.println("Error: Please enter exactly five words.");
            return;
        }

        String longestWord = Arrays.stream(words)
                .max((a, b) -> Integer.compare(a.length(), b.length()))
                .orElse("");
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + longestWord.length());

        String secondWordReversed = new StringBuilder(words[1]).reverse().toString();
        System.out.println("Second word reversed: " + secondWordReversed);
    }
}
