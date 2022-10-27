package org.example;

public class MainI_Switch_1 {
    public static String DisplayDayOfTheWeek(int x){
        return switch (x) {
            case 1 -> ("Sunday");
            case 2 -> ("Monday");
            case 3-> ("Tuesday");
            case 4 -> ("Wednesday");
            case 5 -> ("Thursday");
            case 6 -> ("Friday");
            case 7 -> ("Saturday");
            default -> ("Pls enter a valid no from 1 to 7");

        };
    }
    public static void main(String[] args) {
        //Object mainI_switch_1 from Method  MainI_Switch_1
    MainI_Switch_1 mainI_switch_1 = new MainI_Switch_1();
        System.out.println(MainI_Switch_1.DisplayDayOfTheWeek (2));
    }
}
