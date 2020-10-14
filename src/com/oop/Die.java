package com.oop;

import java.util.ArrayList;
import java.util.Random;

public class Die {
    private int value;
    private int sides;
    private Random random = new Random();
    //private int result;
    //private int initialValue;
    //private ArrayList<Integer> results;



    public Die(){
        sides = 6;
        value = 1;
    }

    public Die(int sides, int value){
        this.sides = sides;
        this.value = value;
    }

    /*
    public void roll(Random random, int low, int high){
        value = random.nextInt(high - low) + low;
        //return value;
    }
    */

    public int roll(Random random){
        this.value = random.nextInt(sides) + 1;
        return value;
    }

    public int roll(){
        this.value = random.nextInt(sides) + 1;
        return value;
    }

    /*
    public int roll(int sides){
        int low = 1;
        int high = sides;
        int rollResult = roll(random, low, high);
        return rollResult;
    }
    */

    public int getSides(){
        return sides;
    }

    public int getValue(){
        return value;
    }
}
