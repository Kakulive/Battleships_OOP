package com.codecool.squares;

public class Square {

    protected int x;
    protected int y;
    private SquareStatus squareStatus;

    public String getCharacter(SquareStatus status){
        return switch (status) {
            case EMPTY -> "\033[0;94m" + "\uD83C\uDF0A";
            case HIT -> "\033[0;91m" + "\uD83D\uDCA5";
            case SHIP -> "\033[0;97m" + "\uD83D\uDEA2";
            case SUNKEN -> "\033[0;97m" + "⚓";
            case MISSED -> "\033[0;96m" + "\uD83D\uDC1F";
        };
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public SquareStatus getSquareStatus() {
        return squareStatus;
    }

    public void setSquareStatus(SquareStatus squareStatus) {
        this.squareStatus = squareStatus;
    }
}
