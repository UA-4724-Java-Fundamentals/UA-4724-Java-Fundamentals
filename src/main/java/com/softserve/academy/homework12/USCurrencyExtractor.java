package com.softserve.academy.homework12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USCurrencyExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text with currency values (e.g., $10.99):");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\$\\d+(\\.\\d{2})");
        Matcher matcher = pattern.matcher(input);

        System.out.println("US currency values found:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

