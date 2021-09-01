package com.codecool.players;
import com.codecool.squares.Ship;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Ship> shipList = new ArrayList<>();

    public Player() {

    }

    public List<Ship> getShipList() {
        return shipList;
    }

    public boolean isAlive(){
        return false;
    };

    public void shoot(){};


}
