package CyclicSortQuestion;

 class MissingNumber{
    public static void main(String[] args) {

        int[]arr={0,3,2,4,1,6,9,7,5};
        System.out.println(missingNumber(arr));



    }

     public static int missingNumber(int[] nums) {

//  Sort the array using cyclic sort bcz arr is from 0 to N
         int i=0;
         while(i<nums.length){
             int correct = nums[i];
             if(nums[i] < nums.length && nums[i] != nums[correct]){
                 swap(nums, i, correct);
             }else{
                 i++;
             }
         }

//    Search for first missing number
         for(int j=0; j<nums.length; j++){
             if(nums[j] != j){
                 return j;
             }
         }

         // case 2  return n
         return nums.length;

     }

     public static void swap(int[] nums, int first, int last){
         int temp = nums[first];
         nums[first] = nums[last];
         nums[last] = temp;
     }
}