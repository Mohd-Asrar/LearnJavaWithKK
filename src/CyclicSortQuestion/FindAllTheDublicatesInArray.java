package CyclicSortQuestion;

import java.util.ArrayList;
import java.util.List;

public class FindAllTheDublicatesInArray {
    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(allDublicates(arr));

    }


    public static List<Integer> allDublicates(int[] nums) {

//  Sort the array using cyclic sort bcz arr is from 1 to N
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] -1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                ans.add(nums[j]);
            }
        }

        return ans;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
