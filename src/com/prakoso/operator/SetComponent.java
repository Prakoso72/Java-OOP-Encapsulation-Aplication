package com.prakoso.operator;

import java.util.Scanner;
import com.prakoso.component.*;
import static com.prakoso.component.ComponentList.*;

public class SetComponent {
    public static void setPlayerEquipment(Player player, Armor armor, Weapon weapon){
        player.setArmor(armor);
        player.setWeapon(weapon);
    }

    public static int selection() throws Exception{
        Scanner terminalInput = new Scanner(System.in);
        int input = 0;
        try {
            System.out.print("Select: ");
            input = terminalInput.nextInt();
        } catch (Exception e){}

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
                System.err.print("EROR!! ");
                if(Utility.getYesNo("Select Again?")){
                    output = selection();
                } else{
                    break;
                }

        }
        return output;
    }


    public static Player setPlayer(int input){
        Player output = null;
        switch (input){
            case 1:
                output = playerArrayList().get(0);
                break;
            case 2:
                output = playerArrayList().get(1);
                break;
            case 3:
                output = playerArrayList().get(2);
                break;
            case 4:
                output = playerArrayList().get(3);
                break;
            case 5:
                output = playerArrayList().get(4);
                break;
        }

        return output;
    }

    public static Armor setArmor(int input){
        Armor output = null;
        switch (input){
            case 1:
                output = armorArrayList().get(0);
                break;
            case 2:
                output = armorArrayList().get(1);
                break;
            case 3:
                output = armorArrayList().get(2);
                break;
            case 4:
                output = armorArrayList().get(3);;
                break;
            case 5:
                output = armorArrayList().get(4);
                break;
        }
        return output;
    }

    public static Weapon setWeapon(int input){
       Weapon output = null;
        switch (input){
            case 1:
                output = weaponArrayList().get(0);
                break;
            case 2:
                output = weaponArrayList().get(1);
                break;
            case 3:
                output = weaponArrayList().get(2);
                break;
            case 4:
                output = weaponArrayList().get(3);
                break;
            case 5:
                output = weaponArrayList().get(4);
                break;
        }
        return output;
    }

}
