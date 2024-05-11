package DataStructures.LinkedList;

class MyLinkedList {
    class Node{
        Node next;
        int val;
        Node(int val){
            this.val = val;
        }
    }
    Node head;
    Node tail;
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(head == null) return -1;
        Node temp = head;
        while(temp!=null && index>0){
            index--;
            temp = temp.next;
        }
        if(temp == null) return -1;
        else return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null) tail = newNode;
        else newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head == null) head = newNode;
        else tail.next = newNode;
        tail = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if(head == null || index == 0) addAtHead(val);
        Node temp = head;
        while(temp!=null && index>1){
            index--;
            temp = temp.next;
        }
        Node x = new Node(val);
        Node curr = temp;
        if(temp != null && index==1){
            temp = temp.next;
            curr.next = x;
            x.next = temp;
        }
        if(temp == null) tail = x;
    }
    
    public void deleteAtIndex(int index) {
        if(head == null) return;
        if(index == 0){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp!=null && index>1){
            index--;
            temp = temp.next;
        }
        if(temp != null && temp.next!=null && index == 1){
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(7);
        obj.addAtHead(2);
        obj.addAtHead(1);
        obj.addAtIndex(3,0);
        obj.deleteAtIndex(2);
        obj.addAtHead(6);
        obj.addAtTail(4);
        obj.get(4);
        obj.addAtHead(4);
        obj.addAtIndex(5,0);
        obj.addAtHead(6);
    }
}