package com.softserve.academy.module01.FinalProjectBattleship;

import java.util.Scanner;

public class Main {
    static final int SIZE = 10;
    static final char EMPTY = '~';
    static final char SHIP = 'O';
    static final char HIT = 'X';
    static final char MISS = 'M';

    static Scanner scanner = new Scanner(System.in);

    static class Ship {
        String name;
        int length;
        Ship(String name, int length) {
            this.name = name;
            this.length = length;
        }
    }

    //Масив кораблів
    static Ship[] ships = {
            new Ship("Aircraft Carrier", 5),
            new Ship("Battleship", 4),
            new Ship("Submarine", 3),
            new Ship("Cruiser", 3),
            new Ship("Destroyer", 2)
    };

    //Поля гри
    static char[][] player1Field = new char[SIZE][SIZE];
    static char[][] player1Fog = new char[SIZE][SIZE];
    static char[][] player2Field = new char[SIZE][SIZE];
    static char[][] player2Fog = new char[SIZE][SIZE];

    public static void main(String[] args) {
        initializeField(player1Field);
        initializeField(player1Fog);
        initializeField(player2Field);
        initializeField(player2Fog);

        System.out.println("Player 1, place your ships on the game field");
        placeAllShips(player1Field);
        promptEnterKey();

        System.out.println("Player 2, place your ships on the game field");
        placeAllShips(player2Field);
        promptEnterKey();

        boolean player1Turn = true;

        while (true) {
            if (player1Turn) {
                System.out.println("Player 1, it's your turn:");
                printTwoFields(player2Fog, player1Field);
                takeShot(player2Field, player2Fog);
                if (allShipsSunk(player2Field)) {
                    System.out.println("Player 1 won! You sank all enemy ships.");
                    break;
                }
            } else {
                System.out.println("Player 2, it's your turn:");
                printTwoFields(player1Fog, player2Field);
                takeShot(player1Field, player1Fog);
                if (allShipsSunk(player1Field)) {
                    System.out.println("Player 2 won! You sank all enemy ships.");
                    break;
                }
            }
            player1Turn = !player1Turn;
            promptEnterKey();
        }
    }

