package com.softserve.academy.homework_12;

import java.util.Scanner;

public class NormalizeSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with extra spaces:");
        String originalSentence = scanner.nextLine();

        String normalizedSentence = originalSentence.trim().replaceAll("\\s+", " ");

        System.out.println("Original sentence: " + "'" + originalSentence + "'");
        System.out.println("Normalized sentence: " + "'" + normalizedSentence + "'");
        scanner.close();
    }
}
