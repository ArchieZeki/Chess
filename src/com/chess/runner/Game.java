package com.chess.runner;

import com.chess.board.Board;
import com.chess.piece.AbstractPiece;
import com.chess.piece.Pawn;
import com.chess.piece.PieceColour;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();
        PieceColour colour = PieceColour.DARK;
        Pawn pawn = new Pawn(colour);
        Game.printPiece(pawn);
    }

    public static void printPiece(AbstractPiece piece) {
        System.out.println(piece.toString());
    }
}
