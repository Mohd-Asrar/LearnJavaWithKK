package Recursion.Easy;

public class Nto1Than1toN {
    public static void main(String[] args) {
        nto1Than1toN(5);

    }

    public static void nto1Than1toN(int n){
        if (n==0){
            return;
        }

        System.out.println(n);
        nto1Than1toN(n-1);
        System.out.println(n);
    }
}
