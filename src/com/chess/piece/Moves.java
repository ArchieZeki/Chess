package com.chess.piece;

import com.chess.board.Board;
import com.chess.common.Location;
import com.chess.squares.Square;

import java.util.List;

public interface Moves {
    List<Location> getValidMoves(Board board);
    void makeMove(Square sqaure);
}
