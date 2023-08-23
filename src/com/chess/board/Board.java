package com.chess.board;

import com.chess.common.File;
import com.chess.common.Location;
import com.chess.squares.Square;
import com.chess.squares.SquareColour;

public class Board {
    private static final int BOARD_LENGTH = 8;
    Square[][] boardSquares = new Square[BOARD_LENGTH][BOARD_LENGTH];

    public Board() {
        for (int i = 0; i < boardSquares.length; i++) {
            int column = 0;
            SquareColour currentColour = (i % 2 == 0) ? SquareColour.LIGHT : SquareColour.DARK;
            for (File file : File.values()) {
                Square newSquare = new Square(currentColour, new Location(file, BOARD_LENGTH - i));
                boardSquares[i][column] = newSquare;
                currentColour = (currentColour == SquareColour.DARK) ? SquareColour.LIGHT : SquareColour.DARK;
                column++;
            }
        }
    }

    public void printBoard() {
        for (Square[] row : boardSquares) {
            for (Square square : row) {
                System.out.print(square);
            }
            System.out.println();
        }
    }
}
