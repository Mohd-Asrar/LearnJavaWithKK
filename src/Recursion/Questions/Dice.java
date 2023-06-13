package Recursion.Questions;

import java.util.ArrayList;


public class Dice {
    public static void main(String[] args) {

        dice("", 4);

        System.out.println(diceReturn("",4));

        diceFace("", 8, 8 );

        System.out.println(diceFaceReturn("", 4, 8));

    }

    public static void dice(String p, int target){
        if(target ==0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <=6  && i<= target; i++) {
            dice( p + i, target-i);
        }
    }

    public static ArrayList<String> diceReturn(String p, int target){
        if(target ==0){
          ArrayList<String> list = new ArrayList<>();
          list.add(p);
          return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <=6  && i<= target; i++) {

            ans.addAll(diceReturn( p + i, target-i));
        }

        return ans;
    }

    public static void diceFace(String p, int target, int face){
        if(target ==0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <=face  && i<= target; i++) {
            diceFace( p + i, target-i, face);
        }
    }

    public static ArrayList<String> diceFaceReturn(String p, int target, int face){
        if(target ==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <=face  && i<= target; i++) {

            ans.addAll(diceFaceReturn( p + i, target-i,face));
        }

        return ans;
    }


}
