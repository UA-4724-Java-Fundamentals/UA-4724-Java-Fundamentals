package com.softserve.academy.homework4;

import java.util.Scanner;

public class SumProductNumber {
    static int[] numbers = new int[10];
    public static void main(String[] args) {
        boolean positive = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 inger numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            int number = sc.nextInt();
            if (i <=4 ) positive = number > 0;
            numbers[i] = number;
        }
        int sum = 0;
        if (positive) {
            for (int i = 0; i < 5; i++) {
                sum += numbers[i];
            }
        } else {
            sum = 1;
            for (int i = 5; i < numbers.length; i++) {
                sum *= numbers[i];
            }
        }
        System.out.println("Result = " + sum);
    }
}
