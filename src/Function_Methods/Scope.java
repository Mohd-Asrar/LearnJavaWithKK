package Function_Methods;

public class Scope {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        String name ="Asrar";

        {

//            int a=40;    already initialise out side the block hence you can not initialis
            a=40;  // can acces  inside the block
            int c= 99;

            name = "Shaikh";
            System.out.println(name);

        }
        int c =58;
        System.out.println(c);
        System.out.println(a);
        System.out.println(name);

//        System.out.println(c);   can not acces out side the block
    }
}
