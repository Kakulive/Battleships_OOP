package com.codecool.UI;

import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);

    public boolean isValid(){
        return true;
    }

    public int getBoardSize(){
        System.out.println("Kindly enter the desired size of the board: ");

        return sc.nextInt();
    }

}
