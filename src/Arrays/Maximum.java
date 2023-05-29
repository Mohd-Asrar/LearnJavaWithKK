package Arrays;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,7,9,3535,11,34,0,87,98,54,76,9877};


        System.out.println(max(arr));

        System.out.print("From where to where You want to find max : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = maxInRange(arr, a,b);
        System.out.println("From "+a+" to "+b+" "+ans+" is Maximum in this Array");
    }

    // Find Max of an array
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }


    //Find Max from array at specific index
    static int maxInRange(int[] arr, int start, int end){
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
