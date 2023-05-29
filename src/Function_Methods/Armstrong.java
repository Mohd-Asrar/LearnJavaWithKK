package Function_Methods;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isArmstrong(a));

        // Print all 3 digit Armstrong numner!

        for (int i = 100; i <=999 ; i++) {
          if(isArmstrong(i)){
              System.out.print(i+ " ");
          }

        }
    }


    // Check 3 digit  number is armstrong or not
    static boolean isArmstrong(int a) {
        int ans =0;
        int copy =a;

        while(copy > 0){
            int rem = copy%10;
            int qube = rem * rem * rem;
            ans+=qube;
            copy/=10;
        }
//        if(ans ==a){
//            return true;
//        }
//        return false;

        return ans ==a;
    }
}
