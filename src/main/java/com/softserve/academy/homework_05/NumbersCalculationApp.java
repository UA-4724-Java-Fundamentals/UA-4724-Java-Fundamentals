package com.softserve.academy.homework_05;

import java.util.Scanner;

public class NumbersCalculationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Read 10 integers from user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            numbers[i] = scanner.nextInt();
        }

        NumbersCalculation calc = new NumbersCalculation();

        // Use shared method to check positivity
        boolean allPositive = calc.isFirstFivePositive(numbers);

        int result = calc.process(numbers);

        if (allPositive) {
            System.out.println("The sum of the first 5 elements is: " + result);
        } else {
            System.out.println("The product of the last 5 elements is: " + result);
        }

        scanner.close();
    }
}
