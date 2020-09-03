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

            System.out.print("\nSelect: ");
            int numMenu = inputMenu.nextInt();

            switch (numMenu) {
                case 1:
                    ListMenu.playerList();
                    break;
                case 2:
                    ListMenu.armorList();
                    break;
                case 3:
                    ListMenu.weaponList();
                    break;
                case 4:
                    hero = PickPlayerAndEquipment.menu();
                    break;
                case 5:
                    opponent = PickPlayerAndEquipment.menu();
                    break;
                case 6:
                    if (hero != null && opponent != null) {

                        isContinue = false;
                    } else {
                        System.out.println("Pick hero or opponent first!");
                    }
                    break;
            }

        }
    }

}
