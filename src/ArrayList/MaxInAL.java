package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxInAL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of the ArraList : ");
        int size = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(size);
        System.out.print("Enter The Value of ArrayList : ");
        for (int i = 0; i <size; i++) {
            list.add(sc.nextInt());
        }

      int ans = maxOfAnAL(list);
        System.out.println(ans);

    }

    static int maxOfAnAL(ArrayList<Integer> list) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i)> max){
//                max = list.get(i);
//            }

            max = Math.max(max, list.get(i));
        }
        return max;
    }
}
