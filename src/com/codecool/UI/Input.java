package com.codecool.UI;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Input {
    public Display display;
    public Scanner sc;




    public Input() {
        this.display = new Display();
        this.sc = new Scanner(System.in);
    }

    public boolean isValid(){
        return true;
    }

    public int getMode(){
        String mode = sc.next();
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
        String boardSize = sc.next();
        if (Arrays.asList("5", "6", "7", "8"," 9", "10").contains(boardSize)) {
            return Integer.parseInt(boardSize);
        } else {
            display.printWrongValueAlert("5 to 10");
            getBoardSize();
        }
        return 0;
    };

    public int getRowNumber () {
        String rowLetter = sc.next();
        String [] letterList = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        if ((Arrays.asList(letterList)).contains(rowLetter.toUpperCase())){
            int rowNumber = (Arrays.asList(letterList)).indexOf(rowLetter.toUpperCase());
           return rowNumber;
        }
        else {
            display.printWrongValueAlert("A - J");
            getRowNumber();
        };
        return 0;
    }




    public int getOrientation () {
        String orientation = sc.next();
        String [] letterList = {"H", "V"};
        if ((Arrays.asList(letterList)).contains(orientation.toUpperCase())){
            int orientationNumber = (Arrays.asList(letterList)).indexOf(orientation.toUpperCase());
            return orientationNumber;
        }
        else {
            display.printWrongValueAlert("H and V");
            getOrientation();
        };
        return 0;
    }

    public int getColumnNumber () {
        String userInput = sc.next();
        if (Integer.parseInt(userInput) >= 1 && Integer.parseInt(userInput) <= 10) {
            return Integer.parseInt(userInput) - 1;
        }
        else {
            display.printWrongValueAlert("1 - 10");
            getRowNumber();
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

    public void anyKeyToContinue () {
        display.printMessage("Press \"ENTER\" to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
        display.clearScreen();
    }


    public String getName(){
        String name = sc.next();
        return name;
    }

    public String getSingleCoordinate(){
        String userCoordinate = sc.next();
        return userCoordinate;
    }


}
