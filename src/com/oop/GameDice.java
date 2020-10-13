package com.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameDice {
    private int sides;
    private int diceCount;
    private int result;
    private ArrayList<Die> dice;

    Random random = new Random();

    public GameDice(){

    }

    public GameDice(int sides, int diceCount, ArrayList<Die> dice){
        this.sides = sides;
        this.diceCount = diceCount;
        this.dice = dice;
    }

    public int generateRandomNumber(int low, int high){
        int result = random.nextInt(high - low) + low;
        return result;
    }

    /*
    public List<Die> rollDice(int diceCount, int sides, ArrayList<Die> dice){
        for(int die = 0; die < diceCount; die++){

        }
    }
    */
}
