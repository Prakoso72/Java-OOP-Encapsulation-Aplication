package com.prakoso.application;

import java.util.Scanner;

import com.prakoso.component.Player;
import com.prakoso.operator.Utility;

public class Main {
    public static void main(String[] args) throws Exception {

        Player hero, opponent;
        hero = null;
        opponent = null;
        Scanner inputMenu = new Scanner(System.in);
        boolean isContinue = true;

        while (isContinue) {
            Utility.clearScreen();
            System.out.println("\n+++++++++++++++\nGAME SIMULATION\n+++++++++++++++\n");
            System.out.println("1. Hero list");
            System.out.println("2. Armor list");
            System.out.println("3. Weapon list");
            System.out.println("4. Pick Your Hero and Equipment");
            System.out.println("5. Pick Opponent Hero and Equipment");
            System.out.println("6. Battle");
            System.out.println("7. Exit");

            System.out.print("\nSelect: ");
            int numMenu = inputMenu.nextInt();

            switch (numMenu) {
                case 1:
                    ComponentListMenu.playerList();
                    Utility.enter();
                    break;
                case 2:
                    ComponentListMenu.armorList();
                    Utility.enter();
                    break;
                case 3:
                    ComponentListMenu.weaponList();
                    Utility.enter();
                    break;
                case 4:
                    hero = PickPlayerAndEquipment.menu();
                    Utility.enter();
                    break;
                case 5:
                    opponent = PickPlayerAndEquipment.menu();
                    Utility.enter();
                    break;
                case 6:
                    if (hero != null && opponent != null) {
                        Battle.atacking(hero,opponent);
                        isContinue = false;
                    } else if (hero == null){
                        System.out.println("Pick your hero first!");
                    } else if (opponent == null){
                        System.out.println("Pick your opponent hero first!");
                    }
                    Utility.enter();
                    break;
                case 7:
                    isContinue = false;
                    break;
                default:
                    System.err.println("Eror!!");
                    Utility.enter();
            }

        }
    }

}
