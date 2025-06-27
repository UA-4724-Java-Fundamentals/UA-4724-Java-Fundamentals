package com.softserve.academy.homeworkL4;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int num1 = scanner.nextInt();

        System.out.print("Second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Third number: ");
        int num3 = scanner.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        scanner.close();
    }
}
