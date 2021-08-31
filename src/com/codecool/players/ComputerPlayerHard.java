package com.codecool.players;

import com.codecool.UI.Display;
import com.codecool.UI.Input;

public class ComputerPlayerHard extends ComputerPlayer{

    private Display display;
    private Input input;

    public ComputerPlayerHard(Display display, Input input) {
        this.display = display;
        this.input = input;
    }

    @Override
    public void shoot() {
        super.shoot();
    }
}
