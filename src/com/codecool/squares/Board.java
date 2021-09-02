package com.codecool.squares;

import com.codecool.Game;

import java.util.ArrayList;

public class Board {
    private final int boardLength = 10;
    Square[][] ocean = new Square[boardLength][boardLength];


    public Board() {
    createBoard();
    }

    private void createBoard(){
        for(int y = 0; y < ocean.length; y++){
            for (int x = 0; x < ocean.length; x++){
                ocean[y][x] = new Square(y, x, SquareStatus.EMPTY);
            }
        }
    }


    public boolean isPlacementOk (Ship ship, Square[][] ocean) {
        ArrayList<Square> shipsElements = ship.getSquaresList();
        for (Square shipElement : shipsElements){
            if (shipElement.getX() < 0 ||  shipElement.getY() < 0 || shipElement.getX() >= ocean.length ||
                    shipElement.getY() >= ocean.length)
            {
                return false;
            }
            if ((ocean[shipElement.getY()][shipElement.getX()]).getSquareStatus() != SquareStatus.EMPTY){
                return false;
            }
        }
        return true;
    };


    public int getBoardLength() {
        return boardLength;
    }

    public Square[][] getOcean() {
        return ocean;

    }

    public void setOcean(Square[][] ocean) {
        this.ocean = ocean;
    }
}

