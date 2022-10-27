package org.example;

public class MainK_WhileLoop {
    public static void main(String[] args) {
        // declaring variable a
        int a = 10;
        //while loop to print out 10 to 25
        while(a<26){
            System.out.println(a);
            //increment ++
            a++;
        }
        System.out.println("........");
        int b =20;
        while(b>10){
            System.out.println(b);
            //decrement --
            b--;
         }

        //do while loop
        System.out.println(".....");
        int c = 10;
        do {
            System.out.println(c);
            c++;

        }while(c<26);
    }
}
