package com.softserve.academy.homework_03;

import java.util.Scanner;

public class CompareNumbersApp {


    public static int getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int number1 = getNumber(scanner, "Enter number1: ");
        int number2 = getNumber(scanner, "Enter number2: ");
        int number3 = getNumber(scanner, "Enter number3: ");

        CompareNumbers compare = new CompareNumbers(number1, number2, number3);
        int smallest = compare.findSmallest();

        System.out.println("The smallest number is: " + smallest);



    }

}
