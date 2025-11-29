package com.itacademija.domaci.petlje;

import java.util.Scanner;

public class UnosWhile {
    public static void main(String[] args) {
        int broj = new Scanner(System.in).nextInt();
        while(broj<0){
            System.out.println("Broj treba biti pozitivan");
            broj=new Scanner(System.in).nextInt();

        }
        System.out.println("Uneli ste dobar proj-");

    }
}
