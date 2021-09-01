package com.codecool;

import com.codecool.UI.Display;
import com.codecool.UI.Input;
import com.codecool.players.*;
import com.codecool.squares.Board;
import com.codecool.squares.BoardFactory;

public class Game {
    private Player player1;
    private Player player2;
    private final BoardFactory boardFactory;
    private final Display display;
    private final Input input;
    private GameMode gameMode;
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
                this.player1 = new HumanPlayer(display, input);
                this.player2 = new HumanPlayer(display, input);
                break;}
            case PVC:{
                this.player1 = new HumanPlayer(display, input);
                this.difficultyLevel = chooseDifficultyLevel();
                switch (difficultyLevel){
                    case EASY: {this.player2 = new ComputerPlayerEasy(display, input);
                        break;}
                    case NORMAL: {this.player2 = new ComputerPlayerNormal(display, input);
                        break;}
                    case HARD: {this.player2 = new ComputerPlayerHard(display, input);
                        break;}
                }}
            case CVC: {
                this.player1 = new ComputerPlayer(display, input);
                this.player2 = new ComputerPlayer(display, input);
            }
        }
        this.boardFactory = new BoardFactory(display, input);
    }

    public void startGame(){
        boardFactory.choosePlacement(player1, boardPlayer1, placementBoardPlayer1);
        boardFactory.choosePlacement(player2, boardPlayer2, placementBoardPlayer2);
        while (! isGameOver()){
            playRound();
        }

    }

    public void playRound(){
        player1.shoot(shootingBoardPlayer1, boardPlayer2);
        player2.shoot(shootingBoardPlayer2, boardPlayer1);

    }

    private boolean isGameOver(){
        return false;
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

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public BoardFactory getBoardFactory() {
        return boardFactory;
    }

    public Display getDisplay() {
        return display;
    }

    public Input getInput() {
        return input;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public Board getBoardPlayer1() {
        return boardPlayer1;
    }

    public void setBoardPlayer1(Board boardPlayer1) {
        this.boardPlayer1 = boardPlayer1;
    }

    public Board getBoardPlayer2() {
        return boardPlayer2;
    }

    public void setBoardPlayer2(Board boardPlayer2) {
        this.boardPlayer2 = boardPlayer2;
    }

    public Board getShootingBoardPlayer1() {
        return shootingBoardPlayer1;
    }

    public void setShootingBoardPlayer1(Board shootingBoardPlayer1) {
        this.shootingBoardPlayer1 = shootingBoardPlayer1;
    }

    public Board getShootingBoardPlayer2() {
        return shootingBoardPlayer2;
    }

    public void setShootingBoardPlayer2(Board shootingBoardPlayer2) {
        this.shootingBoardPlayer2 = shootingBoardPlayer2;
    }

    public void setPlacementBoardPlayer1(Board placementBoardPlayer1) {
        this.placementBoardPlayer1 = placementBoardPlayer1;
    }

    public void setPlacementBoardPlayer2(Board placementBoardPlayer2) {
        this.placementBoardPlayer2 = placementBoardPlayer2;
    }
}
