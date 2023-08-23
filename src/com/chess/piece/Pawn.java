package com.chess.piece;

import com.chess.board.Board;
import com.chess.common.Location;
import com.chess.squares.Square;

import java.util.List;

public class Pawn extends AbstractPiece implements Moves{
    public Pawn(PieceColour pieceColour) {
        super(pieceColour);
        this.name = "Pawn";
    }

    @Override
    public List<Location> getValidMoves(Board board) {
        System.out.println(this.getName() + " - get moves");
        return null;
    }

    @Override
    public void makeMove(Square sqaure) {
        System.out.println(this.getName() + " - make move");
    }
}
