package com.oop;

import java.util.ArrayList;
import java.util.Random;

public class GameDie {
    private int sides;
    private int result;
    private int initialValue;
    //private ArrayList<Integer> results;

    Random random = new Random();

    public GameDie(){

    }

    public GameDie(int sides, int initialValue){
        this.sides = sides;
        this.initialValue = initialValue;
    }

    public int generateRandomNumber(int low, int high){
        int result = random.nextInt(high - low) + low;
        return result;
    }

    public int roll(int sides){
        int low = 1;
        int high = sides;
        int rollResult = generateRandomNumber(low, high);
        return rollResult;
    }
}
