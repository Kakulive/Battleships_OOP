package com.codecool.UI;

public class Display {

    public void printGameMenu(){
        System.out.println("Hello Dear User! Welcome to Battleships Game!");
        System.out.println("Select Game mode, please!");
        System.out.println("If you want to choose mode player vs player please select 1.");
        System.out.println("If you want to choose mode player vs computer, please select 2.");
        System.out.println("If you want to choose mode computer vs computer, please select 3.");
        Input input = new Input();
        int gameMode = input.sc.nextInt();
        if (gameMode == 1) {
            System.out.println("You chose Player vs Player mode, please insert the name of the first player:");
            String playerName1 = input.sc.nextLine();
            System.out.println("Please input the second Player name:");
            String playerName2 = input.sc.nextLine();
        }
        else if (gameMode == 2) {
            System.out.println("You chose Player vs computer mode, please insert the name of the player:");
            String playerName = input.sc.nextLine();
            System.out.println("Please select the difficulty level within a range of 1 to 3, 1 is easiest:");
            int difficultyLevel = input.sc.nextInt();
        }
        else {
            System.out.println("You chose the computer vs computer game mode. Just sit back and enjoy the battle.");
        }
    };
    public void printBoard(){};
    public void printGameplay(){};
    public void printOutcome(){};




}
