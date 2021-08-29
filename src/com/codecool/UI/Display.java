package com.codecool.UI;

public class Display {
    Input input = new Input();

    public String[] printGameMenu() {
        System.out.println("Hello Dear User! Welcome to Battleships Game!");
        System.out.println("Select Game mode, please!");
        System.out.println("If you want to choose mode player vs player please select 1.");
        System.out.println("If you want to choose mode player vs computer, please select 2.");
        System.out.println("If you want to choose mode computer vs computer, please select 3.");
        String gameMode = input.getGameMode();

        switch (gameMode) {
            case "1": {
                System.out.println("You chose Player vs Player mode, please insert the name of the first player:");
                String playerName1 = input.getPlayerName();
                System.out.println("Please input the second Player name:");
                String playerName2 = input.getPlayerName();
                return new String[]{gameMode, playerName1, playerName2};
            }

            case "2": {
                System.out.println("You chose Player vs computer mode, please insert the name of the player:");
                String playerName = input.sc.nextLine();
                System.out.println("Please select the difficulty level within a range of 1 to 3, 1 is easiest:");
                String difficultyLevel = input.getGameMode();
                return new String[]{gameMode, playerName, difficultyLevel};
            }
            case "3": {
                System.out.println("You chose the computer vs computer game mode. Just sit back and enjoy the battle.");
                return new String[]{gameMode};
            }

        }
        return new String[] {"0"};
    }
    public int getBoardSize(){
        System.out.println("Please provide board size in range 5 - 10.");
        int boardSize = input.getBoardSize();
        return boardSize;
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
        };



