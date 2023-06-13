import java.util.ArrayList;
import java.util.Arrays;

public class Revise {
    public static void main(String[] args) {
        int[]arr = {1,2,5,4,-2,10,-3,-99,23,2,1,3,1};
//        quicksorttt(arr, 0, arr.length-1);
        mergee(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));


//        bubble(arr);
//        selection(arr);
//        insertion(arr);
//        cyclicSort(arr);
//        System.out.println(Arrays.toString(arr));

//        decToBin(51);

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

    public static void quicksorttt(int[] arr,int s, int e){
        if(s > e){
            return;
        }

        int low = s;
        int high = e;
        int mid = s+(e-s)/2;
        int pivot = arr[mid];

        while(low <= high){
            while(arr[low]<pivot){
                low++;
            }

            while (arr[high] > pivot){
                high--;
            }

            if(low<= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high]= temp;
                low++;
                high--;
            }
        }
        quicksorttt(arr, s, high);
        quicksorttt(arr, low, e);

    }

    public static void mergee(int[] arr, int s, int e){
        if(e - s==1){
            return;
        }

        int mid = s + (e - s)/2;

        mergee(arr, s, mid);
        mergee(arr, mid, e);

        merging(arr, s, mid, e);

    }

    public static void merging(int[] arr, int s, int mid, int e){
        int [] mix = new int[e-s];

        int i=s;
        int j = mid;
        int k=0;

        while (i < mid && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }

            k++;
        }

        while (i< mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j< e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];

        }
    }

}
