package Recursion.Easy;



/*
1342. Number of Steps to Reduce a Number to Zero


Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */
public class NumberofSteps {
    public static void main(String[] args) {

        System.out.println(numberOfSteps(41));

    }

    public static int numberOfSteps(int num) {

        return helper(num, 0);

    }


    public static int helper(int num, int steps){
        if(num == 0){
            return steps;
        }

        if(num % 2 == 0 ){
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);

    }
}
