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

    public static boolean getYesNo(String massage){

        Scanner getYesNoInput = new Scanner (System.in);
        String userInput;
        boolean outputBoolean;

        System.out.print("\n" + massage + " y/n : ");
        userInput = getYesNoInput.next();

        while (!userInput.equalsIgnoreCase("y") && !userInput.equalsIgnoreCase("n")){
            System.err.println("Wrong Keyword!");
            System.out.print("\n" + massage + " y/n : ");
            userInput = getYesNoInput.next();
        }

        outputBoolean = userInput.equalsIgnoreCase("y");
        System.out.println();

        return outputBoolean;
    }
}
