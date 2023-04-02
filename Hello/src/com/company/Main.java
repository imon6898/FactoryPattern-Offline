package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EnemyShipFactory factory=new EnemyShipFactory();
        EnemyShip ship=null;

        Scanner sc= new Scanner(System.in);
        String option = sc.next();

        ship=factory.makeEnemyShip (option);
        if(ship!=null){
            ship.followHeroShip ();
            ship.displayEnemyShip ();
            ship.shootHeroShip ();
        }
    }
}
