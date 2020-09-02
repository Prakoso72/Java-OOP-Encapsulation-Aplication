package com.prakoso.application;

import com.prakoso.component.*;
import static com.prakoso.application.SetComponent.*;


public class Main {
    public static void main(String[] args){
        System.out.println("\n++++++++++++++  +\nGAME SIMULATION\n+++++++++++++++\n");

        int armorInput,playerInput,weaponInput;

        System.out.println("----------------\n" + "CHOOSE YOUR HERO" + "\n----------------");

        Player hero;
        System.out.println("1. Pudge");
        System.out.println("2. Wind Ranger");
        System.out.println("3. IO");
        System.out.println("4. Invoker");
        System.out.println("5. Riki");

        System.out.print("\nPick: ");
        playerInput = selection();
        hero = setPlayer(playerInput);
        System.out.println(hero.getName());

        System.out.println("\n----------------\n" + "CHOOSE YOUR ARMOR" + "\n----------------");

        Armor heroArmor;
        System.out.println("1. Assault Cuirass");
        System.out.println("2. Chainmail");
        System.out.println("3. Glimmer Cape");
        System.out.println("4. Solar Crest");
        System.out.println("5. Crimson Guard");

        System.out.print("\nEquip: ");
        armorInput = selection();
        heroArmor = setArmor(armorInput);
        System.out.println(heroArmor.getName());

        System.out.println("\n----------------\n" + "CHOOSE YOUR WEAPON" + "\n----------------");

        Weapon heroWeapon;
        System.out.println("1. Shadow Blade");
        System.out.println("2. Hand Of Midas");
        System.out.println("3. Divine Rappier");
        System.out.println("4. Desolator");
        System.out.println("5. ghanim's Scepter");

        System.out.print("\nEquip: ");
        weaponInput = selection();
        heroWeapon = setWeapon(weaponInput);
        System.out.println(heroWeapon.getName());

        setPlayerEquipment(hero,heroArmor,heroWeapon);
        hero.display();

    }

    public static void clearScreen(){
        try{
            if(System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else{
                System.out.print("\033\143");
            }
        } catch (Exception e){
            System.err.println("tidak bisa clear screen");
        }
    }
}
