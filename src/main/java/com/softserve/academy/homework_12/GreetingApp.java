package com.softserve.academy.homework_12;

import java.util.Scanner;
import java.util.Random;

public class GreetingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        String lastName = "";



        String nameRegex = "^[a-zA-Z\\s-]+$";

        while (true) {
            System.out.print("Enter your first and last name: ");
            String fullName = scanner.nextLine().trim();


            String[] parts = fullName.split("\\s+");

            if (parts.length >= 2) {
                firstName = parts[0];
                lastName = parts[1];

                if (firstName.matches(nameRegex) && lastName.matches(nameRegex)) {
                    break;
                }
            }

            System.out.println("Invalid input. Please enter two valid names using only English letters, spaces, and hyphens.");
        }





        String[] greetings = {
                "Hello, %s %s!",
                "Nice to meet you, %s %s!",
                "Hi, %s %s! How are you today?",
                "Cheers, %s %s! Let's catch up.",
                "Welcome, %s %s! Glad you joined."
        };


        Random random = new Random();
        int index = random.nextInt(greetings.length);


        System.out.printf(greetings[index] + "%n", firstName, lastName);
    }
}
