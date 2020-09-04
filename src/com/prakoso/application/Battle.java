package com.prakoso.application;

import com.prakoso.component.Player;
import static com.prakoso.operator.Utility.clearScreen;
import static com.prakoso.operator.Utility.enter;

class Battle {
    static void atacking(Player hero, Player opponent){

        clearScreen();
        hero.display();
        System.out.println("\t\t/\\\n\t\t||\n\t\t||\n\t\t||\t\tATTACK\n\t\t||\n\t\t||\n\t\t\\/\n");
        opponent.display();

        System.out.println("\nPress enter to continue!");
        enter();

        while(true) {

            if (opponent.getIsAlive()) {
                hero.attack(opponent);
            } else {
                System.out.println("\nWINNER!!!");
                hero.display();
                break;
            }

            if (hero.getIsAlive()) {
                opponent.attack(hero);
            } else{
                System.out.println("\nPress enter to continue!");
                enter();
                clearScreen();
                System.out.println("\nWINNER!!!\n");
                opponent.display();
                break;
            }
        }
    }
}
