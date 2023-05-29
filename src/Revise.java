import java.util.ArrayList;

public class Revise {
    public static void main(String[] args) {
        int[]arr = {1,2,5,3,4,7,6,9,8,10,11};

//        bubble(arr);
//        selection(arr);
//        insertion(arr);
//        cyclicSort(arr);
//        System.out.println(Arrays.toString(arr));

        decToBin(51);



    }

    public static void bubble(int[] arr){
        boolean checkswap;
        for (int i = 0; i < arr.length; i++) {
             checkswap= false;
            for (int j = 1; j <arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                    checkswap = true;
                }
            }
            if(!checkswap){
                break;
            }

        }
    }

    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1-i;
            int maxIndex = getMax(arr, 0, last);
            swap(arr, last, maxIndex);
        }
    }

    public static int getMax(int[]arr, int start, int end){
        int max = start;
        for (int i = start; i <=end ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void insertion(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]< arr[j-1]){
                    swap(arr,j, j-1);
                }else {
                    break;
                }
            }

        }
    }

    public static void cyclicSort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
    }

    public static void swap(int[]arr, int first, int end){
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
    }


    public static void decToBin(int n){
       ArrayList<Integer> ans = new ArrayList<>();
        int index =0;

        while(n>0){
            ans.add(n%2);
            index++;
            n/=2;
        }

        for(int i=ans.size()-1; i>=0; i--){
            System.out.print(ans.get(i));
        }
    }

}
