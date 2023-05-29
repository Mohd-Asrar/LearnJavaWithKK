package Recursion;

public class Message {
    public static void main(String[] args) {
        message();

    }

    public static void message(){
        System.out.println("Hello Dunya");
        message1();
    }

    public static void message1(){
        System.out.println("Hello Dunya");
        message2();
    }


    public static void message2(){
        System.out.println("Hello Dunya");
        message3();
    }

    public static void message3(){
        System.out.println("Hello Dunya");
        message4();
    }

    public static void message4(){
        System.out.println("Hello Dunya");
    }
}
