package com.prakoso.component;

import java.util.ArrayList;

public class ComponentList {

    public static ArrayList<Player> playerArrayList(){
        Player player1 = new Player("Pudge",200,20,10,25);
        Player player2 = new Player("Wind Ranger",98,22,15,15);
        Player player3 = new Player("IO",150,16,11,20);
        Player player4 = new Player("Invoker",100,25,18,17);
        Player player5 = new Player("Riki",100,24,22,11);

        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);

        return players;
    }

    public static ArrayList<Armor> armorArrayList(){
        Armor armor1 = new Armor("Assault Cuirass",30,30);
        Armor armor2 = new Armor("Chainmail",17,17);
        Armor armor3 = new Armor("Glimmer Cape",20,20);
        Armor armor4 = new Armor("Solar Crest",25,25);
        Armor armor5 = new Armor("Crimson Guard",28,24);

        ArrayList<Armor> armors = new ArrayList<Armor>();
        armors.add(armor1);
        armors.add(armor2);
        armors.add(armor3);
        armors.add(armor4);
        armors.add(armor5);

        return armors;
    }

    public static ArrayList<Weapon> weaponArrayList(){
        Weapon weapon1 = new Weapon("Shadow Blade",25);
        Weapon weapon2 = new Weapon("Hand of Midas",15);
        Weapon weapon3 = new Weapon("Divine Rappier",35);
        Weapon weapon4 = new Weapon("Desolator",25);
        Weapon weapon5 = new Weapon("Aghanim's Scepter",30);

        ArrayList<Weapon> weapons = new ArrayList<Weapon>();
        weapons.add(weapon1);
        weapons.add(weapon2);
        weapons.add(weapon3);
        weapons.add(weapon4);
        weapons.add(weapon5);

        return weapons;
    }

}
