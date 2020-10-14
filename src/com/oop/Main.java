package com.oop;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        var die = new Die(20, 1);
        //System.out.println(die.roll(random));

        AttackCalculator calculator = new AttackCalculator();

        calculator.attack(5, 5, 5, "xdy");


    }
}
