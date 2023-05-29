package BinarySearch;

import java.util.Arrays;
import java.util.Collections;

public class RowColMatrix {
    public static void main(String[] args) {
        int[] [] matrix= {
                {10,20,30,40,50},
                {25,35,45,65,75},
                {37,47,57,67,77},
                {49,59,69,79,89}
                          };


        int target = 89;
        System.out.println(Arrays.toString(search(matrix,target)));

    }

    static int[] search(int[][] matrix, int target){

        int r=0;
        int c = matrix[0].length-1;

        while(r < matrix.length && c >= 0){

            if(matrix[r][c] == target){
                return new int[] {r,c};
            }

            if(matrix[r][c] < target){
                r++;
            }else {
                c--;
            }
        }

        return new int[]{-1,-1};
    }
}
