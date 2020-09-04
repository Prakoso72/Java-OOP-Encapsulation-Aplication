package com.prakoso.application;

import static com.prakoso.component.ComponentList.*;
import static com.prakoso.operator.Utility.clearScreen;

public class ComponentListMenu {

    static void playerList(){
        clearScreen();
        System.out.println("\n---------\nHERO LIST\n---------\n");
        int num=0;

        try {
            while(!playerArrayList().isEmpty()) {
                playerArrayList().get(num).baseDisplay();
                System.out.println();
                num++;
            }
        } catch (Exception e){}
        System.out.println("Press enter to continue!");

    }

    static void armorList(){
        clearScreen();
        System.out.println("\n----------\nARMOR LIST\n----------\n");
        int num=0;

        try {
            while(!armorArrayList().isEmpty()) {
                armorArrayList().get(num).display();
                System.out.println();
                num++;
            }
        } catch (Exception e){}
        System.out.println("Press enter to continue!");

    }

    static void weaponList(){
        clearScreen();
        System.out.println("\n-----------\nWEAPON LIST\n-----------\n");
        int num=0;

        try {
            while(!weaponArrayList().isEmpty()) {
                weaponArrayList().get(num).display();
                System.out.println();
                num++;
            }
        } catch (Exception e){};
        System.out.println("Press enter to continue!");

    }
}
