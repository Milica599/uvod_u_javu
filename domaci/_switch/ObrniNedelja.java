package com.itacademija.domaci._switch;

import java.util.Scanner;

public class ObrniNedelja {
    public static void main(String[] args) {
        System.out.println("Unesite naziv dana u nedelji");
        String dan = new Scanner(System.in).nextLine();
        int redniBrojDana = switch (dan){
          case "Ponedeljak" -> 1;
          case "Utorak" -> 2;
          case "Sreda" -> 3;
          case "Cetvrtak" -> 4;
          case "Petak" -> 5;
          case "Subota" -> 6;
          case "Nedelja" -> 7;
          default -> 0;
        };

        if(redniBrojDana==0){
            System.out.println("Nije nesto dobro");
        }else{
            System.out.println(redniBrojDana);
        }
    }
}
