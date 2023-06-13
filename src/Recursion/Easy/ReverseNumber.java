package Recursion.Easy;

public class ReverseNumber {
    public static void main(String[] args) {

        /* This is like sort of like a cheating

         System.out.println(sum);
         rev1(7865401);
        System.out.println(sum);

         */

        System.out.println(rev2(5786091));
    }

    public static int rev2(int n){
        int digit = (int ) Math.log10(n)+1;
        return helper(n, digit);
    }

    private static int helper(int n, int digit) {
        if(n % 10 == n){
            return n;
        }

        int rem = n % 10;
        return  rem *  (int) (Math.pow(10, digit - 1)) + helper(n/10, digit-1);
    }

    static int sum =0;
    public static void rev1(int n){
        if(n == 0){
            return ;
        }
        int rem = n %10;
         sum *= 10 + rem;
        rev1(n/10);
    }
}
