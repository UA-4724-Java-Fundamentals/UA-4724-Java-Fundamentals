package com.softserve.academy.finalproject.chessgame.model;

public class King extends Piece {
    public King(boolean white) { super(white); }

    @Override
    public boolean isValidMove(int fr, int fc, int tr, int tc, Piece[][] board) {
        int dr = Math.abs(tr - fr), dc = Math.abs(tc - fc);
        if (dr <= 1 && dc <= 1) {
            Piece target = board[tr][tc];
            return target == null || target.isWhite() != isWhite();
        }
        // рокіровка — рух короля на 2 клітинки
        if (fr == tr && (tc == fc + 2 || tc == fc - 2)) {
            return true;
        }
        return false;
    }

    @Override
    public char getSymbol() {
        return isWhite() ? 'K' : 'k';
    }
}

