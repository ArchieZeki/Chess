package com.chess.piece;

import com.chess.board.Board;
import com.chess.common.Location;
import com.chess.squares.Square;

import java.util.List;

public class Queen extends AbstractPiece implements Moves{
    public Queen(PieceColour pieceColour) {
        super(pieceColour);
        this.name = "Queen";
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
