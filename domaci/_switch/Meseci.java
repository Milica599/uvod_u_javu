package com.itacademija.domaci._switch;

import java.util.Scanner;

public class Meseci {
    public static void main(String[] args) {
        System.out.println("Unesi redni broj meseca");
        int redniBrojMeseca = new Scanner(System.in).nextInt();
        String message = switch(redniBrojMeseca) {
            case 1 -> "Januar";
            case 2 -> "Februar";
            case 3 -> "Mart";
            case 4 -> "April";
            case 5 -> "Maj";
            case 6 -> "Jun";
            case 7 -> "Jul";
            case 8 -> "Avgust";
            case 9 -> "Septembar";
            case 10 -> "Oktobar";
            case 11 -> "Novembar";
            case 12 -> "Decembar";
            default -> "Niste dobar broj uneli";
        };
        System.out.println(message);
    }
}
