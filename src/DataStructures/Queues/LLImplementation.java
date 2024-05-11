package DataStructures.Queues;

public class LLImplementation {
    class Node{
        Node next;
        int val;
        Node(int val){
            this.val = val;
        }
    }
    Node tail;
    Node head;
    int size;
    public LLImplementation(){
        head = null;
        tail = null;
        size =0;
    }
    public void add(int val){
        Node node = new Node(val);
        if(size == 0) {
            head = node;
            tail = head;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public int remove(){
       if(size == 0) return -1;
       else {
           int x = head.val;
           head = head.next;
           size--;
           return x;
       }
    }
    public int peek(){
        return head.val;
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        LLImplementation myq = new LLImplementation();
        myq.add(9);
        myq.add(19);
        System.out.println(myq.remove());
        myq.add(29);
        System.out.println(myq.peek());
        myq.add(39);
        myq.add(49);
        System.out.println(myq.remove());
        myq.add(59);
        myq.add(69);
        System.out.println(myq.size());
    }
}
