package Recursion.Questions;

import java.util.ArrayList;

public class Questions {
    public static void main(String[] args) {

        letterCombination("", "12");

        System.out.println(letterCombinationReturn("", "12"));
        System.out.println(letterCombinationcount("", "12"));

    }

    public static void letterCombination(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; //This will convert '2' into 2  (Character into integer)

        for (int i = (digit - 1 )* 3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            letterCombination(p +ch, up.substring(1));
        }
    }

    public static ArrayList<String> letterCombinationReturn(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }

        int digit = up.charAt(0) - '0'; //This will convert '2' int 2  (Character int integer)
           ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit - 1 )* 3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
           ans.addAll(letterCombinationReturn(p +ch, up.substring(1)));
        }
        return ans;
    }

    public static int letterCombinationcount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0'; //This will convert '2' int 2  (Character int integer)

        int count =0;
        for (int i = (digit - 1 )* 3; i < digit * 3 ; i++) {

            char ch = (char) ('a' + i);
           count = count + letterCombinationcount(p +ch, up.substring(1));
        }

        return count;
    }
}
