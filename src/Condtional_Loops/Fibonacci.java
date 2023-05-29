package Condtional_Loops;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to check f or not");
        boolean flag =false;

        int f = sc.nextInt();

        int a=0;
        int b=1;
        for(int i=2; i<=f; i++){
          int temp =b;
          b= a+b;
          a=temp;
          if(f==b){
              flag=true;
          }
//          System.out.println(b);

        }
        System.out.println(b);
        if(flag){
            System.out.println("it is fibonacci");
        }else{
            System.out.println("it is not");
        }

    }
}
