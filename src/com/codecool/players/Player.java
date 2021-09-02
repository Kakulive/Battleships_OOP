package com.codecool.players;
import com.codecool.UI.Display;
import com.codecool.UI.Input;
import com.codecool.squares.Board;
import com.codecool.squares.BoardFactory;
import com.codecool.squares.Ship;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Ship> shipList = new ArrayList<>();
    public Player() {

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
