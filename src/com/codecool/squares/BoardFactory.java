package com.codecool.squares;

import com.codecool.UI.Display;
import com.codecool.UI.Input;
import com.codecool.players.HumanPlayer;
import com.codecool.players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BoardFactory
{
    private Display display;
    private Input input;
    private Random random;
    private Ship ship;


    public BoardFactory(Display display, Input input) {
        this.display = display;
        this.input = input;
        this.random = new Random();


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

        for (Ship currentShip : player.getShipList()){
            do{
                currentShip.setShipStartX(random.nextInt(10));
                currentShip.setShipStartY(random.nextInt(10));
                currentShip.setShipOrientation(random.nextInt(2) == 0 ? ShipOrientation.HORIZONTAL : ShipOrientation.VERTICAL);
                currentShip.setSquaresList();
            } while (!(playerBoard.isPlacementOk(currentShip, placementBoard.getOcean())));
            currentShip.placeShip(playerBoard.getOcean());
            currentShip.placeShipOnPlacementBoard(placementBoard.getOcean());}
        display.printBoard(playerBoard.getOcean());
        }


    public void manualPlacement(Player player, Board playerBoard, Board placementBoard){
        display.printMessage("You chose manual ship placement. Place your ships.");
        for (Ship currentShip : player.getShipList()){
            boolean ifFirstTry = true;
            do{

                currentShip.setShipStartX(random.nextInt(10));
                currentShip.setShipStartY(random.nextInt(10));
                currentShip.setShipOrientation(random.nextInt(2) == 0 ? ShipOrientation.HORIZONTAL : ShipOrientation.VERTICAL);
                currentShip.setSquaresList();
                ifFirstTry = false;
            } while (!(playerBoard.isPlacementOk(currentShip, placementBoard.getOcean())));
            currentShip.placeShip(playerBoard.getOcean());
            currentShip.placeShipOnPlacementBoard(placementBoard.getOcean());}
        display.printBoard(playerBoard.getOcean());

    };



}
