package BinarySearch;

import java.util.Scanner;

public class InfiniteArray {
    public static void main(String[] args) {
        // Assume you have infinite array, so you don't know the length of array
        // try to find the target in TC O(logN)
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,4,6,8,10,12,14,16,18,20,21,23,24,26,27,29,31,99,231};
        int target = sc.nextInt();

      int ans =  findTarget(arr,target);
      if(ans==-1){
          System.out.println("Target is not present in array");
      }else {
          System.out.println("Target is present at index : "+ans);
      }



    }
    static int findTarget(int[] arr, int target){

//        Assume array at least have 2 index, and we don't know the last index
        int start =0;
        int end =1;

//        if target  is greater than last than it must be after the end bcz it is sorted array so no need to check between start & end
        while(target> arr[end]){
            // storing the start index, so we can update after double the searching box
            int temp = end+1;
            // using this formula  end = previous end  + sizeofBox->(previous end - start +1) after know the size of box just double it *2!
            end = end + (end - start + 1) *2;
            start = temp;
        }

        // If target is less than end than apply BS on that range
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid = start +(end -start)/2;
            if (target== arr[mid]){
                return mid;
            }
            if (target > arr[mid]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }



}
