package com.softserve.academy.homework_05;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class GuessNumberGameTest {



    @Test
    public void guessNumberTooHigh() {

        GuessNumberGame guesser = new GuessNumberGame(55);

        String expectedResult = "Too high,try again.";
        String actualResult = guesser.checkGuess(75);
        assertEquals(expectedResult,actualResult);


    }

    @Test
    public void guessNumberTooLow() {

        GuessNumberGame guesser = new GuessNumberGame(55);
        String expectedResult = "Too low,try again.";
        String actualResult = guesser.checkGuess(25);
        assertEquals(expectedResult,actualResult);



    }

    @Test
    public void guessNumberCorrect() {

        GuessNumberGame guesser = new GuessNumberGame(55);
        String expectedResult = "Correct!";
        String actualResult = guesser.checkGuess(55);
        assertEquals(expectedResult,actualResult);



    }
}
