package com.itacademija.domaci.petlje;

import java.util.Scanner;

public class UnosDoWhile {
   public static void main(String[] args) {
       System.out.println("Korisnik unosi neki ceo broj ");
       int granicnik = new Scanner(System.in).nextInt();
       int broj = granicnik;
       do{
           System.out.println(broj);
           broj--;
       }while(broj>0);



    }
}
