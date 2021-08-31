package com.codecool.squares;

public class Board {
    private final int boardLength = 10;
    Square[][] ocean = new Square[boardLength][boardLength];


    public Board() {

    }

    private void createBoard(){
        for(int x = 0; x < ocean.length; x++){
            for (int y = 0; y < ocean.length; y++){
                ocean[x][y] = new Square(y, x, SquareStatus.EMPTY);
            }
        }
    }


    public boolean isPlacementOk () {
        return false;
    };



}

