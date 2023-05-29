package Function_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,5,98,76,564,3,3,3,3);
//        fun();

        multiple(20, 30 ,"Iron", "Man");

    }

    private static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
