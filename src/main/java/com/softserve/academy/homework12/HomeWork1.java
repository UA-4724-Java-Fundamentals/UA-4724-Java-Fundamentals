package com.softserve.academy.homework12;

import java.util.Scanner;

public class HomeWork1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] srtArr = getArrayWordsFromInput();

        // Identify the longest word in the sentence and display it on the console
        String longestWord = getLongestWord(srtArr);
        System.out.println("Longest word in the sentence: " + longestWord);

        //Determine the number of letters in the longest word.
        System.out.println("Number of letters" + longestWord.length());

        //Display the second word of the sentence in reverse order on the console.
        System.out.println(new StringBuilder(srtArr[1]).reverse());
    }

    private static String[] getArrayWordsFromInput() {
        while (true) {
            try {
                System.out.print("Please enter sentence from 5 words: ");
                String str = scanner.nextLine();
                String[] strArr = str.split(" ");
                if (strArr.length != 5 && !hasEmptyStrings(strArr)) {
                    throw new IllegalArgumentException("Invalid sentence");
                }
                return strArr;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static String getLongestWord(String[] strArr) {
        String longestWord = strArr[0];
        for (String str : strArr) {
            if (str.length() > longestWord.length()) {
                longestWord = str;
            }
        }
        return longestWord;
    }

    private static Boolean hasEmptyStrings(String[] strArr) {
        boolean empty = false;
        for (String str : strArr) {
            if (str.isEmpty()) {
                empty = true;
                break;
            }
        }
        return empty;
    }
}
