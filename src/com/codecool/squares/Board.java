package com.codecool.squares;

import com.codecool.Game;

import java.util.ArrayList;

public class Board {
    private final int boardLength = 10;
    Square[][] ocean = new Square[boardLength][boardLength];


    public Board() {

    }

    private void createBoard(){
        for(int y = 0; y < ocean.length; y++){
            for (int x = 0; x < ocean.length; x++){
                ocean[y][x] = new Square(y, x, SquareStatus.EMPTY);
            }
        }
    }


    public boolean isPlacementOk (Ship ship) {
        ArrayList<Square> shipsElement = ship.getSquaresList();
        for (Square shipElement : shipsElement){
            if (shipElement.getX() >= 0 &&  shipElement.getY() >= 0 && shipElement.getX() <= ocean.length &&
                    shipElement.getY() <= ocean.length);
            if (([shipElement.getY()][shipElement.getX()]).getSquareStatus() != SquareStatus.EMPTY){
                return false;
            }
        }
        return false;
    };



}

