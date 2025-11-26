package com.itacademija.five.array;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'a', 't', 'e', 'd'};
        //8 slotova za 8 znakova/slova
        char[] copyTo = new char[8];
        System.arraycopy(copyFrom, 2, copyTo, 0, 8);
        System.out.println(copyTo);
    }
}