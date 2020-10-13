package com.oop;
import java.util.Random;

public class DnDDie extends Die {

    private int sides = 20;

    public DnDDie(int sides, int value){
        super(sides, value); // ?
    }

    // Use some method overloading here.

    public void roll(Random random, int sides){
        super.roll(random);
    }


    /*
    @Override
    public int roll(int sides){
        int low = 1;
        int high = sides;
        int rollResult = generateRandomNumber(low, high);
        return rollResult;
    }
    */
}
