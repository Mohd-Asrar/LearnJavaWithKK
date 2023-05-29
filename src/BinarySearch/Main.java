package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int[] num = {2,4,6,8,10,12,23,43,56,76,87,89,98};
        int target = 87;
        int ans = binarySearch(num, target);
        System.out.println("Target is available at index :"+ ans);


    }
    static int binarySearch(int[] arr , int target){

        int start=0;
        int end = arr.length-1;

        while (start<=end){

//            int mid = (start+end)/2;   // This may exceed the range of int so better way use other way to find mid
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;

            }
            if (arr[mid] < target) {
                start = mid+1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }
}
