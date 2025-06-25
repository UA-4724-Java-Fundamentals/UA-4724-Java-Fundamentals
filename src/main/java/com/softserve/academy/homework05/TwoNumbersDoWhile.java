package com.softserve.academy.homework05;

import java.util.Scanner;

public class TwoNumbersDoWhile {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String response;

        do {
            System.out.print("Please enter the first number: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Please enter the second number: ");
            int secondNumber = scanner.nextInt();
            System.out.println(getSum(firstNumber, secondNumber));

            System.out.print("Do you want to perform another operation? (yes/no): ");
            scanner.nextLine();
            response = scanner.nextLine().toLowerCase();

        }
        while (response.equals("yes"));
    }

    static int getSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

}
