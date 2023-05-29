
import java.util.*;
import java.lang.*;

public class LargestNumber {
    public static void main(String[] args) {

        int[] arr= {3,30,4,53,9};
        System.out.println(largestNumber(arr));

    }

        public static String largestNumber( int[] A) {
            // Let's change this integer array to String Arraylist => because we need string concatenation
            int n=A.length;

            // A=[3,30,4,53,9] -> integer array

            // create arraylist of strings
            ArrayList<String> arr= new ArrayList<>();
            for(int i=0;i<n;i++){
                // changing integer to string using this code
                arr.add(Integer.toString(A[i]));
            }

            //arr= ["3","30","4","53","9"] -> arraylist of strings

            // now we have ArrayList of Strings

            // Now we will sort the array with the comparator we discussed in whiteboard

            // comparator lambda function should be written after arr
            // give comparator as 2nd parameter in sort() function
            Collections.sort(arr, (a,b)->(b+a).compareTo(a+b));

            // Now our array will be => ["9","53","4","3","30"]

            //now use string builder to make ["9","53","4","3","30"] as "9534330"

            StringBuilder s= new StringBuilder();
            for(int i=0;i<n;i++){
                s.append(arr.get(i));
            }

            // if at all given arr=[0,0,0,0] => s="0000" which is wrong, It should be "0"
            //edge case
            if(s.charAt(0)=='0'){
                return "0";
            }
            return s.toString();
        }

    }

