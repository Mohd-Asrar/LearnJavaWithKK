package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr ={-90,-99,-98,99,-99,-98,4,7,3,2,8,9,10,123};

//        bubbleSort(arr);
//        selectionSort(arr);

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {

                if(arr[j]< arr[j-1]){
                    swap(arr, j,  j-1);
                }else {
                    break;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1-i;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static int getMaxIndex(int[]arr, int start, int end){
        int max = start;
        for(int i =start; i<=end; i++){
            if(arr[max]< arr[i]){
                max =i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }

    static void bubbleSort(int[] arr){

        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped =false;
            for (int j=1; j< arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                   swap(arr,j,j-1);
                    swapped=true;
                }
            }
            if (!swapped){    // Means no swapped happen means array is sorted so break the loop
                break;
            }
        }
    }
}
