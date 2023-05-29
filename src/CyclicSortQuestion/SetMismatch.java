package CyclicSortQuestion;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {

        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));

    }

    public static int[] findErrorNums(int[] nums) {

        int j=0;
        while(j< nums.length){
            int correct = nums[j] -1;
            if(nums[j] != nums[correct]){
                swap(nums, j, correct);
            }else{
                j++;
            }
        }
        int[] ans ={-1,-1};
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                ans[0] = nums[i];
                ans[1] = i+1;
            }
        }

        return ans;

    }

    public static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
