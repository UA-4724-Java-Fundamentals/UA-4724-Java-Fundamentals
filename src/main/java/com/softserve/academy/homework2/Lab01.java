package com.softserve.academy.homework2;

import java.util.Scanner;

public class Lab01 {
    double number;
    public double calculateSquareRoot() {
        double number = 1;
        return Math.sqrt(number);
    }

    public static void main (String...args) {
        double number = 144;
        double result = Math.sqrt(number);

            System.out.println("Square root of " + number + " is " + result);
        }
}


