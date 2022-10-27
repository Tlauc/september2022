package org.example;

public class Fibonacci {
    public static void main(String args[]) {
        int n1 = 1, n2 = 2, n3, i, count = 9;
        System.out.print(n1 + " " + n2);//printing 1 and 2

        for (i = 2; i < count; ++i)//loop starts from 3 because 1 and 2 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

//            int n1=1;
//            int n2=2;
//            int i=2;
//            int c=9;
//            int n3=n2+n1;
//                System.out.println(n1);
//                System.out.println(n2);
//            for (i=2;i<c; i++ ){
//               //
//                n3=n2+n1;
//                System.out.println(" "+n3);
//                n1=n2;
//                n2=n3;
//            }



