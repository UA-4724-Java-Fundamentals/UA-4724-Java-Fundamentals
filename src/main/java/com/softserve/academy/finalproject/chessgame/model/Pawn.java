package com.softserve.academy.finalproject.chessgame.model;

public class Pawn extends Piece {
    public Pawn(boolean white) {
        super(white);
    }

    @Override
    public boolean isValidMove(int fr, int fc, int tr, int tc, Piece[][] board) {
        int dir = isWhite() ? -1 : 1;
        int startRow = isWhite() ? 6 : 1;

        if (fc == tc) {
            if (tr == fr + dir && board[tr][tc] == null) return true;
            if (fr == startRow && tr == fr + 2 * dir && board[fr + dir][tc] == null && board[tr][tc] == null)
                return true;
        }

        // Атака по діагоналі або en passant
        if (Math.abs(tc - fc) == 1 && tr == fr + dir) {
            if (board[tr][tc] != null && board[tr][tc].isWhite() != isWhite()) return true;
        }

        return false;
    }

    @Override
    public char getSymbol() {
        return isWhite() ? 'P' : 'p';
    }
}
