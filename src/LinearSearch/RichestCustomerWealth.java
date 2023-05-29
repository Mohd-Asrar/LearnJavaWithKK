package LinearSearch;


public class RichestCustomerWealth {
    public static void main(String[] args) {


        int[][] account = {
                {1,2,3},
                {2,4,6,8},
                {6,5,4,3,2,1},
                {8,9,5,2,1},
                {9,4,3,1}
                        };

        System.out.println(maxWealth(account));
    }

    static int maxWealth(int [] [] arr){

        if(arr.length==0)return -1;

        int max =Integer.MIN_VALUE ;

        for (int i = 0; i <arr.length ; i++) {
            int tempwealth=0;
            for (int j = 0 ; j <arr[i].length ; j++) {
                tempwealth += arr[i][j];
            }
            if(tempwealth > max){
                max =tempwealth;
            }
        }
        return max;
    }
}
