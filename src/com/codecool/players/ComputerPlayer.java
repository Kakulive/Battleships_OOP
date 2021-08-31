package com.codecool.players;

import com.codecool.UI.Display;
import com.codecool.UI.Input;

public class ComputerPlayer extends Player {

    private Display display;
    private Input input;

    public ComputerPlayer(Display display, Input input) {
        super();
        this.display = display;
        this.input = input;
    }

    public ComputerPlayer() {

    }

    @Override
    public void shoot() {
        super.shoot();
    }
}
