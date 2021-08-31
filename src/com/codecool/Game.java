package com.codecool;

import com.codecool.UI.Display;
import com.codecool.UI.Input;
import com.codecool.players.*;
import com.codecool.squares.Board;
import com.codecool.squares.BoardFactory;

public class Game {
//        private final Player player1;
//    private final Player player2;
    private final BoardFactory boardFactory;
    private final Display display;
    private final Input input;
    private  GameMode gameMode;
    private DifficultyLevel difficultyLevel;


    private Board boardPlayer1 = new Board();
    private Board boardPlayer2 = new Board();

    private Board shootingBoardPlayer1 = new Board();
    private Board shootingBoardPlayer2 = new Board();

    private Board placementBoardPlayer1 = new Board();
    private Board placementBoardPlayer2 = new Board();


    public Game(Display display, Input input){
        this.display = display;
        this.input = input;
        this.gameMode = chooseGameMode();
        switch (gameMode){
            case PVP:{
                Player player1 = new HumanPlayer(display, input);
                Player player2 = new HumanPlayer(display, input);
                break;}
            case PVC:{
                Player player1 = new HumanPlayer(display, input);
                this.difficultyLevel = chooseDifficultyLevel();
                switch (difficultyLevel){
                    case EASY: {Player player2 = new ComputerPlayerEasy(display, input);
                        break;}
                    case NORMAL: {Player player2 = new ComputerPlayerNormal(display, input);
                        break;}
                    case HARD: {Player player2 = new ComputerPlayerHard(display, input);
                        break;}
                }}
            break;
            case CVC: {
                Player player1 = new ComputerPlayer(display, input);
                Player player2 = new ComputerPlayer(display, input);
            }
        }
        this.boardFactory = new BoardFactory(display, input);
    }

    private DifficultyLevel chooseDifficultyLevel (){
        display.printDifficultyLevels();
        int difficultyNumber = input.getValue(1,3);
        switch (difficultyNumber) {
            case 1: {this.difficultyLevel = DifficultyLevel.EASY;
                break;}
            case 2: {this.difficultyLevel = DifficultyLevel.NORMAL;
                break;}
            case 3: {this.difficultyLevel = DifficultyLevel.HARD;
                break;}
        }
        return difficultyLevel;
    }


    private GameMode chooseGameMode() {
        display.printGameMode();
        int gameModeNumber = input.getValue(1, 3);
        switch (gameModeNumber) {
            case 1:{
                display.printMessage("You chose Player vs Player mode.");
                this.gameMode = GameMode.PVP;
                break;}
            case 2:{
                display.printMessage("You chose Player vs computer mode.");
                gameMode = GameMode.PVC;
                break;}
            case 3:{
                display.printMessage("You chose computer vs computer mode.");
                gameMode = GameMode.CVC;
                break;}
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

    public Board getPlacementBoardPlayer1() {
        return placementBoardPlayer1;
    }

    public Board getPlacementBoardPlayer2() {
        return placementBoardPlayer2;
    }

}

