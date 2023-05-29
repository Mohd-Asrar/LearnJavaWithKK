package Arrays;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] arr = {23,43,54,65,76,87,98};
        System.out.println(Arrays.toString(arr));
        changeValue(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void changeValue(int[] arr){
        arr[1] = 100;
    }
}
