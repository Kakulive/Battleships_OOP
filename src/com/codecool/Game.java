package com.codecool;

import com.codecool.squares.Board;

public class Game {

    private GameMode gameMode;
    private Board board;


    public GameMode getGameMode() {
        return gameMode;
    }

    public void move(){};

    public boolean checkIfWin(){
        return false;
    };

}

