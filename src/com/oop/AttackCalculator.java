package com.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AttackCalculator {
    private boolean isCriticalHit = false;
    private boolean isCriticalMiss = false;
    private int damage;
    private int armorClass;
    private int totalDamage;
    private int defenseMod;
    private int attackMod;
    private String damageDice;
    private Die dieTwenty = new Die(20, 1);

    static Scanner scanner = new Scanner(System.in);

    public AttackCalculator(){
        this.damage = 0;
    }

    public AttackCalculator(int armorClass, int defenseMod, int attackMod, String damageDice){
        this.armorClass = armorClass;
        this.defenseMod = defenseMod;
        this.attackMod = attackMod;
        this.damageDice = damageDice;
    }

    public int attack(int armorClass, int defenseMod, int attackMod, String damageDice){
        damage = dieTwenty.roll();
        if(damage == 20){
            this.isCriticalHit = true;
            System.out.println("Critical Hit!");
        }

        if(damage == 1){
            this.isCriticalMiss = true;
            System.out.println("Critical Miss! No damage dealt. Turn ends.");
            return 0;
        }

        int totalDamage = damage + attackMod;

        if(totalDamage < (armorClass + defenseMod)){
            System.out.println("Miss! No damage dealt");
            return 0;
        }
        else{
            String[] inputArray = damageDice.split("d");
            int x = Integer.parseInt(inputArray[0]);
            int y = Integer.parseInt(inputArray[1]);
        }




        System.out.println(damage);
        //int totalDamage = 0;

        return damage;
    }

    /*
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
     */

    public boolean isCriticalHit(boolean criticalHit){
        return true;
    }

    public boolean isCriticalMiss(boolean criticalMiss){
        return true;
    }

    public int getDamage(){
        return damage;
    }

    /*
    public void rollDice(Random random, int sides, int dice){

    }

     */


    static public List<Integer> getDamageDice(){
        System.out.println("Enter damage dice 1-20 -> {x}d{y} : ");
        String userInput = scanner.nextLine();
        String[] inputArray = userInput.split("d");
        int dice = Integer.parseInt(inputArray[0]);
        int sides = Integer.parseInt(inputArray[1]);

        List<Integer> choices = new ArrayList<>();
        for(String choice : inputArray){
            choices.add(Integer.parseInt(choice));
        }


        // int dice =
        //return Integer.parseInt(userInput) - 1;


}
