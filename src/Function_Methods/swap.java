package Function_Methods;

public class swap {
    public static void main(String[] args) {
        int x =10 , y =20;
         swap(x, y);
//        System.out.println(x +" " + y);

        String name ="Asrar";
        changename(name);
        System.out.println(name);



    }

        static void changename(String name) {
        name ="Shaikh";

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
