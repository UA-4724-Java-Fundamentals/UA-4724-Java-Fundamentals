package com.softserve.academy.homework3;

import java.util.Scanner;

public class NunbersInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter firs number = ");
        double number1 = sc.nextDouble();
        System.out.println("Enter second number = ");
        double number2 = sc.nextDouble();
        System.out.println("Enter third number = ");
        double number3 = sc.nextDouble();

        if ((number1 >= -5 && number1 <= 5) & (number2 >= -5 && number2 <= 5) & (number3 >= -5 && number3 <= 5)) {
            System.out.println("This numbers are within in range [-5, 5]");
        } else {
            System.out.println("not all numbers belong to the range [-5, 5]");
        }
    }

}
