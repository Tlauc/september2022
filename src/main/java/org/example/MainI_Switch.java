package org.example;

public class MainI_Switch {
    public static void main(String[] args) {
        int dayOfTheWeek=4;
        switch (dayOfTheWeek)  {
            case 1:
                System.out.println("Sunday");
                //break stops if it's correct
                break;
        case 2:
        System.out.println("Monday");
        break;
            case 3:
                System.out.println("Tueday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please enter a valid number btw 1 and 7");

    }

}
}

