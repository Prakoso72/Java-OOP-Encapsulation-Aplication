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
}
