package Recursion.Easy;

public class CountZeroes {
    public static void main(String[] args) {

        System.out.println(countZeroes(1000100001));
        System.out.println(countzero1(1000100001));

    }

    public static int countZeroes(int n){
        if(n == 0){
            return 0;
        }


        int rem = n %10;
        if(rem == 0){
          return  1 + countZeroes(n/10);
        }

       return countZeroes(n/10);
    }

    public static int countzero1(int n){

        return helper(n, 0);

    }

    // Special pattern, How tp pass a value to above calls;
    public static int helper(int n, int c){
        if(n == 0){
            return c;
        }

        int rem = n %10;
        if(rem == 0){
            return helper(n/10, c+1);
        }

        return helper(n/10, c);
    }
}
