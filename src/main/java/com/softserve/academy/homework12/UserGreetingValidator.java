package com.softserve.academy.homework12;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Random;

public class UserGreetingValidator {
    private static final Pattern NAME_PATTERN = Pattern.compile("^[A-Za-z\\s-]+$");
    private static final String[] GREETINGS = {
            "Hello, %s! Nice to meet you.",
            "Welcome aboard, %s!",
            "Hi there, %s! Hope you're doing well.",
            "Good day, %s! Ready to code?",
            "Greetings, %s! Let's start your journey."
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName, lastName;

        while (true) {
            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine().trim();
            if (isValidName(firstName)) break;
            System.out.println("Invalid input. Only letters, spaces, and hyphens are allowed.");
        }

        while (true) {
            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine().trim();
            if (isValidName(lastName)) break;
            System.out.println("Invalid input. Only letters, spaces, and hyphens are allowed.");
        }

        String fullName = firstName + " " + lastName;
        String greeting = GREETINGS[new Random().nextInt(GREETINGS.length)];
        System.out.printf(greeting + "%n", fullName);
    }

    private static boolean isValidName(String name) {
        return NAME_PATTERN.matcher(name).matches();
    }
}
