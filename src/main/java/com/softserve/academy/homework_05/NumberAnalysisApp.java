package com.softserve.academy.homework_05;

import java.util.Scanner;

public class NumberAnalysisApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        NumberAnalysis analysis = new NumberAnalysis(numbers);


        int secondPositivePos = analysis.findSecondPositive();
        int[] minAndIndex = analysis.findMinAndIndex();
        int evenProduct = analysis.calculateEvenProduct();

        if (secondPositivePos != -1) {
            System.out.println("Position of second positive number: " + secondPositivePos);
        } else {
            System.out.println("Second positive number not found.");
        }

        System.out.println("Minimum value: " + minAndIndex[0] + ", at position: " + minAndIndex[1]);
        System.out.println("Product of even numbers (excluding zero): " + evenProduct);

        scanner.close();
    }
}