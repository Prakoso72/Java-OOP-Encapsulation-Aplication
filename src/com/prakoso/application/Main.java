package com.prakoso.application;

import com.prakoso.component.*;
import static com.prakoso.operator.SetComponent.*;
import static com.prakoso.component.ComponentList.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\n++++++++++++++  +\nGAME SIMULATION\n+++++++++++++++\n");

        System.out.println("----------------\n" + "CHOOSE YOUR HERO" + "\n----------------");

        Player hero;
        System.out.println("1. " + playerArrayList().get(0).getName());
        System.out.println("2. " + playerArrayList().get(1).getName());
        System.out.println("3. " + playerArrayList().get(2).getName());
        System.out.println("4. " + playerArrayList().get(3).getName());
        System.out.println("5. " + playerArrayList().get(4).getName());

        int playerInput = selection();

        if(playerInput != 0) {
            hero = setPlayer(playerInput);
            System.out.println(hero.getName());
        } else{
            return;
        }

        System.out.println("\n----------------\n" + "CHOOSE YOUR ARMOR" + "\n----------------");

        Armor heroArmor;
        System.out.println("1. " + armorArrayList().get(0).getName());
        System.out.println("2. " + armorArrayList().get(1).getName());
        System.out.println("3. " + armorArrayList().get(2).getName());
        System.out.println("4. " + armorArrayList().get(3).getName());
        System.out.println("5. " + armorArrayList().get(4).getName());

        int armorInput = selection();

        if(armorInput != 0) {
            heroArmor = setArmor(armorInput);
            System.out.println(heroArmor.getName());
        } else{
            return;
        }

        System.out.println("\n----------------\n" + "CHOOSE YOUR WEAPON" + "\n----------------");

        Weapon heroWeapon;
        System.out.println("1. " + weaponArrayList().get(0).getName());
        System.out.println("2. " + weaponArrayList().get(1).getName());
        System.out.println("3. " + weaponArrayList().get(2).getName());
        System.out.println("4. " + weaponArrayList().get(3).getName());
        System.out.println("5. " + weaponArrayList().get(4).getName());

        int weaponInput = selection();

        if(weaponInput != 0) {
            heroWeapon = setWeapon(weaponInput);
            System.out.println(heroWeapon.getName());
        } else{
            return;
        }

        System.out.println("\n===========\nPLAYER INFO\n===========\n");
        setPlayerEquipment(hero,heroArmor,heroWeapon);
        hero.display();

    }

}
