package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortAnAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of the ArraList : ");
        int size = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(size);
        System.out.print("Enter The Value of ArrayList : ");
        for (int i = 0; i <size; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
