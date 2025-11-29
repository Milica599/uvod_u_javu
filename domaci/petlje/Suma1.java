package com.itacademija.domaci.petlje;

import java.util.Scanner;

public class Suma1 {
   public static void main(String[] args) {
        System.out.println("Racunamo sumu");
        int suma = 0;
        int broj = 0;
        while (broj >= 0){
            System.out.println("Unesite broj");
            broj =new Scanner(System.in).nextInt();
            if(broj==-1){
                break;
            }else{
                suma=suma+broj;
            }
        }
       System.out.println(suma);
    }
}

