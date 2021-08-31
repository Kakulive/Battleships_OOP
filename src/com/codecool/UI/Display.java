package com.codecool.UI;


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

    public void printBoard(){};
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

};