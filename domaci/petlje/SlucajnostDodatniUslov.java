package com.itacademija.domaci.petlje;

import java.util.Random;
import java.util.Scanner;

public class SlucajnostDodatniUslov {
    public static void main(String[] args) {
        int slucajanBroj = new Random().nextInt(20);
        int broj=0;
        int brojPokusaja = 0;
        do{
            broj = new Scanner(System.in).nextInt();
            if(broj == slucajanBroj){
                System.out.println("Pogodili ste broj");
            }else{
                System.out.println("Pokusajte ponovo");
                brojPokusaja++;
            }
        }while(broj!=slucajanBroj && brojPokusaja < 5);
    }
}
