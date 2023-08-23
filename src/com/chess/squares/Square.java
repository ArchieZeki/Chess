package com.chess.squares;

import com.chess.common.Location;

public class Square {
    private final SquareColour squareColour;
    private final Location location;
    private boolean isOccupied;


    public Square(SquareColour squareColour, Location location) {
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

    @Override
    public String toString() {
        return "Square{" +
                "squareColour=" + squareColour +
                ", location=" + location +
                ", isOccupied=" + isOccupied +
                '}';
    }
}
