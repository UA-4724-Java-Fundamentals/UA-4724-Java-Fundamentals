package com.softserve.academy.homework3;

import java.util.Scanner;

public class NumberMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firs number = ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number = ");
        int number2 = sc.nextInt();
        System.out.println("Enter third number = ");
        int number3 = sc.nextInt();
        findMax(number1, number2, number3);
        findMin(number1, number2, number3);
    }

    private static void findMin(int ... numbers) {
        int min = numbers[0];
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            i++;
        }
        System.out.println("Minimum value is " + min);
    }

    private static void findMax(int ... numbers) {
        int max = numbers[0];
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            i++;
        }
        System.out.println("Maximum value is " + max);
    }

}
