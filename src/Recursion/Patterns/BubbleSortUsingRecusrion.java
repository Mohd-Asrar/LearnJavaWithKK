package Recursion.Patterns;

import java.util.Arrays;

public class BubbleSortUsingRecusrion {
    public static void main(String[] args) {
        int[] arr ={4,3,7,9,10,3,2,78,76,2,1};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

    }

  public static void bubbleSort(int[] arr, int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                swap(arr, c, c+1);
            }
            bubbleSort(arr, r, c+1);
        }
        bubbleSort(arr, r-1, 0);
  }

    public static void swap(int[] arr, int first, int last){
        int temp =arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

    }
}
