package com.codecool.players;

import com.codecool.UI.Display;
import com.codecool.UI.Input;

public class ComputerPlayerEasy extends ComputerPlayer{
    private Display display;
    private Input input;

    public ComputerPlayerEasy(Display display, Input input) {
        super();
        this.display = display;
        this.input = input;
    }

    @Override
    public void shoot() {
        super.shoot();
    }
}
