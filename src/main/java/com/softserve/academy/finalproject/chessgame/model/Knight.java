package com.softserve.academy.finalproject.chessgame.model;

public class Knight extends Piece {
    public Knight(boolean white) { super(white); }

    @Override
    public boolean isValidMove(int fr, int fc, int tr, int tc, Piece[][] board) {
        int dr = Math.abs(tr - fr), dc = Math.abs(tc - fc);
        if ((dr == 2 && dc == 1) || (dr == 1 && dc == 2)) {
            Piece target = board[tr][tc];
            return target == null || target.isWhite() != isWhite();
        }
        return false;
    }

    @Override
    public char getSymbol() {
        return isWhite() ? 'N' : 'n';
    }
}
