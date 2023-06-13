package Recursion.String;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
//        String str ="abc";
//        permutation("", str);

        ArrayList<String> ans = permutationReturn("","abcd");
        System.out.println(ans);

        System.out.println(permutationcount("", "abc"));


    }

    public static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));
        }
    }

    public static ArrayList<String> permutationReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationReturn(f + ch +s, up.substring(1)));
        }
        return ans;
    }

    public static int permutationcount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count =0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            count = count + permutationcount(f + ch + s, up.substring(1));
        }

        return count;
    }
}
