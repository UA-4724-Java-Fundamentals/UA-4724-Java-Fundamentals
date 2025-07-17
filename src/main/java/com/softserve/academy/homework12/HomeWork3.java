package com.softserve.academy.homework12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter prices for example $12.34 or $0.5:");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\$[0-9]+\\.[0-9]{1,2}");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Finded: " + matcher.group());
        }
    }
}
