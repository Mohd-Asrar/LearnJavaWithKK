package ArrayList;

import java.util.ArrayList;

public class PairSum1 {
    public static void main(String[] args) {

        // Find target on sorted AL
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target =73;
        System.out.println(sum(list, target));

        System.out.println(sum1(list, target));
    }

    //Brute Force  TCO(n^2)
   static boolean sum( ArrayList<Integer> list, int target){
       for (int i = 0; i < list.size(); i++) {
           for (int j = i+1; j < list.size(); j++) {
               if(list.get(i) + list.get(j)== target){
                   return true;
               }
           }
       }
        return false;
    }

    //Optimized Approach 2 pointers  TC O(n)

    static boolean sum1(ArrayList<Integer> list, int target){

        int LP =0;
        int RP =list.size()-1;

        while(LP<RP){
            if(list.get(LP) + list.get(RP) == target){
                return true;
            }
            if(list.get(LP) + list.get(RP) < target){
                LP++;
            }else {
                RP--;
            }
        }

        return false;
    }


}
