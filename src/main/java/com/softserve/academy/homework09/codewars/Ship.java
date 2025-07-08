package com.softserve.academy.homework09.codewars;

public class Ship {
    private final double draft;
    private final int crew;

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt() {
        return (draft - crew * 1.5) > 20;
    }

    public static void main(String[] args) {
        Ship ship = new Ship(35, 10);
        System.out.println(ship.isWorthIt());
    }
}