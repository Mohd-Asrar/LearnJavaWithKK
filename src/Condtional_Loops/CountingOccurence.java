package Condtional_Loops;

import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        long a = sc.nextLong();

        System.out.println("Enter a number you want to count Occurence");
        int b= sc.nextInt();

        int count =0;
        while(a>0){
           int c =(int) a%10;
           if(c==b){
               count++;
           }
           a/=10;
        }

        System.out.print(count);
    }
}
