package com.prakoso.application;

import static com.prakoso.component.ComponentList.*;

public class ListMenu {

    static void playerList(){
        System.out.println("\n---------\nHERO LIST\n---------\n");
        int num=0;

        try {
            while(!playerArrayList().isEmpty()) {
                playerArrayList().get(num).baseDisplay();
                System.out.println();
                num++;
            }
        } catch (Exception e){}
    }

    static void armorList(){
        System.out.println("\n----------\nARMOR LIST\n----------\n");
        int num=0;

        try {
            while(!armorArrayList().isEmpty()) {
                armorArrayList().get(num).display();
                System.out.println();
                num++;
            }
        } catch (Exception e){}
    }

    static void weaponList(){
        System.out.println("\n-----------\nWEAPON LIST\n-----------\n");
        int num=0;

        try {
            while(!weaponArrayList().isEmpty()) {
                weaponArrayList().get(num).display();
                System.out.println();
                num++;
            }
        } catch (Exception e){};
    }
}
