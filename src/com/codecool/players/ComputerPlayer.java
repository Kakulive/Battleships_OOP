package com.codecool.players;

import com.codecool.UI.Display;
import com.codecool.UI.Input;
import com.codecool.squares.Board;

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
    public Board shoot(Board shootingBoard, Board enemyBoard) {
        super.shoot(shootingBoard, enemyBoard);
        return shootingBoard;
    }
}
