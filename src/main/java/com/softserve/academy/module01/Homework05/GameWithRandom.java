package com.softserve.academy.module01.Homework05;

import java.util.Scanner;

public class GameWithRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);

        System.out.println("Please enter a number between 1 and 100");

        int number = 0;
        while (number != randomNumber) {
            number = sc.nextInt();
            sc.nextLine();

            if (number > randomNumber) {
                System.out.println("Your number is greater than random number");
            } else if (number < randomNumber) {
                System.out.println("Your number is less than random number");
            }
        }
        System.out.println("You WIN!");

    }
}
