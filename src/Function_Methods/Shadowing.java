package Function_Methods;

public class Shadowing {
    static int x =90;   // This x will be shadowed at line number 8
    public static void main(String[] args) {
        System.out.println(x);   //  90
        int x= 400;
        System.out.println(x);   //  400
        fun();         //   90
    }

     static void fun() {
        System.out.println(x);
    }
}
