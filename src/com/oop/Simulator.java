package com.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Simulator {
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

    public Simulator(){
        this.damage = 0;
    }

    public Simulator(int armorClass, int defenseMod, int attackMod, String damageDice){
        this.armorClass = armorClass;
        this.defenseMod = defenseMod;
        this.attackMod = attackMod;
        this.damageDice = damageDice;
    }

    public int attack(int armorClass, int defenseMod, int attackMod, String damageDice){
        damage = dieTwenty.roll();
        int criticalHit = 20;
        int criticalMiss = 1;

        if(damage == criticalHit){
            this.isCriticalHit = true;
            System.out.println("Critical Hit!");
        }

        if(damage == criticalMiss){
            this.isCriticalMiss = true;
            System.out.println("Critical Miss! No damage dealt. Turn ends.");
            return 0;
        }

        if((damage + attackMod) < (damage + defenseMod)){
            System.out.println("Miss! No damage dealt. Turn ends.");
            return 0;
        }
        else{
            String[] attack = damageDice.split("d");
            int x = Integer.parseInt(attack[0]);
            int max = Integer.parseInt(attack[1]);

            if(isCriticalHit){
                
            }

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
        System.out.println("Enter damage dice 1-20, x for attack, d, y for max -> {x}d{y} : ");
        String attack = scanner.nextLine();
        String[] attackArr = attack.split("d");
        int dice = Integer.parseInt(attackArr[0]);
        int sides = Integer.parseInt(attackArr[1]);

        List<Integer> choices = new ArrayList<>();
        for(String choice : attackArr){
            choices.add(Integer.parseInt(choice));
        }


        // int dice =
        //return Integer.parseInt(userInput) - 1;


}
