package com.itacademija.domaci._switch;

import java.util.Scanner;

public class DaniUNedelji {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj dana:");
        int redniBrojDana = new Scanner(System.in).nextInt();
        switch(redniBrojDana){
            case 1:{
                System.out.println("Ponedeljak");
            } case 2:{
                System.out.println("Utorak");
                break;
            } case 3:{
                System.out.println("Sreda");
                break;
            } case 4:{
                System.out.println("Cetvrtak");
                break;
            } case 5:{
                System.out.println("Petak");
                break;
            } case 6:{
                System.out.println("Subota");
                break;
            } case 7:{
                System.out.println("Nedelja");
                break;
            } default:
                System.out.println("Sedmica ima  7 dana");

        }
    }
}
