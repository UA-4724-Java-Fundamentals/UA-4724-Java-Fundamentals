package com.softserve.academy.homework08;

import java.util.Scanner;

public class RangeInputTask {
    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a number between " + start + " and " + end + ": ");
                String input = scanner.nextLine();
                int number = Integer.parseInt(input);

                if (number <= start || number >= end) {
                    throw new IllegalArgumentException("Number must be strictly between " + start + " and " + end + ".");
                }
                return number;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid integer.");
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int start = 1;
        int end = 100;

        try {
            System.out.println("Enter 10 strictly increasing numbers between 1 and 100:");
            for (int i = 0; i < 10; i++) {
                while (true) {
                    try {
                        numbers[i] = readNumber(start, end);
                        start = numbers[i];
                        break;
                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                }
            }

            System.out.println("You entered the numbers in strictly increasing order:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        } finally {
            scanner.close();
        }
    }
}
