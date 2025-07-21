package com.softserve.academy.homework_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USCurrencyFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text containing US currency values:");
        String input = scanner.nextLine();


        Pattern pattern = Pattern.compile("\\$(0|[1-9]\\d*)\\.\\d{2}\\b");
        Matcher matcher = pattern.matcher(input);

        System.out.println("US currency values found:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
