package com.oop;

import java.util.ArrayList;
import java.util.Random;

public class Die {
    private int value;
    private int sides;
    //private int result;
    //private int initialValue;
    //private ArrayList<Integer> results;



    public Die(){
        value = 1;
    }

    public Die(int sides, int value){
        this.sides = sides;
        this.value = 1;
    }


    public void roll(Random random, int low, int high){
        value = random.nextInt(high - low) + low;
        //return value;
    }


    public void roll(Random random){
        value = random.nextInt(sides) + 1;
    }

    /*
    public int roll(int sides){
        int low = 1;
        int high = sides;
        int rollResult = roll(random, low, high);
        return rollResult;
    }
    */


    public int getValue(){
        return value;
    }
}
