package Function_Methods;

public class CallByValue_CallByValueOfRefVer {
    public static void main(String[] args) {
        int a= 10;
        int b=20;
      swap(a,b);
        System.out.println(a +" "+"  "+b);

        int [] arr = {1,2,3,4,5,6};
        change(arr);
        System.out.println(arr[0]);

        String name = "Asrar";
        changename(name);

        System.out.println(name);
    }

    static void changename(String naaaaam) {

        naaaaam ="Shaikh";
    }

    static void change(int[] arr) {

        arr[0] = 991;
    }

    static void swap(int a, int b){
        int temp =a;
        a =b;
        b =temp;

        System.out.println(a +" "+"  "+b);
    }
}
