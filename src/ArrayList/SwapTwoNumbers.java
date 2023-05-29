package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of the ArraList : ");
        int size = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(size);
        System.out.print("Enter The Value of ArrayList : ");
        for (int i = 0; i <size; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Enter Index which value you want to swap : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(list);
        swap(list, a, b);
        System.out.println(list);
    }

    static void swap(ArrayList<Integer> list, int a, int b){
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}
