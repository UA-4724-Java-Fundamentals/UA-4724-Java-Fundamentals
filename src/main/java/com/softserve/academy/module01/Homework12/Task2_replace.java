package com.softserve.academy.module01.Homework12;

import java.util.Scanner;

public class Task2_replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();

        sentence = sentence.replaceAll("\\s+", " ").trim();
        System.out.println(sentence);

    }
}
