package com.softserve.academy.finalproject.chessgame.model;

public class Rook extends Piece {
    public Rook(boolean white) { super(white); }

    @Override
    public boolean isValidMove(int fr, int fc, int tr, int tc, Piece[][] board) {
        if (fr == tr || fc == tc) {
            int stepR = Integer.compare(tr, fr), stepC = Integer.compare(tc, fc);
            int r = fr + stepR, c = fc + stepC;
            while (r != tr || c != tc) {
                if (board[r][c] != null) return false;
                r += stepR; c += stepC;
            }
            Piece target = board[tr][tc];
            return target == null || target.isWhite() != isWhite();
        }
        return false;
    }

    @Override
    public char getSymbol() {
        return isWhite() ? 'R' : 'r';
    }
}

