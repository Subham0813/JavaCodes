package DataStructures.LinkedList.Questions;

import DataStructures.LinkedList.LinkedList;

class LinkedL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    void insertLast(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void display(){
        Node temp = head;
        System.out.print("[ ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("]"+"\n");
    }
    void deleteDuplicate(LinkedL li){
        if(li.head == null) return;
        Node prev = li.head;
        Node curr = prev.next;
        while(prev.next != null){
            if(prev.data != curr.data) {
                prev = prev.next;
                curr = curr.next;
            } else {  //delete(curr) -->
                prev.next = curr.next;
                curr = curr.next;
            }
        }
    }
    static void deleteDuplicateRecursive(LinkedL li, Node prev){
        if(li.head == null) return;
        if(prev.next == null) return;

        Node curr = prev.next;
        if(prev.data != curr.data) deleteDuplicateRecursive(li,prev.next);
        else {
            prev.next = curr.next;
            deleteDuplicateRecursive(li,prev);
        }
    }
}


public class DeleteDuplicateNode {
    public static void main(String[] args) {
       LinkedL ll = new LinkedL();
        ll.insertLast(2);
        ll.insertLast(3);
        ll.insertLast(3);
        ll.display();
        ll.deleteDuplicateRecursive(ll,ll.head);
        ll.display();
    }
}
