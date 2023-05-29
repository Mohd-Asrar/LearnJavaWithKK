package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> heigth = new ArrayList<>();

        heigth.add(1);
        heigth.add(8);
        heigth.add(6);
        heigth.add(2);
        heigth.add(5);
        heigth.add(4);
        heigth.add(8);
        heigth.add(3);
        heigth.add(7);

        System.out.println(ByBruteforce(heigth));

        System.out.println(By2PointersOptimize(heigth));


    }


    // TC O(n^2)
    static int ByBruteforce(ArrayList<Integer> list){

        int maxWater = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size() ; j++) {
                int mostHeigth = Math.min(list.get(i), list.get(j));
                int width = j-i;
               int currWater = mostHeigth*width;
               maxWater = Math.max(currWater, maxWater);
            }
        }
      return maxWater;
    }


    //TC  O(n)
    static int By2PointersOptimize(ArrayList<Integer> list){

        int LP =0;
        int RP = list.size()-1;
        int maxWater = Integer.MIN_VALUE;

        while(LP < RP){
            int maxHeigth = Math.min(list.get(RP), list.get(LP));
            int width = RP-LP;
            int currWater = maxHeigth * width;
            maxWater = Math.max(maxWater, currWater);
            if(list.get(LP)< list.get(RP)){
               LP++;
            }else{
                RP--;
            }
        }
        return maxWater;
    }
}
