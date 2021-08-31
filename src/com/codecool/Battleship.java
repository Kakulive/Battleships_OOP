package com.codecool;

import com.codecool.UI.Display ;
import com.codecool.UI.Input;
import com.codecool.players.HumanPlayer;
import com.codecool.players.Player;


public class Battleship {
    Display display = new Display();
    Input input = new Input();


    public Battleship() {
        display.printMainMenu();
        int decision = input.getValue(1, 3);
        switch (decision) {
            case 1:
                Player player1 = new HumanPlayer(display, input);
                Player player2 = new HumanPlayer(display, input);
                Game game = new Game(player1, player2, display, input);
                break;
            case 2:
                display.printHighScore();
                return;

            case 3: {
                display.printGameExit();
                return;
            }


        }



    }}


