/*
 * Board
 * Version 1.0
 */

package com.softserve.academy.module01.FinalProject_Battleship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Клас для створення і управління ігровим полем та ігровим процесом */
public class Board {
    private static final int BOARD_SIZE = 11;

    private static String[][] player1Board;
    private static String[][] player2Board;
    private static String[][] player1Fog;
    private static String[][] player2Fog;
    private static List<Ship> player1Ships;
    private static List<Ship> player2Ships;

    /** Створює порожнє ігрове поле */
    public static String[][] createBoard() {
        String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (row == 0 && col == 0) {
                    board[row][col] = " ";
                } else if (row == 0) {
                    board[row][col] = String.valueOf(col);
                } else if (col == 0) {
                    board[row][col] = String.valueOf((char) ('A' + row - 1));
                } else {
                    board[row][col] = "~";
                }
            }
        }
        return board;
    }

    /** Виводить ігрове поле в консоль */
    public static void printBoard(String[][] board) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < BOARD_SIZE; j++) {
                line.append(board[i][j]);
                if (j != BOARD_SIZE - 1) {
                    line.append(" ");
                }
            }
            System.out.println(line);
        }
    }

    /** Очищає екран і чекає натискання Enter для передачі ходу іншому гравцю */
    public static void clearScreen() {
        System.out.println("Press Enter and pass the move to another player");
        new Scanner(System.in).nextLine();
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    /** ініціалізація, розміщення кораблів, чергування ходів */
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        player1Board = createBoard();
        player2Board = createBoard();
        player1Fog = createBoard();
        player2Fog = createBoard();
        player1Ships = new ArrayList<>();
        player2Ships = new ArrayList<>();

        System.out.println("Player 1, place your ships on the game field");
        placeShips(scanner, player1Board, player1Ships);
        clearScreen();

        System.out.println("Player 2, place your ships on the game field");
        placeShips(scanner, player2Board, player2Ships);
        clearScreen();

        boolean player1Turn = true;

        while (true) {
            if (player1Turn) {
                playerTurn(scanner, player1Fog, player1Board, player2Board, player2Ships, "Player 1");
            } else {
                playerTurn(scanner, player2Fog, player2Board, player1Board, player1Ships, "Player 2");
            }

            if (!Ship.shipsRemaining(player1Board)) {
                System.out.println("You sank the last ship. Player 2 won. Congratulations!");
                break;
            } else if (!Ship.shipsRemaining(player2Board)) {
                System.out.println("You sank the last ship. Player 1 won. Congratulations!");
                break;
            }

            clearScreen();
            player1Turn = !player1Turn;
        }
    }

    /** Запитує координати для розміщення кораблів та додає їх на поле */
    public static void placeShips(Scanner scanner, String[][] board, List<Ship> ships) {
        printBoard(board);
        for (TypeOfShip ship : TypeOfShip.values()) {
            boolean placed = false;
            System.out.printf("Enter the coordinates of the %s (%d cells):\n",
                    ship.getFormattedName(), ship.getLength());
            while (!placed) {
                String input = scanner.nextLine();
                placed = Coordinate.placeShip(input, ship, ships, board);
            }
        }
    }

    /** Обробка ходу гравця: прийом координат пострілу та оновлення полів */
    public static void playerTurn(Scanner scanner, String[][] fog, String[][] ownBoard,
                                  String[][] enemyBoard, List<Ship> enemyShips, String playerName) {
        printBoard(fog);
        System.out.println("---------------------");
        printBoard(ownBoard);
        System.out.printf("%s, it's your turn:\n", playerName);

        while (true) {
            try {
                String shot = scanner.nextLine();
                Coordinate coord = new Coordinate(shot);
                int row = coord.getRow() + 1;
                int col = coord.getCol() + 1;

                if (enemyBoard[row][col].equals("O")) {
                    enemyBoard[row][col] = "X";
                    fog[row][col] = "X";
                    if (Ship.isShipSunk(coord, enemyBoard, enemyShips)) {
                        if (Ship.shipsRemaining(enemyBoard)) {
                            System.out.println("You sank a ship!");
                        }
                    } else {
                        System.out.println("You hit a ship!");
                    }
                    break;
                } else if (enemyBoard[row][col].equals("~")) {
                    enemyBoard[row][col] = "M";
                    fog[row][col] = "M";
                    System.out.println("You missed!");
                    break;
                } else {
                    System.out.println("You already shot here. Try different coordinates.");
                }
            } catch (Exception e) {
                System.out.println("Error! You entered the wrong coordinates! Try again:");
            }
        }
    }
}
