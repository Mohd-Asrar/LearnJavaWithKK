package Arrays;

public class SubArray {
    public static void main(String[] args) {
        char[] arr ={'A','B','C','D'};
        printSubArray(arr);
    }

    static void printSubArray(char [] arr){
        for (int i = 0; i < arr.length; i++) {
            String subArray = "";
            for (int j = i; j <arr.length ; j++) {
                subArray+=arr[j];
                System.out.println(subArray);
            }
            System.out.println();

        }
    }
}
