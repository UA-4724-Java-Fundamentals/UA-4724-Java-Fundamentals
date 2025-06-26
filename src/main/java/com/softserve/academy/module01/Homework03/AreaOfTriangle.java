package com.softserve.academy.module01.Homework03;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sides = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Side " + (i + 1) + ":");
            sides[i] = input.nextInt();
        }

        System.out.println("The area of the triangle is:" + areaOfTriangle(sides[0], sides[1], sides[2]));

    }

    public static double areaOfTriangle(int a, int b, int c) {
        double pivp = (a + b + c) / 2.0;
        return Math.sqrt(pivp * (pivp - a) * (pivp - b) * (pivp - c));

    }


}
