package Recursion.Arrays;

import java.util.ArrayList;

public class FindallTargetIndex {
    public static void main(String[] args) {

        int[] arr = {2,4,3};
        int target = 4;
        System.out.println(findAllIndex(arr, target, 0));

    }

    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
