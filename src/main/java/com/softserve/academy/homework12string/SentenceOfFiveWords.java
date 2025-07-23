package com.softserve.academy.homework12string;
import java.util.*;
import java.util.regex.*;
public class SentenceOfFiveWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence of 5 words:");
        String sentence = sc.nextLine();
        String[] words = sentence.trim().split("\\s+");
        if (words.length != 5) {
            System.out.println("Error: Please enter exactly 5 words.");
        } else {
            String longest = words[0];
            for (String word : words) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
            System.out.println("Longest word: " + longest);
            System.out.println("Length of longest word: " + longest.length());
            String secondWordReversed = String.valueOf(new StringBuilder(words[1]).reverse());
            System.out.println("Second word reversed: " + secondWordReversed);
        }
        //System.out.println("\nI  am   learning  Java   Fundamentals");
        String sentenceWithSpace = "I  am   learning  Java   Fundamentals";
        System.out.println("Sentence with space: " + sentenceWithSpace);
        //String sentenceWithSpaces = sc.nextLine();
        String normalized = sentenceWithSpace.replaceAll("\\s+", " ");
        System.out.println("Normalized sentence: " + normalized);

        System.out.println("Enter a text containing US currency:");
        String currencyText = sc.nextLine();
        Pattern p = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher m = p.matcher(currencyText);

        System.out.println("Found US currency formats:");
        boolean found = false;
        while (m.find()) {
            System.out.println("- " + m.group());
            found = true;
        }
        if (!found) {
            System.out.println("No matches found.");
        }
    }
}
