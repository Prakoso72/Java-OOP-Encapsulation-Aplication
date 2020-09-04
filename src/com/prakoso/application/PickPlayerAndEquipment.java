package com.prakoso.application;

import com.prakoso.component.*;

import static com.prakoso.component.ComponentList.*;
import static com.prakoso.operator.SetComponent.*;
import static com.prakoso.operator.Utility.*;

class PickPlayerAndEquipment {

    static Player menu()throws Exception{
        clearScreen();
        System.out.println("\n----------------\n" + "CHOOSE HERO" + "\n----------------");
        Player hero;
        hero = chooseYourPlayer();

        clearScreen();
        System.out.println("\n----------------\n" + "CHOOSE ARMOR" + "\n----------------");
        Armor heroArmor;
        heroArmor = chooseYourArmor();

        clearScreen();
        System.out.println("\n----------------\n" + "CHOOSE WEAPON" + "\n----------------");
        Weapon heroWeapon;
        heroWeapon = chooseYourWeapon();

        clearScreen();
        System.out.println("\n===========\nPLAYER INFO\n===========\n");
        setPlayerEquipment(hero,heroArmor,heroWeapon);
        hero.display();

        System.out.println("Press enter to continue!");
        return hero;
    }

    private static Player chooseYourPlayer() throws Exception {
        Player hero = null;
        int num=0;

        try {
            while(!playerArrayList().isEmpty()) {
                System.out.println((num+1) + ". " + playerArrayList().get(num).getName());
                num++;
            }
        } catch (Exception e){}

        int playerInput = selection();

        if(playerInput != 0) {
            hero = setPlayer(playerInput);
            System.out.println(hero.getName());
        }

        return hero;
    }

    private static Armor chooseYourArmor() throws Exception{
        Armor heroArmor = null;
        int num=0;

        try {
            while(!armorArrayList().isEmpty()) {
                System.out.println((num+1) + ". " + armorArrayList().get(num).getName());
                num++;
            }
        } catch (Exception e){}

        int armorInput = selection();

        if(armorInput != 0) {
            heroArmor = setArmor(armorInput);
            System.out.println(heroArmor.getName());
        }

        return heroArmor;
    }

    private static Weapon chooseYourWeapon() throws Exception{
        Weapon heroWeapon = null;
        int num=0;

        try {
            while(!weaponArrayList().isEmpty()) {
                System.out.println((num+1) + ". " + weaponArrayList().get(num).getName());
                num++;
            }
        } catch (Exception e){};

        int weaponInput = selection();

        if(weaponInput != 0) {
            heroWeapon = setWeapon(weaponInput);
            System.out.println(heroWeapon.getName());
        }

        return heroWeapon;
    }
}
