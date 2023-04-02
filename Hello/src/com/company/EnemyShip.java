package com.company;

/**
 * Created by Anik on 0009, May 9, 2016.
 */
public abstract class EnemyShip {
    private String name;
    private int damage;

    void setname(String str) {name=str;}
    String getname(){return name;}

    void setdamage(int n) {damage=n;}
    int getdamage(){return damage;}

    void followHeroShip(){
        System.out.println(name+" is following the hero");;
    }
    void displayEnemyShip(){
        System.out.println(name+" is on the screen");
    }
    void shootHeroShip(){
        System.out.println(name+" is attacks and does "+damage+" damage");
    }
}
