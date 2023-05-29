package BinarySearch;

import java.util.Arrays;

public class FirstandLastIndex {
    public static void main(String[] args) {
        int [] nums ={1,2,3,7,7,7,7,7,7,7,8,8,9};
        int target =7;
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }

    static int[] searchRange(int[] arr, int target){
        int[] ans = {-1,-1};

        int start = search(arr,target,true);
        int last = search(arr,target,false);

        ans[0]= start;
        ans[1] = last;

        return ans;
    }

    static int search(int[] arr, int target, boolean searchInstart){
        int ans =-1;

        int start =0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end- start)/2;

            if(arr[mid] > target){
                end =mid -1;
            } else if (arr[mid]< target) {
                start = mid+1;
            }else {
                ans = mid;
                if(searchInstart){
                    end = mid-1;
                }else {
                    start = mid+1;
                }

            }
        }
        return ans;

    }
}
