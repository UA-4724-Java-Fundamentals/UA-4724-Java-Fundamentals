package com.softserve.academy.module01.Homework04;

import java.util.Scanner;

public class NumbersWithin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = -5;
        int b = 5;

        System.out.print("Enter 3 number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 >= a && num1 <= b && num2 >= a && num2 <= b && num3 >= a || num3 <= b) {
            System.out.println("The numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }
}
