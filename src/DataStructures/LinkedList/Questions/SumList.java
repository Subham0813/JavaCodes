package DataStructures.LinkedList.Questions;

import java.util.Scanner;
class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    void insert(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void reverse(Node curr, Node prev){
        if(curr.next == null){
            head = curr;
            curr.next = prev;
            return;
        }
        Node nxt = curr.next;
        curr.next = prev;
        reverse(nxt,curr);
    }
    void display(){
        Node temp = head;
        System.out.print("[ ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("]");
        System.out.println();
    }
    LinkedList sum(LinkedList l1, LinkedList l2){
        Node t1 = l1.head;
        Node t2 = l2.head;
        int num = 0;
        LinkedList newList = new LinkedList();
        while(t1 != null && t2 != null){
            int sum = t1.data + t2.data + num;
            num = 0;
            if(sum<=9) newList.insert(sum);
            else{
                int rem = sum%10;
                num = sum/10;
                newList.insert(rem);
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        if(t1 != null){
            while(t1 != null){
                int sum = t1.data + num;
                num = 0;
                if(sum<=9) newList.insert(sum);
                else{
                    int rem = sum%10;
                    num = sum/10;
                    newList.insert(rem);
                }
                t1 = t1.next;
            }
        }
        else if(t2 != null){
            while(t2 != null){
                int sum = t2.data + num;
                num = 0;
                if(sum<=9) newList.insert(sum);
                else{
                    int rem = sum%10;
                    num = sum/10;
                    newList.insert(rem);
                }
                t2 = t2.next;
            }
        } else newList.insert(num);

        return newList;
    }
}

public class SumList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        System.out.print("enter list 1 size --> ");
        int s = sc.nextInt();
        System.out.println("enter elements : ");
        for(int i=1; i<= s; i++){
            list1.insert(sc.nextInt());
        }
//        list1.display();
        System.out.print("enter list 2 size --> ");
        s = sc.nextInt();
        System.out.println("enter elements : ");
        for(int i=1; i<= s; i++){
            list2.insert(sc.nextInt());
        }
//        list2.display();
        LinkedList list3 = new LinkedList();
        list3 = list3.sum(list1,list2);
        list3.display();
    }
}
