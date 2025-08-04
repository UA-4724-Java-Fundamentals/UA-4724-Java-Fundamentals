package com.softserve.academy.finalproject.chessgame.model;

public abstract class Piece {
    private boolean white;
    public Piece(boolean white) { this.white = white; }
    public boolean isWhite() { return white; }
    public abstract boolean isValidMove(int fr, int fc, int tr, int tc, Piece[][] board);
    public abstract char getSymbol();
}

