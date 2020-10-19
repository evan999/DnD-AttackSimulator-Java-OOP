package com.oop;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        var die = new Die(20, 1);
        //System.out.println(die.roll(random));

        Simulator calculator = new Simulator();

        calculator.attack(5, 4, 7, "5d7");

    }
}
