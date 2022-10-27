package org.example;

public class MultipleWithAND {
    public static void main(String[] args) {
        int a=3, b=5, n=101;
        for (int i=1; i<n; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("multiple of three and five");
            }
            else if (i == a){
                boolean flag=true;
                a=i+a;
                System.out.println("multiple of three");
            }
            else if (i == b){
                boolean flag=true;
                b=i+b;
                System.out.println("multiple of five");
            }
            else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("multiple of three and five");
            }
            else
                System.out.println(i);
        }
    }
}
