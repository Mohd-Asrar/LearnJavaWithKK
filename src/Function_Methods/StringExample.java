package Function_Methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String message  = greet();
//        System.out.println(message);

//        System.out.println(greet());

        System.out.print("Enter Your name : ");
        String name = sc.nextLine();
        String personalised = greets(name);
        System.out.println(personalised);
    }

        static String greets(String name) {

//        String message = "Hello "+ name;
//        return message;

            return "hello "+ name;
    }

    static String greet(){
//        String greeting = "Hello Buddy How are you";
//        return greeting;

        return "Hey Buddy! How Are You";
    }
}
