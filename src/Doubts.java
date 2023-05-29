import BinarySearch.MountainArray;

import java.util.*;


public class Doubts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int[] arr = {1,2,3,4,5,7,9,10,14,17,19,33};
//        int target = 35;
//        System.out.println(cieliengOfANumber(arr, target));
////        String key = "Asrar";
////        System.out.println(key.charAt(0));
//
//        int [] arr = {1,2,3,4,5,6,7,8};
//
//        int [] copy = Arrays.copyOf(arr,arr.length);
//        System.out.println(Arrays.toString(copy));
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < copy.length; i++) {
//            list.add(copy[i]) ;
//        }
//
//        Collections.reverse(list);
//        System.out.println(list);

//        String arr="ABcBA";
//
//        System.out.println(isPalindrome(arr));

//        char[] arr= {'A','B','D','F','J','K','L','M'};
//        char target = 'F';
//        System.out.println(smallestLetterGreaterThanTarget(arr, target));

//        int[] arr = {5,7,7,7,7,7,7,7,7,7,7,7,7,7,8,8,8,8,8,8,9,9,9,9,9,10};
//        int target =7;
//
//        int[] ans = {-1,-1};
//        ans[0] = firsAndlastPositionofGivenTargetInSortedArray(arr, target,true);
//        ans[1] = firsAndlastPositionofGivenTargetInSortedArray(arr,target, false);
//
//        System.out.println(Arrays.toString(ans));

//        int[] arr = {1,2,3,4,5,8,9,13,15,16,18,19,23,25,27,28,31,33,34,35,37,39,99};
//        int target =23;
//        System.out.println( "In infinite Array Target is availabl at index : "+ findInInfiniteArray(arr, target));

//        int[] arr = {1,2,1,3,5,6,4};
//        System.out.println(mountainOrBitonicArray(arr));

//
//        int[] arr = {1,2,1,3,5,6,4};
//        System.out.println(findPeakIndex(arr));

//           int[] arr ={5,1,3};
//           int target=3;
//        System.out.println(findPeakIndex(arr));

        /*
        w
        wx
        wxy
        wxyz
        x
        xy
        xyz
        y
        yz
        z
         */
//
        String str ="aabaa";
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                StringBuilder ans = new StringBuilder();
                for (int k = i; k <= j; k++) {
                  ans.append(str.charAt(k));
                }
                if(isPalindrome(ans)){
                    count++;
                }

            }
        }

        System.out.println(count);

    }

    public static boolean isPalindrome(StringBuilder str){
        int start =0;
        int end = str.length()-1;

        while (start <= end){
          if(str.charAt(start) != str.charAt(end)){
              return false;
          }
          start++;
          end--;
        }

        return true;
    }


    static int cieliengOfANumber(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            }else if(target > arr[mid]){
                start= mid+1;
            }else {
                end = mid-1;
            }
        }

        return start;
    }

    static char smallestLetterGreaterThanTarget(char[] arr, char target){

        if(target > arr[arr.length-1]) {
            return arr[0];
        }

        int start =0;
        int end =arr.length-1;

        while(start<= end){
            int mid = start + (end - start)/2;

            if(target >= arr[mid]){
                start = mid+1;
            }else {
                end = mid -1;
            }
        }
        return arr[start ];
    }

    static int firsAndlastPositionofGivenTargetInSortedArray(int[] arr, int target, boolean findStartIndex){

        int ans =-1;
        int start =0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start +(end- start)/2;

            if (arr[mid] == target){
                ans = mid;
                if (findStartIndex){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }else if(arr[mid] > target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }


    static  int findInInfiniteArray(int[] arr, int target){
        int start =0;
        int end = 1;

        while(arr[end] > target){
            // store  start
            int newStart = end+1;

            end = end +(end - start +1)*2;
            start = newStart;
        }



        return findInRange(arr, target, start, end);
    }

    static int findInRange(int[] arr, int target, int start, int end){

        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return -1;
    }


    static  int mountainOrBitonicArray(int[] arr){

        int start =0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }






    //FindinMountainArray

    static int findInMountain(int[] arr, int target){

        int peak = findPeakIndex(arr);

        int findInFirstHalf = searchelement(arr, target, 0, peak);

        if(findInFirstHalf != -1){
           return findInFirstHalf;
        }

           return searchelement(arr, target, peak+1, arr.length-1);
    }

    static int searchelement(int[] arr, int target, int start, int end){
        while( start<= end){
            int mid = start + (end - start)/2;

            if(arr[mid] > target){
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }




    static int findPeakIndex(int[] arr){

        int start =0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }



}
