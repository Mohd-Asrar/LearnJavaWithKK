package BinarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,10,12,14};
        int target =11;
        System.out.println(floorofANumber(arr, target));

    }

//    Search the  biggest number which is smaller or equal to  target!
    public static  int floorofANumber(int []arr, int target){

        int start= 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+ (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return end;
    }
}
