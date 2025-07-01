package com.softserve.academy.homework_05;

import java.util.Random;

public class GuessNumberGame {
    private int secretNumber;

    public GuessNumberGame() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
    }


    public GuessNumberGame(int secretNumber) {
        this.secretNumber = secretNumber;
    }


    public int getSecretNumber() {
        return secretNumber;
    }



    public String checkGuess(int guess) {
        if (guess > secretNumber) {
            return "Too high,try again.";
        }

         else if (guess < secretNumber) {
            return "Too low,try again.";

        }
         else return "Correct!";
    }
}
