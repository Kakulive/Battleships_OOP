package com.codecool.squares;

import java.util.ArrayList;

public class Ship {

    ArrayList<Square> squaresList;
    ArrayList<Square> placementSquaresList;


    private ShipOrientation shipOrientation;
    private ShipType shipType;
    private int shipStartX;
    private int shipStartY;



    public Ship(ShipType shipType) {
        this.shipType = shipType;
        this.squaresList = new ArrayList<>();
        this.placementSquaresList = new ArrayList<>();
    }

    public void placeShip (Square[][] ocean) {
        for (int i=0; i < this.shipType.getShipLength(); i++) {
            switch (this.shipOrientation){
                case HORIZONTAL:
                {
                    ocean[this.shipStartY][this.shipStartX + i].setSquareStatus(SquareStatus.SHIP);
                    break;
                }
                case VERTICAL:
                {
                    ocean[this.shipStartY + i][this.shipStartX].setSquareStatus(SquareStatus.SHIP);
                    break;
                }
            }
        }
    }

    public ArrayList<Square> getSquaresList() {
        return squaresList;
    }

    public ArrayList<Square> getPlacementSquaresList() {
        return placementSquaresList;
    }


    public void setSquaresList() {
        for (int i=0; i < this.shipType.getShipLength(); i++) {
            switch (this.shipOrientation){
                case HORIZONTAL:
                {
                    new Square(this.shipStartY, this.shipStartX + i, SquareStatus.SHIP);
                    break;
                }
                case VERTICAL:
                {
                    new Square(this.shipStartY + i, this.shipStartX, SquareStatus.SHIP);
                    break;
                }
            }
        }


    }

}
