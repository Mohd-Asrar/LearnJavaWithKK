package Function_Methods;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isprime(n));
    }

    static boolean isprime(int a){
        if( a <=1){
            return false;
        }
        int c =2;
        while(c * c <=a){
            if(a % c ==0){
                return false;
            }
            c++;
        }

        return true;


      /*

      //  You can use this

        if(c * c >a){
            return true;
        }
        return false;
       */


//      return c * c >a;    or You can use this also

    }
}
