package com.prakoso.component;

public class Weapon {
    //data member
    private String name;
    private int weaponAttack;

    //constructor
    public Weapon(String name, int weaponAttack) {
        this.name = name;
        this.weaponAttack = weaponAttack;
    }

    int getWeaponAttack() {
        return weaponAttack;
    }

    public String getName() {
        return this.name;
    }
}
