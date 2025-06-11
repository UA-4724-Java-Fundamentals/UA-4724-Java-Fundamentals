package com.softserve.academy.homework03;


public class Kata {
    public static void main(String[] args) {
        System.out.println(Kata.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));;
    }

    // Lew attacks Harry; Harry now has 3 health.
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        if(firstAttacker.equals(fighter1.name)) {
            while(true) {
                fighter2.health -= fighter1.damagePerAttack;
                if(fighter2.health < 1)
                    return fighter1.name;
                fighter1.health -= fighter2.damagePerAttack;
                if(fighter1.health < 1)
                    return fighter2.name;
            }
        }
        else {
            return declareWinner(fighter2, fighter1, firstAttacker);
        }
    }

    public static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }
}
