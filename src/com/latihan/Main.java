package com.latihan;

import java.util.Scanner;

class Player{
    //data member
    private String name;
    private int level;
    private int incrementAttack;
    private int incrementHealth;
    private int incrementDefence;
    private int baseHealt;
    private int basAttack;
    private int totalDamage;
    private boolean isAlive;
    private Armor armor;
    private Weapon weapon;

    //constructor
    Player(String name, int baseHealt, int baseAttack,int incrementAttackDefence, int incrementHealth){
        this.name = name;
        this.basAttack = baseAttack;
        this.baseHealt = baseHealt;
        this.level = 1;
        this.incrementAttack = incrementAttackDefence;
        this.incrementDefence = incrementAttackDefence;
        this.incrementHealth = incrementHealth;
    }

    void attack(Player opponent){
        int damage = this.getAttack();
        System.out.printf("%s attacking %s with %d DP\n",this.name,opponent.name,damage);
        opponent.defence(damage);
        this.levelUp();
    }

    void defence(int damage){
        int deltaDamage;

        if(this.getDefence()<damage){
            deltaDamage = damage - this.getDefence();
        } else{
            deltaDamage = 0;
        }

        this.totalDamage += deltaDamage;

        System.out.println("Damage earned = " + deltaDamage + " DP");
        getHealt();
        if(getHealt()<=0){
            isAlive = false;
            this.totalDamage = this.maxHealt();
        }
        this.display();
    }

    private int getHealt(){
        return this.maxHealt()-this.totalDamage;
    }

    private void levelUp(){
        this.level++;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    int maxHealt(){
        return this.level*this.incrementHealth+this.baseHealt+this.armor.getHealtArmor();
    }

    String getName(){
        return this.name;
    }

    int getDefence(){
        return this.armor.getDefenceArmor()+this.incrementDefence*this.level;
    }

    int getAttack(){
        return this.basAttack+this.weapon.getWeaponAttack()+this.incrementAttack*this.level;
    }

    void display(){
        System.out.println("Player Name\t\t: " + this.name);
        System.out.println("Level\t\t\t: " + this.level);
        System.out.println("Healt(HP)\t\t: " + this.getHealt() +"/"+ this.maxHealt());
        System.out.println("Defence(DP)\t\t: " + this.getDefence());
        System.out.println("Attack(AP)\t\t: " + this.getAttack() + "\n");
    }

}

class Armor{
    //data member
    private String name;
    private int defenceArmor;
    private int healtArmor;

    //constructor
    Armor(String name, int defenceArmor, int healtArmor){
        this.name = name;
        this.defenceArmor = defenceArmor;
        this.healtArmor = healtArmor;
    }

    //getter healtArmor
    public int getHealtArmor() {
        return healtArmor;
    }

    //getter defenceArmor

    public int getDefenceArmor() {
        return defenceArmor;
    }

    String getName(){
        return this.name;
    }
}

class Weapon{
    //data member
    private String name;
    private int weaponAttack;

    //constructor
    Weapon(String name, int weaponAttack){
        this.name = name;
        this.weaponAttack = weaponAttack;
    }

    public int getWeaponAttack() {
        return weaponAttack;
    }

    String getName(){
        return this.name;
    }
}

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

    private static void setPlayerEquipment(Player player, Armor armor, Weapon weapon){
        player.setArmor(armor);
        player.setWeapon(weapon);
    }

    private static int selection(){
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

    private static Player setPlayer(int input){
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

    private static Armor setArmor(int input){
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

    private static Weapon setWeapon(int input){
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
