/*
 * TypeOfShip
 * Версія 1.0
 */

package com.softserve.academy.module01.FinalProject_Battleship;

public enum TypeOfShip {
    AIRCRAFT_CARRIER(5),
    BATTLESHIP(4),
    SUBMARINE(3),
    CRUISER(3),
    DESTROYER(2);

    private final int length;

    TypeOfShip(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    /** Повертає назву типу корабля з великих літер з пробілами */
    public String getFormattedName() {
        String[] parts = this.name().split("_");
        StringBuilder sb = new StringBuilder();

        for (String part : parts) {
            sb.append(part.charAt(0)).append(part.substring(1).toLowerCase()).append(" ");
        }
        return sb.toString().trim();
    }
}
