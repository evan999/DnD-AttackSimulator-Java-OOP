package com.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttackCalculator {
    private boolean criticalHit;
    private boolean criticalMiss;
    private int attackCounter;
    private int defenseMod;
    private int attackMod;
    private String damageDice;

    public AttackCalculator(){

    }

    public AttackCalculator(int attackCounter, int defenseMod, int attackMod, String damageDice){
        this.attackCounter = attackCounter;
        this.defenseMod = defenseMod;
        this.attackMod = attackMod;
        this.damageDice = damageDice;
    }

    public int calculateDamage(int attackCounter, int defenseMod, int attackMod, String damageDice){
        ArrayList<Integer> damage = handleUserInput();
        int totalDamage = 0;
        if(criticalHit){
            System.out.println("Critical Hit!");
        }

        return totalDamage;
    }

    public ArrayList<Integer> handleUserInput(){
        // xdy
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // Break up the input
        String[] inArr = input.split("d");
        int x = Integer.parseInt(inArr[0]);
        int y = Integer.parseInt(inArr[1]);
        ArrayList<Integer> userInput = new ArrayList<Integer>();
        userInput.add(x);
        userInput.add(y);
        return userInput;
    }

    public boolean isCriticalHit(boolean criticalHit){

    }

    public boolean isCriticalMiss(boolean criticalMiss){

    }
}
