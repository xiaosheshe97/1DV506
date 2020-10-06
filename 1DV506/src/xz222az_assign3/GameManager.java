package xz222az_assign3;

import java.util.Random;

public class GameManager {
    public static void main(String[] args) {
        Hero lordGurkan = new Hero("Lord Gurkan",100);
        Enemy princePurjo = new Enemy("Prince Purjo",70);
        Weapon steelSallad = new Weapon("a Steel Sallad",3);
        Dice lDice = new Dice();
        Dice pDice = new Dice();

        //set player and enemy
        lordGurkan.enemy = princePurjo;
        princePurjo.hero = lordGurkan;

        //set weapon and dices
        lordGurkan.weapon = steelSallad;
        lordGurkan.dice = lDice;
        princePurjo.dice = pDice;

        //player has 6 sides dice, and enemy has 5 sides dice
        lDice.setNumOfSide(6);
        pDice.setNumOfSide(5);

        //set number of dice
        if (lordGurkan.weapon.getName() == null){
            lDice.setNumOfDice(1);
        }
        else {
            lDice.setNumOfDice(lordGurkan.weapon.getDamage());
        }
        pDice.setNumOfDice(3);

        Random rnd = new Random();
        int round = 0;

        if (lordGurkan.weapon.getName() == null){
            System.out.println(lordGurkan.getName() +  " has " + lordGurkan.getXP() + "XP and uses his fists to fight with.");
            System.out.println(princePurjo.getName() + " has " + princePurjo.getXP() + " XP and uses his fists to fight with");
        }
        else {
            System.out.println(lordGurkan.getName() +  " has " + lordGurkan.getXP() + "XP and" + lordGurkan.weapon.getName() +"to fight with.");
            System.out.println(princePurjo.getName() + " has " + princePurjo.getXP() + " XP and uses his fists to fight with");
        }
        System.out.println(lordGurkan.weapon.getName());
        System.out.println();

        while(princePurjo.getXP() > 0 && lordGurkan.getXP() > 0){
            round ++;
            System.out.println("Round: " + round);

            //player attack and enemy defence
            //roll, set player's attack
            int lDiceNum = 0;
            for (int i = 0; i < lDice.getNumOfDice(); i++){
                lDiceNum = lDiceNum + rnd.nextInt(lordGurkan.dice.getNumOfSide()) + 1;
            }
            lDice.setNumber(lDiceNum);
            lordGurkan.setAttack(lDice.getNumber());

            //roll, set enemy's defence
            int pDiceNum = 0;
            for (int i = 0; i < pDice.getNumOfDice(); i++){
                pDiceNum = pDiceNum + rnd.nextInt(princePurjo.dice.getNumOfSide()) + 1;
            }
            pDice.setNumber(pDiceNum);
            princePurjo.setDefence(pDice.getNumber());

            //compare damage, only if player's attack is higher than enemy's defence the damage is made
            if (lordGurkan.getAttack() > princePurjo.getDefence()){
                princePurjo.lossXP();
                //if enemy's xp below 0, player win
                if (princePurjo.getXP() > 0){
                    System.out.println(lordGurkan.getName() + " gives " + princePurjo.getName() + " a powerful blow!");
                }
                else {
                    System.out.println(lordGurkan.getName() + " gives " + princePurjo.getName() + " a powerful blow!");
                    System.out.println(princePurjo.getName() + " is defeated!");
                    break;
                }
            }
            else {
                System.out.println(lordGurkan.getName() + " gives his all, but " + princePurjo.getName() + " dodges!");
            }

            //enemy attack and player defence
            //roll, set enemy attack
            pDiceNum = 0;
            for (int i = 0; i < pDice.getNumOfDice(); i++){
                pDiceNum = pDiceNum + rnd.nextInt(princePurjo.dice.getNumOfSide()) + 1;
            }
            pDice.setNumber(pDiceNum);
            princePurjo.setAttack(pDice.getNumber());

            //roll, set player's defence
            lDiceNum = 0;
            for (int i = 0; i < lDice.getNumOfDice(); i++){
                lDiceNum = lDiceNum + rnd.nextInt(lordGurkan.dice.getNumOfSide()) + 1;
            }
            lDice.setNumber(lDiceNum);
            lordGurkan.setDefence(lDice.getNumber());

            //compare damage, only if enemy's attack is higher than player's defence the damage is made
            if (princePurjo.getAttack() > lordGurkan.getDefence()){
                lordGurkan.lossXP();
                //if player's xp below 0, enemy win
                if (lordGurkan.getXP() > 0){
                    System.out.println(princePurjo.getName() + " gives " + lordGurkan.getName() + " a powerful blow!");
                }
                else {
                    System.out.println(princePurjo.getName() + " gives " + lordGurkan.getName() + " a powerful blow!");
                    System.out.println(lordGurkan.getName() + " is defeated!");
                }
            }
            else {
                System.out.println(princePurjo.getName() + " gives his all, but " + lordGurkan.getName() + " dodges!");
            }
            System.out.println();
        }
    }
}
