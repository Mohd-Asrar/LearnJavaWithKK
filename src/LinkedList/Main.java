package LinkedList;

public class Main {
    public static void main(String[] args) {

        //        LLString l= new LLString();
//        System.out.println(l.size);
//        l.inf("Asrar");
//        l.dis();
//        System.out.println(l.size);
//        l.inf("Mohd");
//        l.dis();
//        System.out.println(l.size);
//        l.inl("Shaikh");
//        l.dis();
//        System.out.println(l.size);

        LL ll = new LL();
        ll.addFirst(23);
        ll.addFirst(13);
        ll.addLast(40);
        System.out.println(ll.size);
        ll.addLast(60);
        System.out.println(ll.size);
        ll.addATindex(99, 4);
        System.out.println(ll.size);
        ll.removeFirst();
        System.out.println(ll.size);
        ll.removeLast();
        System.out.println(ll.size);
        ll.removeAtIndex(2);
        System.out.println(ll.size);
        System.out.println(ll.search(200));
        ll.addLast(34);
        ll.addLast(97);
        ll.addLast(344);
        ll.addLast(340);
        ll.addATindex(200, 2);
        System.out.println(ll.search(200));

        ll.display();
//
        int ans = ll.searchindexOfValue(233);
        if(ans >=0){
            System.out.println("Value present in List at index : "+ans);
        }else if (ans ==-1){
            System.out.println("Value is not present in this list");
        }else {
            System.out.println("List is empty");
        }

        System.out.println(ll.size);
        ll.display();
        System.out.println("From List "+ll.removeAtIndex(3)+" is removed! That was present at "+3);
        System.out.println(ll.size);
        ll.display();






    }
}
