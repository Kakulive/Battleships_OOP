package com.codecool.players;

import com.codecool.UI.Display;
import com.codecool.UI.Input;
import com.codecool.squares.Board;

public class ComputerPlayerEasy extends ComputerPlayer{
    private Display display;
    private Input input;

    public ComputerPlayerEasy(Display display, Input input) {
        super(display, input);
        this.display = display;
        this.input = input;
    }

    @Override
    public void shoot(Player enemyPlayer, Board shootingBoard, Board enemyBoard) {
        super.shoot(enemyPlayer, shootingBoard, enemyBoard);

    }
}
