package com.itacademija.domaci.petlje;
import java.util.Scanner;
public class Meni {
    public static void main(String[] args) {
        String izbor;
        do{
            System.out.println("Unesite jednu od tri ponudjene reci: Start Help Exit");
            izbor=new Scanner(System.in).nextLine();
            switch(izbor){
                case "Start":{
                    System.out.println("Start");
                    break;
                }
                case "Help":{
                    System.out.println("Help");
                    break;
                }
                case "Exit" :{
                    System.out.println("Exit je kraj");
                    break;

                } default:{
                    System.out.println("Jednu od ponudjenih reci molim");
                    break;
                }
            }
        }while(!izbor.equals("Exit"));

    }
}
