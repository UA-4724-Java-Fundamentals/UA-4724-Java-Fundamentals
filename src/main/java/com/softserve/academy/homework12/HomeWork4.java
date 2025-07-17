package com.softserve.academy.homework12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork4 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getCorrectName();
    }

    private static void getCorrectName() {
        while (true) {
            try {
                Pattern pattern = Pattern.compile("^[A-Za-z]+([ -][A-Za-z]+)*$");
                System.out.print("Please enter your First and Last name: ");
                String input = scanner.nextLine();
                Matcher matcher = pattern.matcher(input);
                if (!matcher.find()) {
                    throw new IllegalArgumentException("Invalid input, please try again");
                }
                System.out.printf("Congratulations %s. You are successfully logged in.", input);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
