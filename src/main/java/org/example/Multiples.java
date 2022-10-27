package org.example;

public class Multiples {
    public static void main(String[] args) {

                for (int i = 1 ; i < 101; i++) {

                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println("multiple of three and five");
                    } else if (i % 5 == 0) {
                        System.out.println("multiple of five");
                    } else if (i % 3 == 0) {
                        System.out.println("multiple of three");
                        } else
                            System.out.println(i);

                }
    }
}
