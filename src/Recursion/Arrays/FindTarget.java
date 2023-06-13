package Recursion.Arrays;

import java.util.ArrayList;

public class FindTarget {
    public static void main(String[] args) {

        int[]arr ={4,5,4,8};
        int target = 4;

        System.out.println(searchTarget(arr,target,0));
        System.out.println(searchTargetIndex(arr, target, 0));
        System.out.println(searchTargetIndexFromLast(arr,target,arr.length - 1));
        searchAllIndex(arr, target, 0);
        System.out.println(list);

        System.out.println(searchAllTargetPassingList(arr, target, 0,new ArrayList<>()));

    }

    public static boolean searchTarget(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || searchTarget(arr, target, index+1);
    }

    public static int searchTargetIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return searchTargetIndex(arr, target, index+1);
        }

    }

    public static int searchTargetIndexFromLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return searchTargetIndexFromLast(arr, target, index - 1);
        }
    }


    static ArrayList<Integer> list = new ArrayList<>();

    public static void searchAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }

        searchAllIndex(arr, target, index+1);
    }

    public static ArrayList<Integer> searchAllTargetPassingList(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
       return searchAllTargetPassingList(arr, target, index+1, list);
    }
}
