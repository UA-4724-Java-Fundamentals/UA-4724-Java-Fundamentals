package com.softserve.academy.homework03;

import java.util.Scanner;

public class SmallestNumberFinder {

    public static int findSmallest(int x, int y, int z) {
        return Math.min(x, Math.min(y, z));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Smallest Number Finder ===");
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();

        int smallest = findSmallest(num1, num2, num3);
        System.out.println("The smallest number is " + smallest);

        scanner.close();
    }
}
