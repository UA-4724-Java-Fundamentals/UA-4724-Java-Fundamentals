package com.softserve.academy.module01.Homework04;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println("Max=" + Math.max(a, Math.max(b, c)) + " Min=" + Math.min(a, Math.min(b, c)));
    }
}
