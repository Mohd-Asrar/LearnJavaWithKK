package CyclicSortQuestion;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr ={3,4,-1,1};//1,2,0        // 7,8,9,11,12
        System.out.println(firstMissingPositive(arr));

    }

    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct =nums[i]-1;
            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }

        return nums.length+1;

    }

    public static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
