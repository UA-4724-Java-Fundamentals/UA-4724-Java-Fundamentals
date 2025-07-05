package com.softserve.academy.module01.HW3;

import java.util.Scanner;

import static java.lang.System.in;

public class SmallestNum {
    public static int findSmallest(int a, int b, int c){
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
        Scanner scan = new Scanner(in);

        System.out.print("Enter number 1: ");
        int num1 = scan.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = scan.nextInt();

        int smallest = findSmallest(num1, num2, num3);
        System.out.println("Smallest number is: " + smallest);

    }
}
