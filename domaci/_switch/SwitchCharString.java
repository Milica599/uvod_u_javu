package com.itacademija.domaci._switch;

import java.util.Scanner;

public class SwitchCharString {
    public static void main(String[] args) {
        System.out.println("Unesite neko od ovih slova");
        char slovo = new Scanner(System.in).next().charAt(0);
        int aski = (int)slovo;
        // D:68 C:67 H:72 P:80
         String message=switch(aski){
            case 68 ->"Dog";
            case 67 ->"Cat";
            case 72 ->"Horse";
            case 80 ->"Parrot";
            default ->"Unkow animal";

        };
        System.out.println(message);

    }
}
