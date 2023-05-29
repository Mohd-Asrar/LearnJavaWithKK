package LinearSearch;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,},
                {12,23,34,45,56},
                {76,65,54,43},
                {9,8,7}
        };

        System.out.println(Integer.MIN_VALUE);
        System.out.println(max(arr));
    }

    static int  max(int[][] arr){
        if(arr.length== 0){
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]> max){
                   max = arr[row][col];
                }
            }
        }
        return max;
    }
    }

