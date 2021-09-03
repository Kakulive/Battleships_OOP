package com.codecool.UI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import com.codecool.UI.Display;

import static java.lang.Integer.parseInt;

public class Input {
    public Display display;
    public Scanner sc;
    private  LettersToInt[] lettersToInt;



    public Input() {
        this.display = new Display();
        this.sc = new Scanner(System.in);
        this.lettersToInt = LettersToInt.values();
    }

    public boolean isValid(){
        return true;
    }

    public int getMode(){
        String mode = sc.nextLine();
        if (mode.equals("1") || mode.equals("2") || mode.equals("3")) {
            return Integer.parseInt(mode);
        }
        else {
            display.printWrongValueAlert("1 to 3");
            getMode();
        }
        return 0;
    };


    public int getBoardSize() {
        String boardSize = sc.nextLine();
        if (Arrays.asList("5", "6", "7", "8"," 9", "10").contains(boardSize)) {
            return Integer.parseInt(boardSize);
        } else {
            display.printWrongValueAlert("5 to 10");
            getBoardSize();
        }
        return 0;
    };

    public int getRowNumber () {
        String rowLetter = sc.nextLine();
        if (Arrays.asList(lettersToInt).contains(rowLetter.toUpperCase(Locale.ROOT))){
        }
        return 0;
    }

    public int getValue(int minValue, int maxValue) {
        String userInput = sc.next();
        if (Integer.parseInt(userInput) >= minValue && Integer.parseInt(userInput) <= maxValue) {
            return Integer.parseInt(userInput);
        }
        else {
            display.printWrongValueAlert(String.format("%s to %s", minValue, maxValue));
            getValue(minValue, maxValue);
        }

        return 0;
    };


    public String getName(){
        String name = sc.next();
        return name;
    }

    public String getSingleCoordinate(){
        String userCoordinate = sc.next();
        return userCoordinate;
    }


}
