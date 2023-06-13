package Recursion.MergerSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr={5,4,3,2, 1};

        // copy of this arr is sorted not this one means iski value dusre arr me gai hai or wo sort hua hai ye array sort nahi
        // hua hai bcz function me new arr create ho raha hai or wohi return hoga ye sort nahi hoga
//        mergerSort(arr);
//        System.out.println(Arrays.toString(arr));
        // agar aise print kroge to same arr aega not sorted wala
        // So you can replace like this
//           |

        arr = mergerSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] mergerSort(int[] arr){
        //Base Case
        if(arr.length <=1){
            return arr;
        }
        int mid = arr.length/2;

        int [] left = mergerSort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mergerSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merger(left, right);
    }

    public static int[] merger(int[] first, int[] second) {

        int [] mix = new int[first.length + second.length];

        int i=0;
        int j=0;
        int k =0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i] ;
                i++;
            }else {
                mix[k] =  second[j];
                j++;
            }
            k++;
        }

        // it maybe happens that one of array is finish and second one have value remain so add that value also!
        //  dono me se koi ek hi run krega

        while(i <first.length ){
            mix[k] = first[i] ;
            i++;
            k++;
        }

        while(j <second.length ){
            mix[k] = second[j] ;
            j++;
            k++;
        }

        return mix;
    }
}
