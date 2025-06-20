package com.softserve.academy.homeworkL3;

import java.util.Scanner;

public class SmallestNumber {
    public static int findSmallest(int a, int b, int c) {
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int first1 = scanner.nextInt();

        System.out.println("Input the second number: ");
        int second2 = scanner.nextInt();
        System.out.println("Input the third number: ");
        int third3 = scanner.nextInt();

        int smallest = findSmallest(first1, second2, third3);
        System.out.println("Smallest number: " + smallest);
    }
}
