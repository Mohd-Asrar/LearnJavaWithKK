package Recursion.Arrays;

public class Sorted {
    public static void main(String[] args) {

        int[] arr = {1,2,2,4,60,8};
        System.out.println(sorted(arr));

    }

    public static boolean sorted(int[] arr){
        return helper(arr, 0);
    }

    public static boolean helper(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }

        return arr[index] <= arr[index + 1] && helper(arr, index + 1);
    }
}
