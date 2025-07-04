package com.softserve.academy.homework08.homework;

import java.util.Arrays;
import java.util.Scanner;

public class ReadNumber {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int start = 1;
        int end = 100;
        int totalNumbers = 10;

        int[] numbers = new int[totalNumbers];

        System.out.println("Enter 10 increasing numbers ");


        for (int i = 0; i < totalNumbers; i++) {
            while (true) {
                System.out.print("Enter number " + (i + 1) + " (between " + start + " and " + end + "): ");
                try {
                    int number = readNumber(start, end);
                    numbers[i] = number;
                    start = number;

                    if ((end - start - 1) < totalNumbers) {
                        System.out.println("Impossible to enter " + (i + 1) + " increasing numbers in range (" + start + ", " + end + ")");
                        return;
                    }

                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

    }

    private static int readNumber(int start, int end) {
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            if (number <= start || number >= end) {
                throw new IllegalArgumentException("Number must be in range (" + start + ", " + end + ")");
            }
            return number;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input. Please enter a valid integer.");
        }
    }
}
