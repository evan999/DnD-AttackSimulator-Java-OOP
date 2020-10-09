package com.oop;

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    static public void startGame(String context){
        System.out.println("Welcome to " + context);
    }

    static public void log(String output){
        System.out.println(output);
    }

    static public void log(int output){
        System.out.println(output);
    }
}
