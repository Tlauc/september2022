package org.example;

public class MainM_Enum {
    enum PhoneType{
        SAMSUNG,
        IPHONE,
        HTC,
        NOKIA,
        AWAI,
        INFINIX,
        TECNO,
        HUAWEI,
    }

    public static void main(String[] args) {
        //To print PhoneType
      System.out.println(PhoneType.IPHONE);
        System.out.println(PhoneType.TECNO);
    }
}
