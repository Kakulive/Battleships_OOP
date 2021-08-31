package com.codecool.players;

import com.codecool.UI.Display;
import com.codecool.UI.Input;

public class HumanPlayer extends Player{

    private String name;


    public HumanPlayer(Display display, Input input) {
        display.printAskPlayerName();
        name = input.getName();
    }

    @Override
    public void shoot() {
        super.shoot();
    }
}
