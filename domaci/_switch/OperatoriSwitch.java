package com.itacademija.domaci._switch;

import java.util.Scanner;

public class OperatoriSwitch {
   public static void main(String[] args) {
       System.out.println("Molimo unesite neki  od ponudjenih operatora (+,-,*,/)");
       char operator = new Scanner(System.in).next().charAt(0);
       System.out.println("Unesite prvi broj");
       int broj1 = new Scanner(System.in).nextInt();
       System.out.println("Unesite drugi broj");
       int broj2 = new Scanner(System.in).nextInt();
       if(broj2==0){
           while(broj2 ==0){
               System.out.println("Unesite broj razlicit od 0");
               broj2 = new Scanner(System.in).nextInt();
           }
       }

       int askiop = (int)operator;
       //+: 43 -:45 *:42 /:47
       int rezultat = switch (askiop){
           case 43 -> broj1 + broj2;
           case 45 -> broj1-broj2;
           case 42 -> broj1 * broj2;
           case 47 -> broj1/broj2;
           default -> 0;
       };
       System.out.println(rezultat);
    }
}
