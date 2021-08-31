package com.codecool.squares;

import com.codecool.UI.Display;
import com.codecool.UI.Input;

import java.util.Random;

public class BoardFactory
{
    private Display display;
    private Input input;
    private Random random = new Random();

    public BoardFactory(Display display, Input input) {
        this.display = display;
        this.input = input;
    }

    public void choosePlacement(Board playerBoard, Board placementBoard){
        display.printPlacementMode();
        int placementMode = input.getValue(1,2);
        switch (placementMode){
            case 1: {manualPlacement(playerBoard, placementBoard);
                break;}
            case 2: {randomPlacement(playerBoard, placementBoard);
                break;}
        }

    }


    public void randomPlacement(Board playerBoard, Board placementBoard){ };
    public void manualPlacement(Board playerBoard, Board placementBoard){

    };



}
