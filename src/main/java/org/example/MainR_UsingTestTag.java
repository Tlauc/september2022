package org.example;

import org.junit.jupiter.api.Test;

public class MainR_UsingTestTag {
    @Test
    //you can run with psvm or @Test will be ontop of a method
//    public static void main(String[] args) {
//    or
     public void runTest(){
//    or
         int a=20;
         System.out.println(a<30 && a<40);

         //Logical OR ||
         int b = 5;
         System.out.println(b>5 || b>4);

         //Logical NOT !
         int c =20;
         System.out.println(!(c<21 && c<28));
}
        }

    //Logical Operators
        //Logical AND &&


