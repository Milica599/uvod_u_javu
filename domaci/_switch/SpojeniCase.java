package com.itacademija.domaci._switch;

import java.util.Scanner;

public class SpojeniCase {
    public static void main(String[] args) {
        System.out.println("Unesi dan u nedelji");
        String dan = new Scanner(System.in).nextLine();

        switch (dan){
            case "Ponedeljak":
            case "Utorak":
            case  "Sreda":
            case  "Cetvrtak":
            case "Petak":
            {
                System.out.println("radni dan");
            }
            case "Subota":
            case "Nedelja":
            {
                System.out.println("vikend");
            }

        };
    }
}
