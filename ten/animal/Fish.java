package com.itacademija.ten.animal;

public class Fish extends Animal{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Br Br Br...");
    }
}