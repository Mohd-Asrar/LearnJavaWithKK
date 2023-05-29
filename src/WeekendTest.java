import java.util.Arrays;

public class WeekendTest {
    public static void main(String[] args) {
        int [ ] arr ={10,1,4,7};

//        Arrays.sort(arr);
        int start =0;
        int end = arr.length-1;
        int finalsum = 0;
        while(start < end){
            if(finalsum< arr[start] + arr[end]){
                finalsum = finalsum+ arr[start] + arr[end];
                arr[end] = finalsum;
                start++;
            }

        }

        System.out.println(finalsum);



    }
}
