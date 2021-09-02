package com.codecool.players;

import com.codecool.UI.Display;
import com.codecool.UI.Input;
import com.codecool.squares.Board;
import com.codecool.squares.Square;


public class HumanPlayer extends Player{
    private Display display;
    private Input input;
    private int boardLength;
    private Boolean properCoordinate = false;
    private int rowNr;
    private int colNr;
    private String name;

    public HumanPlayer(Display display, Input input) {
        super();
        this.display = display;
        this.input = input;
        display.printAskPlayerName();
        this.name = input.getName();

    }

    @Override
    public Board shoot(Board shootingBoard, Board enemyBoard) {
        super.shoot(shootingBoard, enemyBoard);
        this.boardLength = shootingBoard.getBoardLength();
        display.printBoard(shootingBoard.getOcean());
        do {
            display.printAskPlayerAboutCoordinates();
            String userCoordinate = this.input.getSingleCoordinate();
            if (userCoordinate.length() == 2){
                this.rowNr = Integer.parseInt(String.valueOf(userCoordinate.charAt(0)));
                this.colNr = Integer.parseInt(String.valueOf(userCoordinate.charAt(1)));
                if (rowNr <= this.boardLength && colNr <= this.boardLength){
                    this.properCoordinate = true;
                }
            }else{
                display.printWrongCoordinates();
            }
        } while(this.properCoordinate==true);

      
        return shootingBoard;
    }

    public String getName() {
        return name;
    }
}
