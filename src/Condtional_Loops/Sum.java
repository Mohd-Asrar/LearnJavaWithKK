package Condtional_Loops;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Values");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println("Condtional_Loops.Sum = "+ sum);
//        int f = (int)(654.653f);
//        System.out.println(f);

        byte b = 23;
        short s = 1024;
        char c = 'e';
        int i = 12;
        float f = 23.54635f;
        double d = 45.54643;
        double result = (f * b) + (i / c) - (d * s);
        // float + int  - double = double
        System.out.println(result);


    }
}
