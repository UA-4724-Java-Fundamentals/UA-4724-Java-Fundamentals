package com.softserve.academy.homework_04;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first numbers: ");
        int number1 = scanner.nextInt();

        System.out.print("Please enter second numbers: ");
        int number2 = scanner.nextInt();

        System.out.print("Please enter third numbers: ");
        int number3 = scanner.nextInt();

        // Check if all numbers are equal
        if ((number1 == number2) && (number2 == number3)) {
            System.out.println("All three numbers are equal: " + number1);
            return;
        }


        // Finding max
        int max = number1;


        if (number2 > max) {
            max = number2;
        }

        if (number3 > max) {
            max = number3;
        }

        // Finding min
        int min = number1;


        if (number2 < min) {
            min = number2;
        }

        if (number3 < min) {
            min = number3;
        }

        // Flags to control whether default messages will be printed
        boolean printedMaxMessage = false;
        boolean printedMinMessage = false;

       // Check equal max values

        if (number1 == max) {
            if (number1 == number2) {
                System.out.println("The number1 and number2 are equals: " + max + " and are the highest");
                printedMaxMessage = true;
            }
            if (number1 == number3) {
                System.out.println("The number1 and number3 are equals: " + max + " and are the highest");
                printedMaxMessage = true;

            }
        }


        if ((number2 == number3) && (number2 == max)) {
            System.out.println("The number2 and number3 are equals: " + max + " and are the highest");
            printedMaxMessage = true;
        }

        // Check equal min values
        if (number1 == min) {
            if (number1 == number2) {
                System.out.println("The number1 and number2 are equals: " + min + " and are the lowest");
                printedMinMessage = true;
            }
            if (number1 == number3) {
                System.out.println("The number1 and number3 are equals: " + min + " and are the lowest");
                printedMinMessage = true;

            }
        }


        if ((number2 == number3) && (number2 == min)) {
            System.out.println("The number2 and number3 are equals: " + min + " and are the lowest");
            printedMinMessage = true;
        }







        // Print if nothing was printed yet
        if (!printedMinMessage) {
            System.out.println("The min: " + min + " is the lowest");
        }

        if (!printedMaxMessage) {
            System.out.println("The max: " + max + " is the highest");
        }

    }
}
