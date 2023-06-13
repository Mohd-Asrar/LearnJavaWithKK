package Recursion.Questions;

import java.util.Scanner;

public class ClimingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ClimbingStairs(n));

    }


    public static int ClimbingStairs(int n){
        if(n==1 || n==2){
            return n;
        }

        int temp1 = ClimbingStairs(n-1);
        int temp2 = ClimbingStairs(n-2);

        return temp1 + temp2;
    }

}
