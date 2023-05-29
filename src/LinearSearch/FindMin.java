package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] num = {2,4,6,8,-1,-78,9,1,3,5};

        System.out.println(min(num));
    }

    static int min(int[] arr){
        int min = arr[0];

        // Solve using For Loop
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]< min){
                min = arr[i];
            }
        }

        // Solve using For each  Loop
//        for(int element : arr){
//            if(element< min){
//                min = element;
//            }
//        }
        return min;
    }

}
