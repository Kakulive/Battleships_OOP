package com.codecool.squares;

import com.codecool.UI.Display;
import com.codecool.UI.Input;
import com.codecool.players.HumanPlayer;
import com.codecool.players.Player;

import java.util.List;
import java.util.Random;

public class BoardFactory
{
    private Display display;
    private Input input;
    private Random random = new Random();

    public BoardFactory() {

    }

    public BoardFactory(Display display, Input input) {
        this.display = display;
        this.input = input;
    }

    public void choosePlacement(Player player, Board playerBoard, Board placementBoard){
        display.printMessage(String.format("%s, your turn!", player.getName()));
        display.printPlacementMode();
        int placementMode = input.getValue(1,2);
        switch (placementMode){
            case 1: {manualPlacement(player, playerBoard, placementBoard);
                break;}
            case 2: {randomPlacement(player, playerBoard, placementBoard);
                break;}
        }

    }


    public void randomPlacement(Player player, Board playerBoard, Board placementBoard){
        for (Ship ship : player.getShipList()){
            do{
                ship.setShipStartX(random.nextInt(10));
                ship.setShipStartY(random.nextInt(10));
                ship.setShipOrientation(random.nextInt(2) == 0 ? ShipOrientation.HORIZONTAL : ShipOrientation.VERTICAL);
//                ship.setSquaresList();
            } while (!playerBoard.isPlacementOk(ship, placementBoard.getOcean()));
            ship.placeShip(playerBoard.getOcean());
            ship.placeShipOnPlacementBoard(placementBoard.getOcean());

        }
        display.printBoard(placementBoard.getOcean());


    };
    public void manualPlacement(Player player, Board playerBoard, Board placementBoard){

    };



}
