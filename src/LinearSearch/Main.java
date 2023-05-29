package LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] nums ={2,4,6,1,98,19,45,-56,865,-13,89,98,74,6,-1,-3};
        int target = -13;

        System.out.println(linearSearch(nums,target));

        System.out.println(linearSearch2(nums, target));

    }


    // Search the element in Array and return index if it is found otherwise return -1
    static int linearSearch(int[] arr , int target){
        if(arr.length==0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }


    // Search the element in Array and return element if it is found otherwise return -Infinity
    static int linearSearch2(int[] arr , int target){
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }

       for(int element : arr){
           if(element == target){
               return element;
           }
       }
        return Integer.MIN_VALUE;
    }
}
