package com.codecool.players;

import com.codecool.UI.Display;
import com.codecool.UI.Input;
import com.codecool.squares.*;


public class HumanPlayer extends Player{
    private Display display;
    private Input input;
    private int boardLength;
    private Boolean properCoordinate = false;
    private int rowNr;
    private int colNr;
    private String name;

    public HumanPlayer(Display display, Input input) {
        super(display, input);
        this.display = display;
        this.input = input;
        display.printAskPlayerName();
        this.name = input.getName();

    }

    @Override
    public void shoot(Player enemyPlayer, Board shootingBoard, Board enemyBoard) {
        super.shoot(enemyPlayer, shootingBoard, enemyBoard);
        this.boardLength = shootingBoard.getBoardLength();
        display.printMessage(this.name + ", it's your turn!");
        display.printBoard(shootingBoard.getOcean());
        do {
            display.printAskPlayerAboutCoordinates();
            display.printMessage("Please insert row letter: ");
            rowNr = input.getRowNumber();
            display.printMessage("Please insert column number: ");
            colNr = input.getColumnNumber();
            if (rowNr  <= this.boardLength && colNr <= this.boardLength){
                this.properCoordinate = true;
            }else{
                display.printWrongCoordinates();
            }
        } while(this.properCoordinate==false);

        this.changeSquareStatus(enemyPlayer, shootingBoard, enemyBoard, rowNr, colNr);


    }

    public void manualPlacement(Player player, Board playerBoard, Board placementBoard){

    };

    public String getName() {
        return name;
    }
}
