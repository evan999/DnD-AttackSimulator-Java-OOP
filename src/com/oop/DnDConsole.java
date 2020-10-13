package com.oop;

import java.util.ArrayList;
import java.util.List;

public class DnDConsole extends Console {

    static public void startGame(){
        startGame("Dungeons and Dragons");
    }

    static public List<Integer> getDamageDice(){
        System.out.println("Enter damage dice 1-20 -> {x}d{y} : ");
        String userInput = scanner.nextLine();
        String[] inputArray = userInput.split("d");
        int dice = Integer.parseInt(inputArray[0]);
        int sides = Integer.parseInt(inputArray[1]);
        /*
        List<Integer> choices = new ArrayList<>();
        for(String choice : inputArray){
            choices.add(Integer.parseInt(choice));
        }
        */

        // int dice =
        //return Integer.parseInt(userInput) - 1;
    }
}
