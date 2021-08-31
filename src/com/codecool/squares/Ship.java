package com.codecool.squares;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    ArrayList<Square> squaresList;
    private ShipType shipType;

    public Ship(ArrayList<Square> squaresList, ShipType shipType) {
        this.squaresList = squaresList;
        this.shipType = shipType;
    }


}