    static void initializeField(char[][] field) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }
    }

    static void placeAllShips(char[][] field) {
        printField(field);
        for (Ship ship : ships) {
            boolean placed = false;
            while (!placed) {
                System.out.printf("Enter the coordinates of the %s (%d cells):\n", ship.name, ship.length);
                String input = scanner.nextLine().trim();
                String[] tokens = input.split(" ");
                if (tokens.length != 2) {
                    System.out.println("Error! You should enter two coordinates! Try again:");
                    continue;
                }
                int[] start = parseCoordinates(tokens[0]);
                int[] end = parseCoordinates(tokens[1]);
                if (start == null || end == null) {
                    System.out.println("Error! Wrong coordinates! Try again:");
                    continue;
                }

                if (!isStraightLine(start, end)) {
                    System.out.println("Error! Wrong ship location! Try again:");
                    continue;
                }

                if (!isValidLength(start, end, ship.length)) {
                    System.out.printf("Error! Wrong length of the %s! Try again:\n", ship.name);
                    continue;
                }

                if (!isValidPlacement(field, start, end)) {
                    System.out.println("Error! You placed it too close to another one. Try again:");
                    continue;
                }

                placeShip(field, start, end);
                printField(field);
                placed = true;
            }
        }
    }

    static int[] parseCoordinates(String coord) {
        if (coord.length() < 2 || coord.length() > 3) return null;
        char rowChar = Character.toUpperCase(coord.charAt(0));
        if (rowChar < 'A' || rowChar > 'J') return null;
        int row = rowChar - 'A';

        String colStr = coord.substring(1);
        int col;
        try {
            col = Integer.parseInt(colStr) - 1;
        } catch (NumberFormatException e) {
            return null;
        }
        if (col < 0 || col >= SIZE) return null;

        return new int[]{row, col};
    }

    static boolean isStraightLine(int[] start, int[] end) {
        return start[0] == end[0] || start[1] == end[1];
    }

    static boolean isValidLength(int[] start, int[] end, int length) {
        int dist = Math.abs(start[0] - end[0]) + Math.abs(start[1] - end[1]) + 1;
        return dist == length;
    }

    static boolean isValidPlacement(char[][] field, int[] start, int[] end) {
        int rowStart = Math.min(start[0], end[0]) - 1;
        int rowEnd = Math.max(start[0], end[0]) + 1;
        int colStart = Math.min(start[1], end[1]) - 1;
        int colEnd = Math.max(start[1], end[1]) + 1;

        rowStart = Math.max(0, rowStart);
        rowEnd = Math.min(SIZE - 1, rowEnd);
        colStart = Math.max(0, colStart);
        colEnd = Math.min(SIZE - 1, colEnd);

        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                if (field[i][j] == SHIP) return false;
            }
        }
        return true;
    }

    static void placeShip(char[][] field, int[] start, int[] end) {
        if (start[0] == end[0]) {
            int row = start[0];
            for (int col = Math.min(start[1], end[1]); col <= Math.max(start[1], end[1]); col++) {
                field[row][col] = SHIP;
            }
        } else {
            int col = start[1];
            for (int row = Math.min(start[0], end[0]); row <= Math.max(start[0], end[0]); row++) {
                field[row][col] = SHIP;
            }
        }
    }

    static void printField(char[][] field) {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((char)('A' + i) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printTwoFields(char[][] opponentFog, char[][] playerField) {
        System.out.println("Opponent's field:");
        printField(opponentFog);
        System.out.println("---------------------");
        System.out.println("Your field:");
        printField(playerField);
    }

    static void takeShot(char[][] opponentField, char[][] opponentFog) {
        while (true) {
            System.out.println("Enter coordinates to shoot:");
            String input = scanner.nextLine().trim();
            int[] shot = parseCoordinates(input);
            if (shot == null) {
                System.out.println("Error! You entered wrong coordinates! Try again:");
                continue;
            }

            int r = shot[0];
            int c = shot[1];

            if (opponentFog[r][c] == HIT || opponentFog[r][c] == MISS) {
                System.out.println("You already shot here. Try again:");
                continue;
            }

            if (opponentField[r][c] == SHIP) {
                opponentFog[r][c] = HIT;
                opponentField[r][c] = HIT;
                if (isShipSunk(opponentField, r, c)) {
                    System.out.println("You sank a ship!");
                } else {
                    System.out.println("You hit a ship!");
                }
            } else {
                opponentFog[r][c] = MISS;
                opponentField[r][c] = MISS;
                System.out.println("You missed!");
            }
            break;
        }
    }

    static boolean isShipSunk(char[][] field, int row, int col) {

        int startRow = row;
        while (startRow > 0 && (field[startRow-1][col] == SHIP || field[startRow-1][col] == HIT)) {
            startRow--;
        }
        int endRow = row;
        while (endRow < SIZE-1 && (field[endRow+1][col] == SHIP || field[endRow+1][col] == HIT)) {
            endRow++;
        }
        int startCol = col;
        while (startCol > 0 && (field[row][startCol-1] == SHIP || field[row][startCol-1] == HIT)) {
            startCol--;
        }
        int endCol = col;
        while (endCol < SIZE-1 && (field[row][endCol+1] == SHIP || field[row][endCol+1] == HIT)) {
            endCol++;
        }

        boolean verticalSunk = true;
        if (startRow != endRow) {
            for (int i = startRow; i <= endRow; i++) {
                if (field[i][col] == SHIP) {
                    verticalSunk = false;
                    break;
                }
            }
            if (verticalSunk) return true;
        }

        boolean horizontalSunk = true;
        if (startCol != endCol) {
            for (int j = startCol; j <= endCol; j++) {
                if (field[row][j] == SHIP) {
                    horizontalSunk = false;
                    break;
                }
            }
            if (horizontalSunk) return true;
        }

        if (startRow == endRow && startCol == endCol) {
            return field[row][col] != SHIP;
        }

        return false;
    }

    static boolean allShipsSunk(char[][] field) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == SHIP) return false;
            }
        }
        return true;
    }

    static void promptEnterKey(){
        System.out.println("Press Enter and pass the move to another player");
        scanner.nextLine();
    }
}
