package Function_Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

//       int ans =  sum2();
//        System.out.println(ans);

       int ans1=  sum3(33, 89);
        System.out.println(ans1);




    }


    static void sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum is = " + sum);

    }


    // return the value
    static int sum2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    //Pass the value of numbers when you are calling the methods from main()

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }
}
