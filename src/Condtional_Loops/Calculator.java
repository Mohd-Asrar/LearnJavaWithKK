package Condtional_Loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ans=0;

        while(true){

            System.out.print("Enter the Operator : ");
            char ch = sc.next().trim().charAt(0);

            if(ch=='+' || ch =='-' || ch =='*' || ch =='/' || ch=='%'){
                System.out.print("Enter two numbers : ");

                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(ch=='+'){
                    ans = num1 + num2;
                }
                if(ch=='-'){
                    ans = num1 - num2;
                }
                if(ch=='*'){
                    ans = num1 * num2;
                }
                if(ch=='/'){
                    if(num2 !=0){
                        ans = num1 /num2;
                    }
                }
                if(ch=='%'){
                    ans = num1 % num2;
                }
        }else if (ch =='x' || ch== 'X') {
                break;
            }else{
                System.out.println("Invalid Operation!");
            }

            System.out.println(ans);
            System.out.println("Want to Exit!  PRESS X");
        }
    }
}
