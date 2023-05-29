package Recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }
    public static void print(int n){

        //Base Condition
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);

        //Recursive call
        // If you are calling a function again & again, you can treat it as a separate call in the stack
        // This is called tail recursion
//        this is the last function called
        print( n + 1 );
    }

}
