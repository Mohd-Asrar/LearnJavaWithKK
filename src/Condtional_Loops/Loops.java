package Condtional_Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Syntax :

        for(initialisation; condition; increment/ decrement){

            //Body

        }
         */


        //Q:  Print number from 1 to 5!
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i);
        }

        //Q:  Print number from 1 to n!
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
//            System.out.println(i);

            System.out.println("Hello World!");
        }


         /*
        Syntax :

        while(condition){

           //Body

        }
         */

        int num =1;
        while(num<=10){
            System.out.println(num);
            num+=1;
        }

         /*
        Syntax :

        //This will execute once always because first body run then condition check

          do{
          //Body

          } while(condition);
         */

        int a=10;

        do{
            System.out.println("I will run once either condition is true or false");
        }while (a<10);



    }
}
