package com.codecool.UI;

import com.codecool.squares.Board;
import com.codecool.squares.Square;

public class Display {

    public void printMessage(String message){
        System.out.println(message);
    }

    public void clearScreen() {
        System.out.println("/n/n/n/n/n/n/n/n/n/n/n/n/n/n/n");
    }



    public void printMainMenu() {
        System.out.println("Hello Dear User! Welcome to Battleships Game!");
        System.out.println("To start new game please select 1.");
        System.out.println("To display high scores select 2.");
        System.out.println("To exit please select 3.");
    }


    public void printGameMode() {
        System.out.println("You are going to start the new game!");
        System.out.println("If you want to choose mode player vs player please select 1.");
        System.out.println("If you want to choose mode player vs computer, please select 2.");
        System.out.println("If you want to choose mode computer vs computer, please select 3.");
    }

    public void printPlacementMode() {
        System.out.println("If you want to place your ships yourself please select 1.");
        System.out.println("If you want to place your ships automatically, please select 2.");
    }


    public void printDifficultyLevels() {
        System.out.println("Please select the difficulty level from 1 to 3, where 1 is the easiest.");
    }

    public void printGameExit() {
        System.out.println("You are going to exit!");
        System.out.println("See you again");
    }

    public void printHighScore() {
        System.out.println("High score list");
    }


    public void getBoardSize(){
        System.out.println("Please provide board size in range 5 - 10.");

    }

    public void printBoard(Square[][] ocean){
        printColumnNumbers(ocean[0].length);
        for (int i = 0; i < ocean.length; i++) {
            System.out.printf("%2s",  (char) (0x0041 + i));
            for (int j = 0; j < ocean[i].length; j++) {
                System.out.print(ocean[i][j].getCharacter());
            }
            System.out.println();
        }

    }



    public void printGameplay(){};
    public void printOutcome(){};

    public void printWrongValueAlert(String valueRange){
        System.out.println("Please provide correct value in " + valueRange + ".");
    }

    protected void printWrongNameAlert(){
                System.out.println("Please provide longer planer name.");
    }

    ///"test"


    public void printAskPlayerName(){
        System.out.println("What is your name?");
    }

    public void printAskPlayerAboutCoordinates() {
        System.out.println("What is your net coordinate to shoot?");
    }

    public void printWrongCoordinates(){
        System.out.println("You provided wrong coordinates. It must be Letter and digit with size of board.");
    }

    private void printColumnNumbers(int gameBoardLength) {
        System.out.print("  ");
        for (int i = 0; i < gameBoardLength; i++) {
            System.out.printf("%2s", (1 + i));
        }
        System.out.println();
    }

};