package Recursion;

import java.util.Scanner;

public class StringIsPlaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String str =sc.nextLine();

        if(checkPalindrome(str)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }

    }

    public static boolean checkPalindrome(String str){
        if(str.length()==0 || str.length()==1){
            return true;
        }

        if(str.charAt(0) == str.charAt(str.length()-1)){
            return checkPalindrome(str.substring(1,str.length()-1));
        }
        return false;
    }
}
