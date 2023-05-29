package CyclicSortQuestion;

public class FindTheDublicateNumber {
    public static void main(String[] args) {
        int[] arr= {3,1,3,4,2};
        System.out.println(dublicateNumber(arr));

    }

    public static int dublicateNumber(int[] arr){
        int i=0;
        while(i < arr.length){
            if(arr[i] != i+1){
                int correct = arr[i]-1;
                if(arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else{
                    return arr[i];
                }

            }else{
                i++;
            }
        }

        return -1;
    }


    public static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
