package BinarySearch;

public class CielingOfNumber {
    public static void main(String[] args) {

      int[] arr = {2,4,6,8,9,10,12,14};
      int target =15;
      System.out.println(cielingOfANumber(arr, target));

}

//   Search the  smallest number which is greater or equal to  target!
    public static  int cielingOfANumber(int []arr, int target){


        if(target > arr[arr.length-1]) return -1;

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

        return start;
    }
}
