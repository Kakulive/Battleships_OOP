package com.codecool.squares;

public class Board {


    private int boardLength;

    Square[][] ocean = new Square[boardLength][boardLength];


    public Board(int boardLength) {
        this.boardLength = boardLength;
    }

    public boolean isPlacementOk () {
        return false;
    };

}

