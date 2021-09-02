package com.codecool.players;
import com.codecool.UI.Display;
import com.codecool.UI.Input;
import com.codecool.squares.Board;
import com.codecool.squares.BoardFactory;
import com.codecool.squares.Ship;
import com.codecool.squares.ShipType;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Ship> shipList;

    public Player() {
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

    public Board shoot(Board shootingBoard, Board EnemyBoard){
        return shootingBoard;
    };

    public void shoot(){};

    public String getName() {
        return name;
    }
}
