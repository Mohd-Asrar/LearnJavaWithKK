package SwitchCase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruit = sc.next();

        switch (fruit){
            case "mango":
                System.out.println("King of fruit");
                break;

            case "apple":
                System.out.println("A round red Fruit");
                break;

            case "grapes":
                System.out.println("A small ovel fruit");
                break;

            default:
                System.out.println("Invalid fruit");
        }

//        switch (fruit){
//            case "mango" -> System.out.println("King  of Fruit");
//            case "apple" -> System.out.println("A round red Fruit");
//            case "grapes" -> System.out.println("A small round Fruit");
//            default -> System.out.println("Invalid Fruit");
//        }


        System.out.println("Enter the number which represent today");
        int day = sc.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        System.out.println("Check today is Weekday or Weekend");
        String check = sc.next();
        switch (check){
            case "Monday", "Tuesday", "Wednesday","Thursday" , "Friday" -> System.out.println("Weekday");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Invalid Day");
        }
    }
}
