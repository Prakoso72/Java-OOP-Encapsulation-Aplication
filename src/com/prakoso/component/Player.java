package com.prakoso.component;

public class Player {
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
    public Player(String name, int baseHealt, int baseAttack, int incrementAttackDefence, int incrementHealth) {
        this.name = name;
        this.basAttack = baseAttack;
        this.baseHealt = baseHealt;
        this.level = 1;
        this.incrementAttack = incrementAttackDefence;
        this.incrementDefence = incrementAttackDefence;
        this.incrementHealth = incrementHealth;
        this.isAlive = true;
    }

    public void attack(Player opponent) {
        int damage = this.getAttack();
        System.out.printf("%s attacking %s with %d DP\n", this.name, opponent.name, damage);
        opponent.defence(damage);
        this.levelUp();
    }

    public void defence(int damage) {
        int deltaDamage;

        if (this.getDefence() < damage) {
            deltaDamage = damage - this.getDefence();
        } else {
            deltaDamage = 0;
        }

        this.totalDamage += deltaDamage;

        System.out.println("Damage earned = " + deltaDamage + " DP");
        if (getHealt() <= 0) {
            isAlive = false;
            this.totalDamage = this.maxHealt();
        }

        System.out.println(this.name + " healt = " + this.getHealt() + "\n");
    }

    private int maxHealt() {
        return this.level * this.incrementHealth + this.baseHealt + this.armor.getHealtArmor();
    }

    private int getHealt() {
        return this.maxHealt() - this.totalDamage;
    }

    public boolean getIsAlive(){
        return this.isAlive;
    }

    private void levelUp() {
        this.level++;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }

    private int getDefence() {
        return this.armor.getDefenceArmor() + this.incrementDefence * this.level;
    }

    private int getAttack() {
        return this.basAttack + this.weapon.getWeaponAttack() + this.incrementAttack * this.level;
    }

    public void display() {
        System.out.println("Player Name\t\t: " + this.name);
        System.out.println("Level\t\t\t: " + this.level);
        System.out.println("Healt(HP)\t\t: " + this.getHealt() + "/" + this.maxHealt());
        System.out.println("Defence(DP)\t\t: " + this.getDefence() + "(+" + this.armor.getName() + ")");
        System.out.println("Attack(AP)\t\t: " + this.getAttack() + "(+" + this.weapon.getName() + ")" + "\n");
    }

    public void baseDisplay(){
        System.out.printf("===== %s =====\n",this.name);
        System.out.println("Healt\t\t = " + this.baseHealt);
        System.out.println("Attack Power\t = " + this.basAttack);
    }

}
