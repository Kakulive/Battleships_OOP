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
                    game.startGame();
                    break;
                case 2:
                    display.printHighScore();
                    break;
                case 3:
                    display.printGameExit();
                    this.exit = true;
                    break;
            }
        } while (this.exit == false);
    }
}
