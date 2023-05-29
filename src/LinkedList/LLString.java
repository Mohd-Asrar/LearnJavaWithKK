package LinkedList;

public class LLString {
   private Node head;
    private Node tails;
    int size;

    public LLString() {
        this.size=0;
    }



    public void inf(String value){
        Node node  = new Node(value);
        if(head == null){
            head = tails = node;
            size++;
            return;
        }

        node.next = head;
        head = node;
        size++;
    }

    public void inl(String value){
        Node node = new Node(value);
        if(tails == null){
            inf(value);
            return;
        }

        tails.next = node;
        tails = node;
        node.next = null;
        size++;
    }

    public void dis(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"-> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    class Node{
       private String value;
       private   Node next;

        public Node(String value) {
            this.value = value;
        }

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
