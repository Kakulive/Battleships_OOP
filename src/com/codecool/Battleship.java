package com.codecool;

import com.codecool.UI.Display;
import com.codecool.UI.Input;


public class Battleship {
    private Display display;
    private Input input;
    private Boolean exit;

    public Battleship() {
        this.input = new Input();
        this.display = new Display();
        this.exit = false;
    }

    public void mainMenu() {
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
        } while (!this.exit);
    }
}
