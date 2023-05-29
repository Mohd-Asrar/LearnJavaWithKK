package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3,4,},
                {12,23,34,45,56},
                {76,65,54,43},
                {9,8,7}
        };

        int target = 7;

        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int [] search(int[][] arr, int target){
        if(arr.length== 0){
            return new int[] {-1,-1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]== target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
