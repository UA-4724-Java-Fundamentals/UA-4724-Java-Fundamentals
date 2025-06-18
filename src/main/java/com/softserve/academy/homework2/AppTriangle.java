package com.softserve.academy.homework2;

import java.util.Scanner;

public class AppTriangle {

    public static void main (String ... args) {
        Scanner sc = new Scanner(System.in);
        int side1;
        int side2;
        int side3;
        System.out.println("Enter side 1:");
        side1 = sc.nextInt();
        System.out.println("Enter side 2:");
        side2 = sc.nextInt();
        System.out.println("Enter side 3:");
        side3 = sc.nextInt();
        Triangle triangle = new Triangle(side1, side2,side3);
        System.out.println("Square = " + triangle.getSquare());
    }
}
