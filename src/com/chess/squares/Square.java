package com.chess.squares;

import chess.common.Location;

public class Square {
    private final SquareColour squareColour;
    private final Location location;
    private boolean isOccupied;

    public Square(SquareColour squareColour, Location location, boolean isOccupied) {
        this.squareColour = squareColour;
        this.location = location;
        this.isOccupied = false;
    }

    public void reset() {
        isOccupied = false;
    }

    public SquareColour getSquareColour() {
        return squareColour;
    }

    public Location getLocation() {
        return location;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
