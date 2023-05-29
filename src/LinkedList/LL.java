package LinkedList;

public class LL {
    private Node head;
    private Node tail;

    protected int size ;
    LL(){
        this.size=0;
    }


    public void addFirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = tail = node;
            size++;
            return;
        }

        node.next = head;
        head = node;
        size++;
    }


    public void addLast(int value){
        Node node = new Node(value);
        if(tail == null){
            addFirst(value);
            return;
        }

        tail.next = node;
        tail = node;
        size++;
    }


    public void addATindex(int value, int index){
        if(index ==0){
            addFirst(value);
            return;
        }

        if(index == size){
            addLast(value);
            return;
        }

        if(index > size){
            System.out.println("Index value is greater than LL size");
            return;
        }

        Node temp = head;
        for (int i = 1; i <index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }


    public int removeFirst(){
        if(size <=0){
            System.out.println("list is Empty");
            return -1;
        }
        int value = head.value;
        head = head.next;
        if(head== null){
            tail=null;
        }
        size--;

        return value;
    }


    public int removeLast(){
        if(size <=0){
            System.out.println("list is Empty");
            return -1;
        }
        if(size==1){
           return removeFirst();
        }
        Node secondLast= get(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;

        return value;
    }


    public int removeAtIndex(int index){
        if(index >=size){
            System.out.println("Index is Greater than size of LL");
            return -1;
        }

        if(index ==0){
          return removeFirst();
        }
        if(index == size-1){
            return removeLast();
        }

        Node temp = get(index-1);
        int value = temp.next.value;
        temp.next = temp.next.next;
        size--;

        return value;
    }


    public boolean search(int value){
        Node temp = head;
        while (temp != null){
            if(temp.value == value){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    public int searchindexOfValue(int value){
        if(size<=0){
            return -2;
        }
        Node temp = head;
        for(int i=0; i<size; i++){
            if(temp.value == value){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }


    public Node get(int index){
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp= temp.next;
        }
        return  temp;
    }


    public void display(){
        if(size == 0){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value+"-> ");
            temp= temp.next;
        }
        System.out.println("END");
    }



    class Node{
        private  int value;
        private Node next;

        Node(int value){
            this.value= value;
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

}
