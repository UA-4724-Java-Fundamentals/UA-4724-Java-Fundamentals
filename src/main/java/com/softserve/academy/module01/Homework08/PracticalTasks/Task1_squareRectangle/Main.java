package com.softserve.academy.module01.Homework08.PracticalTasks.Task1_squareRectangle;

import java.util.Scanner;

public class Main {
    public static int squareRectangle(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Negative values");
        }
        return a * b;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the size of the rectangle");
        try {
            a = Integer.parseInt(sc.nextLine());
            b = Integer.parseInt(sc.nextLine());

            int square = squareRectangle(a, b);
            System.out.println("Square:" + square);

        } catch (NumberFormatException e) {
            System.out.println("Error " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
