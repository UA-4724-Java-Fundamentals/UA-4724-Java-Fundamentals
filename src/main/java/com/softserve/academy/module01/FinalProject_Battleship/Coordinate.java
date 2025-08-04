/*
 * Coordinate
 * Version 1.0
 */

package com.softserve.academy.module01.FinalProject_Battleship;

import java.util.ArrayList;
import java.util.List;

/** Клас для роботи з координатами на ігровому полі */
public class Coordinate {
    private final int row;
    private final int col;

    /** Конструктор за індексами */
    public Coordinate(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /** Конструктор з рядка виду "A1" */
    public Coordinate(String input) {
        input = input.trim().toUpperCase();
        if (input.length() >= 2 && input.length() <= 3) {
            char rowChar = input.charAt(0);
            this.row = rowChar - 65;
            this.col = Integer.parseInt(input.substring(1)) - 1;
        } else {
            throw new IllegalArgumentException("Invalid coordinate format");
        }
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    /** Отримати всі координати між двома точками (горизонтально або вертикально) */
    public static List<Coordinate> getCoordinatesBetween(Coordinate start, Coordinate end) {
        List<Coordinate> coords = new ArrayList<>();
        if (start.getRow() == end.getRow()) {
            int row = start.getRow();
            int startCol = Math.min(start.getCol(), end.getCol());
            int endCol = Math.max(start.getCol(), end.getCol());

            for (int col = startCol; col <= endCol; ++col) {
                coords.add(new Coordinate(row, col));
            }
        } else {
            if (start.getCol() != end.getCol()) {
                throw new IllegalArgumentException("Wrong ship location!");
            }

            int col = start.getCol();
            int startRow = Math.min(start.getRow(), end.getRow());
            int endRow = Math.max(start.getRow(), end.getRow());

            for (int row = startRow; row <= endRow; ++row) {
                coords.add(new Coordinate(row, col));
            }
        }

        return coords;
    }

    /** Парсить координати з рядка виду "A1 B1" */
    public static List<Coordinate> parseCoordinates(String inputCoordinates) {
        String[] split = inputCoordinates.split(" ");
        if (split.length != 2) {
            throw new IllegalArgumentException("Error parsing coordinates");
        } else {
            List<Coordinate> shipCoordinates = new ArrayList<>();
            shipCoordinates.add(new Coordinate(split[0]));
            shipCoordinates.add(new Coordinate(split[1]));
            return shipCoordinates;
        }
    }

    /** Перевірка, чи нові координати конфліктують з уже розміщеними кораблями */
    public static boolean isConflicting(List<Ship> ships, List<Coordinate> newCoords) {
        for (Ship ship : ships) {
            for (Coordinate shipCord : ship.getCoordinate()) {
                for (Coordinate newCord : newCoords) {
                    boolean sameCell = shipCord.getRow() == newCord.getRow() && shipCord.getCol() == newCord.getCol();
                    boolean adjacentRow = Math.abs(shipCord.getRow() - newCord.getRow()) == 1 && shipCord.getCol() == newCord.getCol();
                    boolean adjacentCol = Math.abs(shipCord.getCol() - newCord.getCol()) == 1 && shipCord.getRow() == newCord.getRow();
                    boolean diagonal1 = newCord.getRow() == shipCord.getRow() - 1 && newCord.getCol() == shipCord.getCol() - 1;
                    boolean diagonal2 = newCord.getRow() == shipCord.getRow() - 1 && newCord.getCol() == shipCord.getCol() + 1;
                    boolean diagonal3 = newCord.getRow() == shipCord.getRow() + 1 && newCord.getCol() == shipCord.getCol() - 1;
                    boolean diagonal4 = newCord.getRow() == shipCord.getRow() + 1 && newCord.getCol() == shipCord.getCol() + 1;
                    if (sameCell || adjacentRow || adjacentCol || diagonal1 || diagonal2 || diagonal3 || diagonal4) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean checkShipLength(List<Coordinate> coords, TypeOfShip shipType) {
        return coords.size() == shipType.getLength();
    }

    private static void addShipToGame(List<Coordinate> coords, TypeOfShip shipType, List<Ship> ships, String[][] gameBoard) {
        Ship ship = new Ship(shipType, shipType.getLength(), coords);
        ships.add(ship);
        for (Coordinate cord : coords) {
            gameBoard[cord.getRow() + 1][cord.getCol() + 1] = "O";
        }
        Board.printBoard(gameBoard);
    }

    /** Основний метод розміщення корабля на полі */
    public static boolean placeShip(String inputCoordinates, TypeOfShip shipType, List<Ship> ships, String[][] gameBoard) {
        List<Coordinate> shipCoords;

        try {
            shipCoords = parseCoordinates(inputCoordinates);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

        Coordinate startCoordinate = shipCoords.get(0);
        Coordinate endCoordinate = shipCoords.get(1);

        List<Coordinate> fullCoordinates;
        try {
            fullCoordinates = getCoordinatesBetween(startCoordinate, endCoordinate);
        } catch (IllegalArgumentException e) {
            System.out.println("Error! " + e.getMessage() + " Try again:");
            return false;
        }

        if (isConflicting(ships, fullCoordinates)) {
            System.out.println("Error! Wrong ship location! Try again:");
            return false;
        }

        if (!checkShipLength(fullCoordinates, shipType)) {
            System.out.printf("Error! Wrong length of the %s! Try again:%n", shipType.getFormattedName());
            return false;
        }

        addShipToGame(fullCoordinates, shipType, ships, gameBoard);

        return true;
    }
}
