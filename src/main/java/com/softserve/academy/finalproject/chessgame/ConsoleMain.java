package com.softserve.academy.finalproject.chessgame;

import com.softserve.academy.finalproject.chessgame.logic.GameLogic;
import com.softserve.academy.finalproject.chessgame.logic.Move;

import java.util.Scanner;

public class ConsoleMain {
    private static final int MOVE_TIME_LIMIT_SECONDS = 30;
    private static boolean moveTimedOut = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameLogic game = new GameLogic();

        System.out.println("=== Console Chess ===");
        game.printBoard();

        while (true) {
            System.out.println("\nIt's " + (game.isWhiteTurn() ? "White" : "Black") + "'s turn.");
            System.out.println("You have 30 seconds to make a move.");

            moveTimedOut = false;
            String[] input = waitForUserInputWithCountdown(scanner, MOVE_TIME_LIMIT_SECONDS);

            if (moveTimedOut) {
                System.out.println("\n⏰ Time's up! " + (game.isWhiteTurn() ? "White" : "Black") + " loses on time.");
                break;
            }

            if (input.length != 2) {
                System.out.println("Invalid input format. Please enter a move like 'e2 e4'.");
                continue;
            }

            Move move = new Move(input[0], input[1]);

            if (!game.makeMove(move)) {
                System.out.println("Illegal move. Try again.");
                continue;
            }

            game.printBoard();

            if (game.isCheckmate()) {
                System.out.println("Checkmate! " + (game.isWhiteTurn() ? "Black" : "White") + " wins!");
                break;
            } else if (game.isStalemate()) {
                System.out.println("Stalemate. It's a draw.");
                break;
            } else if (game.isCheck()) {
                System.out.println("Check to " + (game.isWhiteTurn() ? "White" : "Black") + "!");
            }
        }

        scanner.close();
        System.out.println("Game over.");
    }

    private static String[] waitForUserInputWithCountdown(Scanner scanner, int timeoutSeconds) {
        final String[] input = new String[1];

        // Потік для введення
        Thread inputThread = new Thread(() -> {
            try {
                if (scanner.hasNextLine()) {
                    input[0] = scanner.nextLine().trim();
                }
            } catch (Exception e) {
                System.out.println("Input thread error: " + e.getMessage());
            }
        });

        // Потік таймера
        Thread countdownThread = new Thread(() -> {
            try {
                for (int i = timeoutSeconds; i > 0; i--) {
                    if (inputThread.isInterrupted()) return;
                    System.out.print("\r⏳ Time left: " + i + "s  ");
                    Thread.sleep(1000);
                }
                moveTimedOut = true;
                inputThread.interrupt(); // зупиняємо введення
                System.out.print("\r"); // очистити таймер строку
            } catch (InterruptedException ignored) {}
        });

        inputThread.start();
        countdownThread.start();

        try {
            inputThread.join(timeoutSeconds * 1000L);
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted: " + e.getMessage());
        }

        if (inputThread.isAlive()) {
            inputThread.interrupt();
            moveTimedOut = true;
            return new String[0];
        }

        return input[0] != null ? input[0].split("\\s+") : new String[0];
    }
}
