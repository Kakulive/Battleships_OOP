package com.codecool;

import com.codecool.UI.Display;
import com.codecool.UI.Input;
import com.codecool.squares.Board;

public class Game {
    protected int boardSize;
    private GameMode gameMode;
    private Board board;
    Display display = new Display();
    Input input = new Input();


    public Game(){
        display.printGameMode();
        int gameModeNumber = input.getMode();
        switch (gameModeNumber){
            case 1: gameMode = GameMode.PVP;
            case 2: gameMode = GameMode.PVC;
            case 3: gameMode = GameMode.CVC;
        }
        display.getBoardSize();
        int BoardSize = input.getBoardSize();
        Board board = new Board(BoardSize);

    }



    public GameMode getGameMode() {
        return gameMode;
    }

    public void move(){};

    public boolean checkIfWin(){
        return false;
    };

}

