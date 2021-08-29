package com.codecool;

import com.codecool.UI.Display ;
import com.codecool.UI.Input;

import java.util.Scanner;

public class Battleship {
    Display display = new Display();
    Input input = new Input();
    Game game = new Game();


    public Battleship() {
        String[] gameInfo = display.printGameMenu();
        String gameMode = gameInfo[0];
        switch (gameMode){
            case "1": {
                String player1Name = gameInfo[1];
                String player2Name = gameInfo[2];
            }
            case "2": {
                String playerName = gameInfo[1];
                String difficultyLevel = gameInfo[2];
            }
        }


    }
}

