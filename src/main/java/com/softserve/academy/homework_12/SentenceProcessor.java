package com.softserve.academy.homework_12;

import java.util.Scanner;

public class SentenceProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with five words:");
        String sentence = scanner.nextLine();

        String[]words = sentence.split(" ");

        if (words.length != 5) {
            System.out.println("Error: You must enter exactly five words. Please try again.");
            scanner.close();
            return;
        }

        String longestWord = "";
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }
        System.out.println("The longest word: " + longestWord);
        System.out.println("Length of the longest word: " + maxLength);

        String secondWord = words[1];
        String secondWordReversed = new StringBuilder(secondWord).reverse().toString();
        System.out.println("Second word reversed: " + secondWordReversed);

        scanner.close();

    }
}
