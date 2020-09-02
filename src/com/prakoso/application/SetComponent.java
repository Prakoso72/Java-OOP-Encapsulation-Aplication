package com.prakoso.application;

import com.prakoso.component.*;

import java.util.Scanner;

public class SetComponent {
    static void setPlayerEquipment(Player player, Armor armor, Weapon weapon){
        player.setArmor(armor);
        player.setWeapon(weapon);
    }

    static int selection(){
        Scanner terminalInput = new Scanner(System.in);
        int input = terminalInput.nextInt();
        int output = 0;
        switch (input){
            case 1:
                output = 1;
                break;
            case 2:
                output = 2;
                break;
            case 3:
                output = 3;
                break;
            case 4:
                output = 4;
                break;
            case 5:
                output = 5;
                break;
            default:
                System.out.println("\nEROR!!\n");
        }
        return output;
    }

    static Player setPlayer(int input){
        //Player List
        Player player1 = new Player("Pudge",200,20,10,25);
        Player player2 = new Player("Wind Ranger",98,22,15,15);
        Player player3 = new Player("IO",150,16,11,20);
        Player player4 = new Player("Invoker",100,25,18,17);
        Player player5 = new Player("Riki",100,24,22,11);
        Player output = null;
        switch (input){
            case 1:
                output = player1;
                break;
            case 2:
                output = player2;
                break;
            case 3:
                output = player3;
                break;
            case 4:
                output = player4;
                break;
            case 5:
                output = player5;
                break;
        }
        return output;
    }

    static Armor setArmor(int input){
        //Armor list
        Armor armor1 = new Armor("Assault Cuirass",30,30);
        Armor armor2 = new Armor("Chainmail",17,17);
        Armor armor3 = new Armor("Glimmer Cape",20,20);
        Armor armor4 = new Armor("Solar Crest",25,25);
        Armor armor5 = new Armor("Crimson Guard",28,24);
        Armor output = null;
        switch (input){
            case 1:
                output = armor1;
                break;
            case 2:
                output = armor2;
                break;
            case 3:
                output = armor3;
                break;
            case 4:
                output = armor4;
                break;
            case 5:
                output = armor5;
                break;
        }
        return output;
    }

    static Weapon setWeapon(int input){
        //Weapon list
        Weapon weapon1 = new Weapon("Shadow Blade",25);
        Weapon weapon2 = new Weapon("Hand of Midas",15);
        Weapon weapon3 = new Weapon("Divine Rappier",35);
        Weapon weapon4 = new Weapon("Desolator",25);
        Weapon weapon5 = new Weapon("Aghanim's Scepter",30);
        Weapon output = null;
        switch (input){
            case 1:
                output = weapon1;
                break;
            case 2:
                output = weapon2;
                break;
            case 3:
                output = weapon3;
                break;
            case 4:
                output = weapon4;
                break;
            case 5:
                output = weapon5;
                break;
        }
        return output;
    }

}
