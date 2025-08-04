package com.softserve.academy.finalproject.chessgame.logic;

import com.softserve.academy.finalproject.chessgame.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameLogic {
    private Piece[][] board = new Piece[8][8];
    private boolean whiteTurn = true;
    private boolean whiteCanCastleKingside = true;
    private boolean whiteCanCastleQueenside = true;
    private boolean blackCanCastleKingside = true;
    private boolean blackCanCastleQueenside = true;
    private int[] whiteKingPos = {7, 4};
    private int[] blackKingPos = {0, 4};
    private List<Move> moveHistory = new ArrayList<>();

    private int[] enPassantTarget = null; // [row, col] — клітинка за пішака, який пішов на 2 клітинки

    public GameLogic() {
        setupBoard();
    }

    public boolean isWhiteTurn() {
        return whiteTurn;
    }

    private void setupBoard() {
        // Чорні фігури
        board[0][0] = new Rook(false);
        board[0][1] = new Knight(false);
        board[0][2] = new Bishop(false);
        board[0][3] = new Queen(false);
        board[0][4] = new King(false);
        board[0][5] = new Bishop(false);
        board[0][6] = new Knight(false);
        board[0][7] = new Rook(false);
        for (int i = 0; i < 8; i++) board[1][i] = new Pawn(false);

        // Білі фігури
        board[7][0] = new Rook(true);
        board[7][1] = new Knight(true);
        board[7][2] = new Bishop(true);
        board[7][3] = new Queen(true);
        board[7][4] = new King(true);
        board[7][5] = new Bishop(true);
        board[7][6] = new Knight(true);
        board[7][7] = new Rook(true);
        for (int i = 0; i < 8; i++) board[6][i] = new Pawn(true);

        // Порожні клітинки
        for (int r = 2; r <= 5; r++)
            Arrays.fill(board[r], null);
    }

    public void printBoard() {
        System.out.println("    a b c d e f g h");
        System.out.println("  +-----------------+");
        for (int r = 0; r < 8; r++) {
            System.out.print(8 - r + " | ");
            for (int c = 0; c < 8; c++) {
                Piece p = board[r][c];
                System.out.print((p == null ? "." : p.getSymbol()) + " ");
            }
            System.out.println("| " + (8 - r));
        }
        System.out.println("  +-----------------+");
        System.out.println("    a b c d e f g h");
    }

    public boolean makeMove(Move move) {
        int fr = move.getFromRow(), fc = move.getFromCol();
        int tr = move.getToRow(), tc = move.getToCol();

        Piece p = board[fr][fc];
        if (p == null || p.isWhite() != whiteTurn || !p.isValidMove(fr, fc, tr, tc, board)) return false;

        // En passant
        if (p instanceof Pawn && board[tr][tc] == null && fc != tc) {
            if (enPassantTarget != null && enPassantTarget[0] == tr && enPassantTarget[1] == tc) {
                board[fr][tc] = null; // знищити пішака "на проході"
            }
        }

        // Castling перевірка є окремо
        Piece captured = board[tr][tc];
        board[tr][tc] = p;
        board[fr][fc] = null;

        int[] oldKingPos = whiteTurn ? whiteKingPos : blackKingPos;
        if (p instanceof King) {
            if (whiteTurn) whiteKingPos = new int[]{tr, tc};
            else blackKingPos = new int[]{tr, tc};
        }

        // Перевірка на шах після ходу
        if (isInCheck(whiteTurn)) {
            board[fr][fc] = p;
            board[tr][tc] = captured;
            if (p instanceof King) {
                if (whiteTurn) whiteKingPos = oldKingPos;
                else blackKingPos = oldKingPos;
            }
            return false;
        }

        // En passant запам'ятовуємо
        enPassantTarget = null;
        if (p instanceof Pawn && Math.abs(tr - fr) == 2) {
            enPassantTarget = new int[]{(fr + tr) / 2, fc};
        }

        // Castling переміщення тури
        if (p instanceof King && Math.abs(tc - fc) == 2) {
            if (tc == 6) { // Kingside
                board[tr][5] = board[tr][7];
                board[tr][7] = null;
            } else if (tc == 2) { // Queenside
                board[tr][3] = board[tr][0];
                board[tr][0] = null;
            }
            if (whiteTurn) {
                whiteCanCastleKingside = false;
                whiteCanCastleQueenside = false;
            } else {
                blackCanCastleKingside = false;
                blackCanCastleQueenside = false;
            }
        }

        // Втрата прав на рокіровку
        updateCastlingRights(fr, fc, p);

        // Підвищення пішака
        if (p instanceof Pawn && (tr == 0 || tr == 7)) {
            board[tr][tc] = createPromotionPiece(move.getPromotionChoice(), p.isWhite());
        }

        moveHistory.add(move);
        whiteTurn = !whiteTurn;
        return true;
    }

    private Piece createPromotionPiece(String choice, boolean white) {
        if (choice == null) return new Queen(white);
        switch (choice.toUpperCase()) {
            case "Q": return new Queen(white);
            case "R": return new Rook(white);
            case "B": return new Bishop(white);
            case "N": return new Knight(white);
            default: return new Queen(white);
        }
    }

    private void updateCastlingRights(int fromRow, int fromCol, Piece p) {
        if (p instanceof King) {
            if (p.isWhite()) {
                whiteCanCastleKingside = false;
                whiteCanCastleQueenside = false;
            } else {
                blackCanCastleKingside = false;
                blackCanCastleQueenside = false;
            }
        }

        if (p instanceof Rook) {
            if (p.isWhite()) {
                if (fromRow == 7 && fromCol == 0) whiteCanCastleQueenside = false;
                else if (fromRow == 7 && fromCol == 7) whiteCanCastleKingside = false;
            } else {
                if (fromRow == 0 && fromCol == 0) blackCanCastleQueenside = false;
                else if (fromRow == 0 && fromCol == 7) blackCanCastleKingside = false;
            }
        }
    }

    public boolean isCheck() {
        return isInCheck(!whiteTurn);
    }

    public boolean isCheckmate() {
        return isCheck() && !hasAnyValidMove(!whiteTurn);
    }

    public boolean isStalemate() {
        return !isCheck() && !hasAnyValidMove(!whiteTurn);
    }

    private boolean hasAnyValidMove(boolean white) {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                Piece p = board[r][c];
                if (p != null && p.isWhite() == white) {
                    for (int tr = 0; tr < 8; tr++) {
                        for (int tc = 0; tc < 8; tc++) {
                            if (!p.isValidMove(r, c, tr, tc, board)) continue;

                            Piece tempDest = board[tr][tc];
                            board[tr][tc] = p;
                            board[r][c] = null;

                            int[] oldKingPos = white ? whiteKingPos : blackKingPos;
                            if (p instanceof King) {
                                if (white) whiteKingPos = new int[]{tr, tc};
                                else blackKingPos = new int[]{tr, tc};
                            }

                            boolean inCheck = isInCheck(white);

                            board[r][c] = p;
                            board[tr][tc] = tempDest;
                            if (p instanceof King) {
                                if (white) whiteKingPos = oldKingPos;
                                else blackKingPos = oldKingPos;
                            }

                            if (!inCheck) return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean isInCheck(boolean white) {
        int[] kingPos = white ? whiteKingPos : blackKingPos;
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                Piece p = board[r][c];
                if (p != null && p.isWhite() != white) {
                    if (p.isValidMove(r, c, kingPos[0], kingPos[1], board)) return true;
                }
            }
        }
        return false;
    }
}