package com.softserve.academy.homework_04;

import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first numbers: ");
        double number1 = scanner.nextDouble();

        System.out.print("Please enter second numbers: ");
        double number2 = scanner.nextDouble();

        System.out.print("Please enter third numbers: ");
        double number3 = scanner.nextDouble();

        if ((number1 >= -5) && (number1 <= 5) && ((number2 >= -5) && (number2 <= 5)) && ((number3 >= -5) && (number3 <= 5))) {
            System.out.println("All numbers are in range [-5, 5]");
        } else {
            System.out.println("Not all numbers are in range [-5, 5]");
        }

    }


}

