package Recursion.MergerSort;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr ={-9,8,7,5,5,-1,3,2,1,8,3,1,2};

        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSortInPlace(int[] arr, int s, int e) {
        if(e -s ==1){
            return;
        }

        int mid = s +(e -s)/2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    public static void mergeInPlace(int[] arr, int s, int mid, int e) {

        int [] mix = new int[e-s];
        int i=s;
        int j = mid;
        int k=0;


        while (i < mid && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
