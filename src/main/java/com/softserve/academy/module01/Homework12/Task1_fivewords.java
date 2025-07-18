package com.softserve.academy.module01.Homework12;

import java.util.Scanner;

public class Task1_fivewords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] words = word.split(" ");
        String longestWord = " ";

        for (String w : words) {
            if (w.length() > longestWord.length()) {
                longestWord = w;
            }
        }
        System.out.println(longestWord+" "+longestWord.length()+" letters");
        System.out.println(words[words.length-2]);
    }
}
