package com.prakoso.component;

public class Armor {
    //data member
    private String name;
    private int defenceArmor;
    private int healtArmor;

    //constructor
    public Armor(String name, int defenceArmor, int healtArmor) {
        this.name = name;
        this.defenceArmor = defenceArmor;
        this.healtArmor = healtArmor;
    }

    //getter healtArmor
    int getHealtArmor() {
        return healtArmor;
    }

    //getter defenceArmor

    int getDefenceArmor() {
        return defenceArmor;
    }

    public String getName() {
        return this.name;
    }

    public void display(){
        System.out.printf("===== %s =====\n",this.name);
        System.out.println("Defence\t\t = " + this.defenceArmor);
        System.out.println("Healt Bonus\t = " + this.healtArmor);
    }
}
