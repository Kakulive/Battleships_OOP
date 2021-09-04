package com.codecool.players;
import com.codecool.UI.Display;
import com.codecool.UI.Input;
import com.codecool.squares.*;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private Display display;
    private Input input;
    private String name;
    protected List<Ship> shipList;

    public Player(Display display, Input input) {
        this.display = display;
        this.input = input;
        this.shipList = new ArrayList<>();
        createShipList();

    }



    public void createShipList(){
        for (ShipType shipType : ShipType.values()){
            addShips(new Ship(shipType));
        }
    }

    public void addShips(Ship ship) {
        shipList.add(ship);
    }


    public List<Ship> getShipList() {
        return shipList;
    }

    public boolean isAlive(){
        return !this.shipList.isEmpty();
    }

    public void shoot(Player enemyPlayer, Board shootingBoard, Board EnemyBoard){

    };

    public void shoot(){};

    public String getName() {
        return name;
    }

    public void changeSquareStatus(Player enemyPlayer, Board shootingBoard, Board enemyBoard, int rowNr, int colNr){
        if (enemyBoard.getOcean()[rowNr][colNr].getSquareStatus() == SquareStatus.SHIP){
            enemyBoard.getOcean()[rowNr][colNr].setSquareStatus(SquareStatus.HIT);
            shootingBoard.getOcean()[rowNr][colNr].setSquareStatus(SquareStatus.HIT);
            this.changeShipStatus(rowNr, colNr);

            display.printMessage("Enemy's ship has got shot!");
        }else if(enemyBoard.getOcean()[rowNr][colNr].getSquareStatus() == SquareStatus.EMPTY){
            shootingBoard.getOcean()[rowNr][colNr].setSquareStatus(SquareStatus.MISSED);

            display.printMessage("Not this time. Missed shot!");
        }
        display.printBoard(shootingBoard.getOcean());
        input.anyKeyToContinue();
    }

    protected void changeShipStatus(int rowNr, int colNr){
//        for (Ship currentShip : this.getShipList()){
//            for (Square shipSquare : currentShip.getSquaresList()){
//                if (rowNr == shipSquare.getX() && colNr == shipSquare.getY()){
//                    shipSquare.setSquareStatus(SquareStatus.HIT);
//                }
//            }
//            Boolean toBeSunken = true;
//            for (Square shipSquare : currentShip.getSquaresList()){
//                if (shipSquare.getSquareStatus() != SquareStatus.HIT){
//                    toBeSunken = false;
//                }
//            }
//            if (toBeSunken = true){
//                this.getShipList().remove(currentShip);
//
//            }
//        }
    }


}

