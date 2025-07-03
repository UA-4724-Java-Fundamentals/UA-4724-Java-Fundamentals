package com.softserve.academy.module01.Homework05;

import java.io.IOException;
import java.util.Scanner;

public class GameWithRandom {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);

        System.out.println("Please enter a number between 1 and 100");

        int number = 0;
        while (number != randomNumber) {
            try {
                number = sc.nextInt();
                sc.nextLine();

                if (number > randomNumber) {
                    System.out.println("Your number is greater than random number");
                } else if (number < randomNumber) {
                    System.out.println("Your number is less than random number");
                }
            } catch (Exception e) {
                System.out.println("Your number is not valid");
                sc.nextLine();
            }
        }

        System.out.println("You WIN!");

    }
}
