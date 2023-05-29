package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of AL you want : ");

        int a = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(a);

        for (int i = 0; i <a; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);
        reverse(list);

        System.out.println(list);
    }
    static void reverse(ArrayList<Integer> list){

        int start =0;
        int end = list.size()-1;

        while(start<end){
            swap(list, start, end);
            start++;
            end--;
        }
    }

    static void swap(ArrayList<Integer> list, int a, int b){
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b,temp);

    }
}
