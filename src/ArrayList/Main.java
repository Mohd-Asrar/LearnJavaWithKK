package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        //Add O(1)
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        System.out.println(list);

        //Get   O(1)
        System.out.println(list.get(2));

        //Remove     O(n)
        list.remove(2);
        System.out.println(list);

        // set      O(n)
        list.set(1, 99);
        System.out.println(list);

        //Contains     O(n)
        System.out.println(list.contains(8));
        System.out.println(list.contains(999));


        //add at any point  O(n)
        list.add(0, 100);
        System.out.println(list);

        //size
        System.out.println(list.size());

        // Print the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

    }
}
