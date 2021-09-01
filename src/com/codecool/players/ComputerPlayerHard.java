package com.codecool.players;

import com.codecool.UI.Display;
import com.codecool.UI.Input;
import com.codecool.squares.Board;

public class ComputerPlayerHard extends ComputerPlayer{
    private Display display;
    private Input input;

    public ComputerPlayerHard(Display display, Input input) {
        super();
        this.display = display;
        this.input = input;
    }

    @Override
    public Board shoot(Board shootingBoard, Board enemyBoard) {
        super.shoot(shootingBoard, enemyBoard);
        return shootingBoard;
    }
}
