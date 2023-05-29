package Function_Methods;

import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q: take input of 2 numbers and print sum
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of 2 number is: "+sum);

    }

     /*

     SYNTAX FOR Method/Function
    Acces_modifier return_type name (arguments){

          Body

    return statement

    }
     */


}
