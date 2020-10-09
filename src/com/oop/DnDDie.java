package com.oop;

public class DnDDie extends Die {

    public DnDDie(){
        super();
    }

    @Override
    public int roll(int sides){
        int low = 1;
        int high = sides;
        int rollResult = generateRandomNumber(low, high);
        return rollResult;
    }
}
