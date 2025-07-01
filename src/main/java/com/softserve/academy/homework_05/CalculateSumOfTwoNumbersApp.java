package com.softserve.academy.homework_05;

import java.util.Scanner;

// This class handles interaction with the user via the console
public class CalculateSumOfTwoNumbersApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to read user input
        String answer; // Stores the user's response for repeating the operation

        // Create an object of the class that contains the logic
        CalculateSumOfTwoNumbers calculator = new CalculateSumOfTwoNumbers();

        // Repeat the operation as long as the user answers "yes"
        do {
            // Ask the user to input the first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            // Ask the user to input the second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Call the sum method to calculate the result
            int sum = calculator.sum(num1, num2);

            // Display the result to the user
            System.out.println("Sum: " + sum);

            // Ask the user if they want to perform the operation again
            System.out.print("Do you want to perform the operation again? (yes/no): ");
            answer = scanner.next();

        } while (answer.equalsIgnoreCase("yes")); // Continue if the user types "yes"

        scanner.close();
    }
}
