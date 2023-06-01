package Recursion.Intro;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibo(40));

    }

    public static int fibo(int n){
        //Base Case
        if(n < 2){
            return n;
        }


        return fibo(n-1) + fibo(n-2);
    }
}
