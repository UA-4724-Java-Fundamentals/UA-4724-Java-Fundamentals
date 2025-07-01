package com.softserve.academy.homework_05;

import java.util.Scanner;

/**
 * This is the main class that interacts with the user
 * and displays the number of days in a selected month.
 */
public class MonthDaysCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a number from 1 to 12
        System.out.print("Enter the number of the month (1-12): ");
        int monthNumber = scanner.nextInt();

        // Create an instance of MonthDaysCalculator
        MonthDaysCalculator calculator = new MonthDaysCalculator();

        // Call method to get number of days
        int days = calculator.getDaysInMonth(monthNumber);

        // Display result or error
        if (days != -1) {
            System.out.println("Number of days: " + days);
        } else {
            System.out.println("Invalid month number.");
        }

        scanner.close();
    }
}
