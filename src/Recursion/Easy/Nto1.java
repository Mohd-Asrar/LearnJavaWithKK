package Recursion.Easy;

public class Nto1 {
    public static void main(String[] args) {
        nto1(5);
    }
    public static void nto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        nto1(n-1);
    }
}
