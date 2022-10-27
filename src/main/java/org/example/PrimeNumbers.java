package org.example;

public class PrimeNumbers {
    public static void main(String[] args) {
        //Generate i from 2 to 20

        for (int i = 2; i <= 20; i++) {
            //reset flag
            boolean flag = true;
            //Generate j from 2 to i-1
            for (int j = 2; j <= i - 1; j++) {
                //check if i/j remainder is 0
                if (i % j == 0) {
                    //set as false if remainder is 0
                    flag = false;
                }
            }
            //set as true if remainder is not 0
            if (flag == true) {
                //System.out.println("....");
                System.out.println(i + "");
               // System.out.println("PN=" + i);

            }
        }
    }
}
