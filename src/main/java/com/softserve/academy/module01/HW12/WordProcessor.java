package com.softserve.academy.module01.HW12;

import java.util.Scanner;

public class WordProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть речення із п'яти слів: ");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");

        if (words.length != 5) {
            System.out.println("Помилка: потрібно ввести 5 слів.");
            return;
        }

        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Найдовше слово: " + longestWord);
        System.out.println("Кількість літер у ньому: " + longestWord.length());

        String secondWord = words[1];
        String reversedSecond = new StringBuilder(secondWord).reverse().toString();
        System.out.println("Друге слово у зворотному порядку: " + reversedSecond);
    }
}
