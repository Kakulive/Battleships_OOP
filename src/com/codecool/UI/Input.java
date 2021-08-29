package com.codecool.UI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import com.codecool.UI.Display;

import static java.lang.Integer.parseInt;

public class Input {
    Scanner sc = new Scanner(System.in);

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

    public int getBoardSize() {
        String bS = sc.nextLine();
//        if (bS.equals("5") || bS.equals("6") ||bS.equals("7") ||bS.equals("8") ||bS.equals("9") ||bS.equals("10"))
        if (Arrays.asList("5", "6", "7", "8"," 9", "10").contains(bS)){
            return Integer.parseInt(bS);
        } else {
//TODO alert
            getBoardSize();
        }
        return 0;
    };

    protected String getPlayerName(){
        String playerName = sc.nextLine();
        if (playerName.length() > 2){
            return playerName;
        }
        else {
            //TODO alert
//            Display.printWrongNameAlert();
            getPlayerName();
        }
        return null;
    }
    }
