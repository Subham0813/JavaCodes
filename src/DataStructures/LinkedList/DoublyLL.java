package DataStructures.LinkedList;

public class DoublyLL {
    Node head;

    class Node {
        Node prev;
        Node next;
        int val;

        Node (int val) {
            this.val = val;

        }
    }

    void displayList (Node head){
        Node t = head;
        while(t.next != null){
            System.out.print(t.val + " -> ");
            t = t.next;
        }
        System.out.print(t.val + "\n");
    }
    void displayListBack (Node head){
        if(head.next != null) displayListBack(head.next);
        if(head.next == null){
            System.out.print(head.val);
            return;
        }else{
            System.out.print(" <- "+head.val);
            return;
        }
    }

    void putVal(int val){
        Node temp = new Node(val);
        if(head == null){
            head = temp;
            return;
        }
        else {
            Node t = head;
            while(t.next != null){
                t = t.next;
            }
            t.next = temp;
            temp.prev = t;
        }
    }

    void putValFirst(int val){
       Node newNode = new Node(val);
       if(head == null){
           head = newNode;
           return;
       }
       newNode.next = head;
       head = newNode;
    }

    void putValAt(int val, int n){
       try {
           Node temp = head;
           while(n>1){
               n--;
               temp = temp.next;
           }
           Node newNode = new Node(val);
           newNode.prev = temp;
           newNode.next = temp.next;
           temp.next.prev = newNode;
           temp.next = newNode;

       }catch(Exception e){
           System.out.println("indexOutOfBound !!! -- enter Valid Index");
       }
    }

    void removeValAt(int n) {
        Node temp = head.next;
        if(n == 0){
            head = head.next;
            head.prev = null;
            return;
        }

        while (n>1 && temp.next != null) {
            n--;
            temp = temp.next;
        }
        if (n!=1) {
            System.out.println("invalid index");
            return;
        }
        temp.prev.next = temp.next;
        if(temp.next != null) temp.next.prev = temp.prev;

    }

    public static void main(String[] args){
        DoublyLL list = new DoublyLL();
        list.putVal(16);
        list.putVal(1);
        list.putVal(6);
        list.putVal(19);
        list.putVal(2);

        list.displayList(list.head);
        list.displayListBack(list.head);
        System.out.println();


        list.putValAt(100,1);
        list.displayList(list.head);

        list.removeValAt(5);
        list.displayList(list.head);
        list.displayListBack(list.head);





    }
}
