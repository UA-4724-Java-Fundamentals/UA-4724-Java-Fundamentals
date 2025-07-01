package com.softserve.academy.homework_05;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGamApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GuessNumberGame game = new GuessNumberGame();

        String result = "";

        do {
            System.out.println("Enter your number (0-100): ");
            int guess = scanner.nextInt();

            result = game.checkGuess(guess);
            System.out.println(result);
        }
        while(!result.equals("Correct!") );


    }
}
