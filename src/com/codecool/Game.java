package com.codecool;

import com.codecool.UI.Display;
import com.codecool.UI.Input;
import com.codecool.players.Player;
import com.codecool.squares.Board;
import com.codecool.squares.BoardFactory;

public class Game {
    private final Player player1;
    private final Player player2;
    private final BoardFactory boardFactory;
    private final Display display;
    private final Input input;
    private  GameMode gameMode;


    private Board boardPlayer1 = new Board();
    private Board boardPlayer2 = new Board();

    private Board shootingBoardPlayer1 = new Board();
    private Board shootingBoardPlayer2 = new Board();

    private Board placementBoardPlayer1 = new Board();
    private Board placementBoardPlayer2 = new Board();


    public Game(Player player1, Player player2, Display display, Input input){
        this.player1 = player1;
        this.player2 = player2;
        this.display = display;
        this.input = input;
        this.gameMode = chooseGameMode();
        this.boardFactory = new BoardFactory(display, input);
    }

    private GameMode chooseGameMode() {
        display.printGameMode();
        int gameModeNumber = input.getValue(1, 3);
        switch (gameModeNumber) {
            case 1:
                display.printMessage("You chose Player vs Player mode.");
                this.gameMode = GameMode.PVP;
                break;
            case 2:
                display.printMessage("You chose Player vs computer mode.");
                gameMode = GameMode.PVC;
                display.printMessage("You chose Player vs computer mode.");
                break;
            case 3:
                display.printMessage("You chose computer vs computer mode.");
                gameMode = GameMode.CVC;
                break;
        }
        return gameMode;
    }


    public GameMode getGameMode() {
        return gameMode;
    }

    public void move(){};

    public boolean checkIfWin(){
        return false;
    };

}

