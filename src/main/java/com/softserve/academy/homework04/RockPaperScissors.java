package com.softserve.academy.homework04;

import java.util.Objects;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println(rps("rock", "scissors"));
    }

    public static String rps(String p1, String p2) {
        if (p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        }
        if (p1.equals("rock") && p2.equals("paper")) {
            return "Player 2 won!";
        }
        if (p1.equals("paper") && p2.equals("scissors")) {
            return "Player 2 won!";
        }
        if (p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        }
        if (p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        }
        if (p1.equals("scissors") && p2.equals("rock")) {
            return "Player 2 won!";
        }
        return "Draw!";
    }
}
