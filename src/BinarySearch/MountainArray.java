package BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4,5,7,3,2,1,0};
        System.out.println(peakInArray(arr));

    }
    public   static int peakInArray(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end -start)/2;

            if(arr[mid]> arr[mid+1]){
                //This means you are in decreasing part so check in left
                // This maybe the answer but look at left side
                // that is why end = mid not end = mid-1
                end=mid;
            }else {
                //This means you are in asc part so check in rigth
                // and bcz mid-element is less than mid+1 element we don't need to check mid again so here start will become mid+1
                start = mid+1;
            }
        }

        // hence at the end both end and start are pointing to the biggest element bcz of above checks we can return anyone

        return start;  // or return end;
    }
}
