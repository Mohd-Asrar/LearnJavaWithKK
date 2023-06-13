package Recursion.Easy;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(palindrome(12345678987654321L));

    }
    public static boolean palindrome(long n){
        return n == rev(n);
    }

    public static long rev(long n) {

        int digits = (int)Math.log10(n)+1;
        return helper(n, digits);
    }

    public static long helper(long n, int digits){
        if(n % 10 == n){
            return n;
        }

        long rem = n%10;
        return rem * (long) (Math.pow(10, digits - 1)) + helper(n/10, digits-1);

    }


}
