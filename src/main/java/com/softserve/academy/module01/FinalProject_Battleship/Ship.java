/*
 * Ship
 * Version 1.0
 */

package com.softserve.academy.module01.FinalProject_Battleship;

import java.util.List;

/** Клас корабля з типом, довжиною і координатами */
public class Ship {
    private final TypeOfShip shipType;
    private final int length;
    private final List<Coordinate> coordinate;

    public Ship(TypeOfShip shipType, int length, List<Coordinate> coordinate) {
        this.shipType = shipType;
        this.length = length;
        this.coordinate = coordinate;
    }

    public List<Coordinate> getCoordinate() {
        return this.coordinate;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return shipType + " (" + length + "): " + coordinate;
    }

    /** Перевірка, чи є на полі кораблі */
    public static boolean shipsRemaining(String[][] gameBoard) {
        for (int i = 1; i < gameBoard.length; ++i) {
            for (int j = 1; j < gameBoard[i].length; ++j) {
                if (gameBoard[i][j].equals("O")) {
                    return true;
                }
            }
        }
        return false;
    }

    /** Перевірка, чи потоплений корабель за координатою */
    public static boolean isShipSunk(Coordinate hitCord, String[][] gameBoard, List<Ship> ships) {
        for (Ship ship : ships) {
            for (Coordinate cord : ship.getCoordinate()) {
                if (cord.getRow() + 1 == hitCord.getRow() + 1 && cord.getCol() + 1 == hitCord.getCol() + 1) {
                    for (Coordinate part : ship.getCoordinate()) {
                        int row = part.getRow() + 1;
                        int col = part.getCol() + 1;
                        if (!gameBoard[row][col].equals("X")) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
