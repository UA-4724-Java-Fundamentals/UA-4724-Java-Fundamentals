package com.softserve.academy.finalproject.chessgame.logic;

public class Move {
    private int fromRow, fromCol;
    private int toRow, toCol;
    private String promotionChoice;

    public Move(String from, String to) {
        this(from, to, null);
    }

    public Move(String from, String to, String promotionChoice) {
        this.fromCol = from.charAt(0) - 'a';
        this.fromRow = 8 - (from.charAt(1) - '0');
        this.toCol = to.charAt(0) - 'a';
        this.toRow = 8 - (to.charAt(1) - '0');
        this.promotionChoice = promotionChoice;
    }

    public int getFromRow() { return fromRow; }
    public int getFromCol() { return fromCol; }
    public int getToRow() { return toRow; }
    public int getToCol() { return toCol; }

    public String getPromotionChoice() {
        return promotionChoice;
    }
}

