package module12.homework;

import java.util.Random;
import java.util.Scanner;

public class hwTask4 {


    public class NameValidator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Regex to allow uppercase/lowercase English letters, spaces, and hyphens.
            String nameRegex = "^[a-zA-Z -]+$";
            String name;

            // Loop until valid input is received
            do {
                System.out.print("Please enter your first and last name: ");
                name = scanner.nextLine();
                if (!name.matches(nameRegex)) {
                    System.out.println("Invalid input. Please use only English letters, spaces, and hyphens.");
                }
            } while (!name.matches(nameRegex));

            System.out.println("Thank you! Your name is valid.");

            // Generate a random greeting
            String[] greetings = {
                    "Hello, %s! It's a pleasure to meet you.",
                    "Greetings, %s! Hope you have a wonderful day.",
                    "Welcome, %s! We are glad you are here.",
                    "A very good day to you, %s!"
            };

            Random random = new Random();
            int randomIndex = random.nextInt(greetings.length);
            String randomGreeting = greetings[randomIndex];

            // Print the formatted greeting
            System.out.printf(randomGreeting, name);

            scanner.close();
        }
    }
}
