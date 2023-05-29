package BinarySearch;

public class FindInMountainArrayLCHArd {
    public static void main(String[] args) {

        int[] arr = {3,4,5,6,9,5};
        int target =5;

        int ans = search(arr, target);
        if(ans == -1){
            System.out.println(" Target Not present in Array");
        }else {
            System.out.println("Target is present at index : " + ans);
        }

    }

    static int search(int[] arr, int target){
      int peak =  findPeak(arr);

        int firstHalf  = searchTarget(arr, target, 0, peak, true);
        if(firstHalf != -1){
            return firstHalf;
        }

        return searchTarget(arr, target, peak+1, arr.length-1, false);
    }

    static int findPeak(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
        }
        return start;
    }


    static int searchTarget(int[] arr, int target, int start, int end, boolean firsthalf){

        int ans =-1;
        while (start< end){
            int mid = start + (end - start)/2;

            if(arr[mid] > target){
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            }else {
                ans = mid;
                if(firsthalf){
                    end = mid -1;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans;

    }
}
