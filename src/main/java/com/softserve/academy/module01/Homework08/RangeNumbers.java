package com.softserve.academy.module01.Homework08;

import java.util.Scanner;

public class RangeNumbers {

    public static int readNumber(Scanner sc, int start, int end, int last) throws Exception {
        int number;

        try {
            number = sc.nextInt();
            sc.nextLine();

        } catch (Exception e) {
            sc.nextLine();
            throw new Exception("Please enter a number.");
        }
        if (number < start || number > end) {
            throw new Exception("Number not in range [" + start + "..." + end + "]");
        }
        if (number <= last) {
            throw new Exception("Number must be greater than last number: " + last);
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start;
        int end;
        int last;
        int[] arr = new int[10];

        System.out.println("Enter the range start: ");
        start = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the range end: ");
        end = sc.nextInt();
        sc.nextLine();
        last = start;


        for (int i = 0; i < 10; ) {
            System.out.println("Enter a number a" + (i + 1) + ":");
            try {
                arr[i] = readNumber(sc, start, end, last);
                last = arr[i];
                i++;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        for (int n : arr) {
            System.out.print(n + " ");
        }

    }
}
