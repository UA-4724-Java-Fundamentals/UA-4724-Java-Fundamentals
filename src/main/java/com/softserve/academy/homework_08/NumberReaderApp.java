package com.softserve.academy.homework_08;

public class NumberReaderApp {
    public static void main(String[] args) {
        int[] numbers = new int[10];   // array for 10 numbers
        int start = 1;                 // lower bound
        int end = 100;                 // upper bound

        for (int i = 0; i < 10; ) {
            try {
                System.out.print("Enter number " + (i + 1) + " (>" + start + " and <" + end + "): ");
                int num = NumberReader.readNumber(start, end);

                // Check that numbers are strictly increasing
                if (i > 0 && num <= numbers[i - 1]) {
                    System.out.println("Error: Number must be greater than previous number (" + numbers[i - 1] + "). Try again.");
                    continue;  // ask for the same number again
                }

                numbers[i] = num;
                start = num;  // update lower bound for the next number
                i++;          // move to the next number

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + " Please try again.");
            }
        }

        // Print the entered numbers
        System.out.println("You entered valid numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
