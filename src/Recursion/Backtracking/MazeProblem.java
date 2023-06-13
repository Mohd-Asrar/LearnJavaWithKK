package Recursion.Backtracking;

import java.util.ArrayList;
public class MazeProblem {
    public static void main(String[] args) {

        System.out.println(mazeproblemcountpath(3,3));

        mazeproblemprintpath("",3,3);

        ArrayList<String> ans =mazeproblemReturnList("", 3,3);
        System.out.println(ans);

    }

    public static int mazeproblemcountpath(int r,int c ){
        if(r==1 || c == 1){
            return 1;
        }

        int down = mazeproblemcountpath(r-1, c);
        int right = mazeproblemcountpath(r, c-1);

        return down + right;
    }

    public static void mazeproblemprintpath(String p, int r,int c ){
        if(r==1 && c == 1){
            System.out.println(p);
            return ;
        }

        if (r > 1){
            mazeproblemprintpath(p + 'D',r-1, c );
        }

        if (c > 1){
            mazeproblemprintpath(p + 'R',r, c-1 );
        }
    }

    public static ArrayList<String> mazeproblemReturnList(String p, int r, int c ){

        if(r==1 && c == 1){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r > 1){
            ans.addAll(mazeproblemReturnList(p +'D', r-1,c));
        }
        if(c > 1){
            ans.addAll(mazeproblemReturnList(p +'R', r,c-1));
        }

        return ans;
    }
}