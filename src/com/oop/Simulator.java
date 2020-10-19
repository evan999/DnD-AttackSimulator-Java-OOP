package com.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Simulator {
    private boolean isCriticalHit = false;
    private boolean isCriticalMiss = false;
    private int CRITICAL_HIT = 20;
    private int CRITICAL_MISS = 1;
    //private int damage;
    private int armorClass;
    //private int totalDamage;
    private int defenseMod;
    private int attackMod;
    private String damageDice;
    private Die dieTwenty = new Die(20, 1);

    static Scanner scanner = new Scanner(System.in);

    public Simulator(){

    }

    public Simulator(int armorClass, int defenseMod, int attackMod, String damageDice){
        this.armorClass = armorClass;
        this.defenseMod = defenseMod;
        this.attackMod = attackMod;
        this.damageDice = damageDice;
    }

    public int attack(int armorClass, int defenseMod, int attackMod, String damageDice){

        int damage = dieTwenty.roll();


        if(damage == CRITICAL_HIT){
            this.isCriticalHit = true;
            System.out.println("Critical Hit!");
        }

        if(damage == CRITICAL_MISS){
            this.isCriticalMiss = true;
            System.out.println("Critical Miss! No damage dealt. Turn ends.");
            return 0;
        }

        if((damage + attackMod) < (armorClass + defenseMod)){
            System.out.println("Miss! No damage dealt. Turn ends.");
            return 0;
        }

        int totalDamage = getDamageDice();
        totalDamage += damage;

        if (!isCriticalHit) {
            System.out.println("Hit dmg: " + totalDamage);
            return totalDamage;
        }

        int secondHit = getDamageDice();
        System.out.println("Hit dmg: " + totalDamage + "+ " + secondHit);
        totalDamage += secondHit;
        return totalDamage;
    }

    public int getDamageDice() {
        System.out.println("Enter damage dice 1-20, x for attack, d, y for max -> <x>d<y> : ");
        Random random = new Random();
        String attack = scanner.nextLine();
        String[] attackArr = attack.split("d");
        int numberOfDice = Integer.parseInt(attackArr[0]);
        int numberOfSides = Integer.parseInt(attackArr[1]);
        int totalDamage = 0;
        for(int die = 0; die < numberOfDice; die++){
            int roll = random.nextInt(numberOfSides) + 1;
            totalDamage += roll;
        }

        return totalDamage;
    }
}
