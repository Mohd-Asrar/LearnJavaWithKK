package Recursion.QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
     }

    public static void quicksort(int[] arr, int s, int e) {

        if(s > e){
            return;
        }

        int low=s;
        int high =e;
        int mid = s + (e - s)/2;

        int pivot = arr[mid];

        while(low <= high){

            // Also a reason why if its already sorted it will not swap
            while (arr[low] < pivot) {
                low++;
            }

            while (arr[high] > pivot){
                high--;
            }

            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }

        //Now my pivot at correct index , sort two halves now

        quicksort(arr, s, high);
        quicksort(arr, low, e);
    }
}
