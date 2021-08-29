package com.codecool.UI;

import java.util.ArrayList;
import java.util.Scanner;
import com.codecool.UI.Display;

import static java.lang.Integer.parseInt;

public class Input {
    Scanner sc = new Scanner(System.in);
//    Display display = new Display();


    public boolean isValid(){
        return true;
    }

    public String getGameMode(){
        String gameMode = sc.nextLine();
        if (gameMode.equals("1") || gameMode.equals("2") || gameMode.equals("3")) {
             return gameMode;
        }
        else {
//            display.printWrongValueAlert("1 to 3");
            getGameMode();
        }
        return null;
    };

    protected String getPlayerName(){
        String playerName = sc.nextLine();
        if (playerName.length() > 2){
            return playerName;
        }
        else {
//            display.printWrongNameAlert();
            getPlayerName();
        }
        return null;
    }
    public int getBoardSize(){
        System.out.println("Kindly enter the desired size of the board: ");

        return sc.nextInt();
    }

}
