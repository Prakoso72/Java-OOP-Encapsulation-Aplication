package com.prakoso.operator;

import java.util.Scanner;

public class Utility {

    public static void clearScreen(){
        try{
            if(System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else{
                System.out.print("\033\143");
            }
        } catch (Exception e){
            System.err.println("tidak bisa clear screen");
        }
    }

    public static void enter(){
        Scanner enterTerminal = new Scanner(System.in);
        String enter = "enter";
        enter = enterTerminal.nextLine();
    }
}
