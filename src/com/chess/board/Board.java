package com.chess.board;

import com.chess.commons.File;
import com.chess.commons.Location;
import com.chess.squares.Square;
import com.chess.squares.SquareColour;

public class Board {
    Square[][] boardSquares = new Square[8][8];

    public Board() {
        for(int i = 0; i <boardSquares.length; i++) {
            int column = 0;
            SquareColour currentColour = (i % 2 == 0) ? SquareColour.DARK : SquareColour.LIGHT;
            for (File file : File.values()) {
                Square newSquare = new Square(currentColour, new Location(file, i));
                boardSquares[i][column] = newSquare;
                currentColour = (currentColour == SquareColour.LIGHT) ? SquareColour.DARK : SquareColour.LIGHT;
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