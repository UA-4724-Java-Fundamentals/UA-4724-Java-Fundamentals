package com.softserve.academy.homework_08;

import java.util.Scanner;


public class NumberReader {


    public static int readNumber(int start, int end) throws Exception {
        Scanner scanner = new Scanner(System.in);  // Create scanner for reading input

        String input = scanner.nextLine();         // Read user input as a string
        int number;

        try {
            number = Integer.parseInt(input);      // Try to convert the input to an integer
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input: Not a number.");
        }

        // Check if the number is outside the allowed range
        if (number <= start || number >= end) {
            throw new IllegalArgumentException("Invalid input: Number must be between " + start + " and " + end + ".");
        }

        return number;  // Return valid number
    }
}
