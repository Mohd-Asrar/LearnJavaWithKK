package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,-1,-78,9,1,3,5};
        int target = -78;
        int start = 3;
        int end =8;
        System.out.println(rang(arr, target, start, end));


    }

    static int rang(int[] arr, int target, int start, int end){
        if(arr.length<start || arr.length<end){
            return -1;
        }

        for (int i = start ; i <= end ; i++) {
            if(arr[i]== target){
                return i;
            }
        }
        return -1;
    }
}
