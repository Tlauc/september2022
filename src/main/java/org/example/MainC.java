package org.example;

public class MainC {
    //How to use increment and decrement
    public static void main(String[] args) {
        int inc = 10;
        System.out.println(inc);
        int newInc = inc++;
        System.out.println(inc);
        int anotherInc=inc++;
        System.out.println(inc);
        System.out.println("----------");

        int dec = 20;
        System.out.println(dec);
        int newDec = dec--;
        System.out.println(dec);
        int anotherDec=dec--;
        System.out.println(dec);
    }
}
