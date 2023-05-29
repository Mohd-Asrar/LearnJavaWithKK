package BinarySearch;

public class OredrAgnosticBS {
    public static void main(String[] args) {

//        int[] num = {2,4,6,8,10,12,23,43,56,76,87,89,98};
        int[] num = {98,8,78,67,56,45,34,23,12,9,6,4,1,-1,-13,-43};
        int target = -1;

        int ans = orderAgnosticBS(num, target);
        System.out.println("Target is present at index : "+ans);
    }

    static int orderAgnosticBS(int[] arr , int target){

        int start =0;
        int end = arr.length-1;

        //First check Array is ascending order or descending order
        boolean isAsc = arr[start]< arr[end];
        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]  ){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else {
                if(  target > arr[mid]){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
