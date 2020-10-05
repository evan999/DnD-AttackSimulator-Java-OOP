package com.oop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameDice {
    private int sides;
    private int diceCount;
    private int result;
    private ArrayList<GameDie> dice;

    Random random = new Random();

    public GameDice(){

    }

    public GameDice(int sides, int diceCount, ArrayList<GameDie> dice){
        this.sides = sides;
        this.diceCount = diceCount;
        this.dice = dice;
    }

    public int generateRandomNumber(int low, int high){
        int result = random.nextInt(high - low) + low;
        return result;
    }

    public List<GameDie> rollDice(int diceCount, int sides, ArrayList<GameDie> dice){
        for(int die = 0; die < diceCount; die++){

        }
    }
}
