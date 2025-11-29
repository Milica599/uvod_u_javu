package com.itacademija.domaci.petlje;

import java.util.Random;
import java.util.Scanner;

public class Slucajnost {
     public static void main(String[] args) {
         int slucajanBroj = new Random().nextInt(20);
         int broj;
         do{
             broj = new Scanner(System.in).nextInt();
             if(broj == slucajanBroj){
                 System.out.println("Pogodili ste broj");
             }else{
                 System.out.println("Pokusajte ponovo");
             }
         }while(broj!=slucajanBroj);
    }
}
