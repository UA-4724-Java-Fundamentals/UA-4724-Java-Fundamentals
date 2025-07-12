package com.softserve.academy.homework05;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = random.nextInt(100) + 1;
        int guess;

        System.out.println("Guess the number between 1 and 100");

        do {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();

            if (guess > numberToGuess) {
                System.out.println("Too high, try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Correct! You guessed it.");
            }
        } while (guess != numberToGuess);

        scanner.close();
    }
}

