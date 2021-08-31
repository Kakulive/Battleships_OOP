package com.codecool;

import com.codecool.UI.Display;
import com.codecool.UI.Input;


public class Battleship {
    Display display = new Display();
    Input input = new Input();
    private Boolean exit = false;

    public Battleship() {

        do {
            display.printMainMenu();
            int decision = input.getMode();
            switch (decision) {
                case 1:
                    Game game = new Game(display, input);
                case 2:
                    display.printHighScore();
                    return;
                case 3:
                    display.printGameExit();
                    exit = true;
                    return;
            }
        } while (exit = false);
    }
}
