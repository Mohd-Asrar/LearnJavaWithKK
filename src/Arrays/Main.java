package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int [] rnos;     // Declaration an array
//        rnos  = new int[1];     //  here Actual memory allocate to the array this is called initialisation


//        // Array of primitives
//        int[] arr = new int[5];
//
//
//        //Input of an array
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // Output of an array
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
//
//        // Output of an array using for each loop
//        for (int i : arr) {
//            System.out.println(i+" ");
//        }
//
//        // Output of an array using Arrays.toString
//        System.out.println(Arrays.toString(arr));


        // Array of non primitives (Objects)

        String[] str = new String[4];
        for(int i =0; i<str.length; i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

    }
}
