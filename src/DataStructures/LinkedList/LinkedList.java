package DataStructures.LinkedList;

public class LinkedList {
     Node head;
     Node tail;
     private int size = 0;
   static class Node {
       int data;
       int val;
       Node next;
       Node random;

       Node(int data) {
           this.data = data;
           this.val = data;
           this.next = null;
           this.random = null;
       }
   }

    public int getHeadData() {
        if(head == null) return 0;
        else return head.data;
    }
    public int getTailData() {
       if(tail == null) return 0;
       else return tail.data;
    }

    private void insertAtBegin(int data){
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
   private void insertAtEnd(int data){

       if(head == null) {
           insertAtBegin(data);
           return;
       }

       Node newNode = new Node(data);
       Node temp = head;
       while(temp.next != null) {
           temp = temp.next;
       }
       temp.next  = newNode;
       tail =temp.next;
       tail.next = null;
   }

    private void insertAtIndex(int data, int idx) {
        if(idx == 0) insertAtBegin(data);
        else if(idx == size) insertAtEnd(data);
        else {
            Node newNode = new Node(data);
            int count = 1;
            Node temp = head;
            while (count < idx) {
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    private void deleteFromStart() {
       size--;
       head = head.next;
    }
    private void deleteFromEnd(){
       size--;
       Node temp = head;
       if(temp.next == null){
           head = null;
           tail = null;
       } else {
           while (temp.next.next != null) {
               temp = temp.next;
           }
           int a = temp.data;
           int b = tail.data;
           tail = temp;
           tail.next = null;
       }

    }
    private void deleteNode(int idx) {
       if(idx > size) return;
       if(idx == 0) deleteFromStart();
       else if (idx == size-1) deleteFromEnd();
       else{
           size--;
           int count =0;
           Node temp = head;
           while(count<idx-1){
               temp = temp.next;
               count++;
           }
           temp.next = temp.next.next;

       }
    }

    private void reverseIterative() { //null<-- 20<-- 50<-- 320<-- 2
        Node temp = head;
        tail = temp;
        Node prev = null;
        while(temp.next != null){
            temp = temp.next;
            head.next = prev;
            prev =head;
            head = temp;
        }
        head.next = prev;
    }
    private void reverseRecursive(Node temp,Node prev) { //null<-- 20<-- 50<-- 320<-- 2

        if (temp == null) return;
        if(prev != null && prev.next == null) tail = prev;

//        temp = temp.next;
        head.next = prev;
        prev = head;
        head = temp;

        reverseRecursive(temp.next, prev);
        if(head.next == null) head.next = prev;
    }

    public Node reverseList(Node head) {
        if(head == null || head.next == null) return head;
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    private int findMiddleNode(){
       if(head == null) return 0;
       Node slow = head;
       Node fast = head;
       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow.data;
    }

    private boolean cycleDetect(){
       if(head == null) return false;
       Node slow = head;
       Node fast = head;
       while(slow != null && fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
           if(fast == slow) return true;
       }
       return false;
    }

    static boolean isPalindrome(LinkedList li){
       if(li.head == null) return true;
        Node temp1 = li.head;
        LinkedList newList = new LinkedList();
       //copying data into newList reversely
       while(temp1 != null){
           newList.insertAtBegin(temp1.data);
           temp1 = temp1.next;
       }

       return checkPalindrome(li.head,newList.head);
    }
    static boolean checkPalindrome(Node temp1, Node temp2){
        if(temp1 == null && temp2 == null) return true;
        return (temp1.data == temp2.data) && checkPalindrome(temp1.next,temp2.next);
    }

    static void deleteDuplicate(LinkedList li){
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
    static void deleteDuplicateRecursive(LinkedList li,Node prev){
        if(li.head == null) return;
        if(prev.next == null) return;

        Node curr = prev.next;
        if(prev.data != curr.data) deleteDuplicateRecursive(li,prev.next);
        else {
            prev.next = curr.next;
            deleteDuplicateRecursive(li,prev);
        }
    }
   private void display(){
       Node temp = head;
       System.out.print("[ ");
       while(temp != null){
           System.out.print(temp.data + " ");
           temp = temp.next;
       }
       System.out.print("]"+"\n");
   }
    private static void display(Node h){
        Node temp = h;
        System.out.print("[ ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("]"+"\n");
    }
   private int display(int idx) {
       Node temp = head;
       int count = 0;
       while(count<idx){
           temp = temp.next;
           count++;
       }
       return temp.data;
   }

    public int getDecimalValue(Node head) {
        int count=0, res=0;
        Node curr= head;
        while(curr.next != null){
            count++;
            curr=curr.next;
        }
        curr=head;
        while(curr != null){
            if(curr.data == 1) res += (int) Math.pow(2,count);
            count--;
            curr = curr.next;
        }
        return res;
    }


    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        System.out.println("--------------------------Insertion----------------------------");
//        list.insertAtEnd(2);
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//
//        list.insertAtBegin(20);
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//
//        list.insertAtEnd(30);
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//
//        list.insertAtBegin(50);
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//
//        list.insertAtIndex(199,4);
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//
//        list.insertAtBegin(20);
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//
//        list.insertAtIndex(320,3);
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//
//        list.insertAtBegin(30);
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//        System.out.println(list.size);
//
//        list.insertAtIndex(920,8);
//        list.display();
//        list.reverseIterative();
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//
//        list.insertAtIndex(3120,0);
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//        System.out.println("-------------Deletion------------");
//        list.deleteFromStart();
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//        list.deleteFromEnd();
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//        list.deleteNode(7);
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//
//
//
//        System.out.println("*************Deletion With LOOP**************");
//        list.display();
//        for(int i =0; i < list.size; i++){
//            if(i%2 == 0) {
//                System.out.println("element will be deleted : "+list.display(i) + " is at Index " + i);
//                list.deleteNode(i);
//                list.display();
//            }
//        }
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//
//
//        System.out.println("=========Reverse a List==============");
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//        System.out.println("\n" + "------------Iterative------------");
//        list.reverseIterative();
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//        System.out.println("\n" + "------------Recursive------------");
//        list.reverseRecursive(list.head.next,null);
//        list.display();
//        System.out.println("head : " +list.getHeadData());
//        System.out.println("tail : " +list.getTailData());
//        list.insertAtEnd(90);
////        list.tail.next = list.head;
//        list.display();
//        System.out.println("\nMiddle element is "+list.findMiddleNode());
//        System.out.println("Cycle found : "+list.cycleDetect());
//
//        LinkedList list2 = new LinkedList();
//        list2.display();
//        System.out.println(list2.findMiddleNode());
//        System.out.println(list2.cycleDetect());
//
//        LinkedList li = new LinkedList();
//        li.insertAtBegin(1);//1
//        li.insertAtBegin(1);//2
//        li.insertAtBegin(2);//2
//        li.insertAtBegin(2);//1
//        li.insertAtBegin(1);
//        li.insertAtBegin(1);//1
//
//        System.out.println("\n"+isPalindrome(li));
//        li.display();
//        deleteDuplicateRecursive(li, li.head);
//        li.display();
//        LinkedList list3 = new LinkedList();
//        list3.insertAtBegin(1);
//        list3.insertAtBegin(1);
//        list3.insertAtBegin(0);
//        list3.insertAtBegin(0);
//
//        System.out.println(list3.getDecimalValue(list3.head));

        LinkedList lii = new LinkedList();
        lii.insertAtEnd(12);
        lii.insertAtEnd(20);
        lii.insertAtEnd(200);
        lii.insertAtEnd(2000);
        lii.insertAtEnd(20);
        lii.insertAtEnd(2);
        lii.display();

//        lii.display(removeNthFromLast(lii.head, 2));
//
//        System.out.println();
//
//        lii.display();
//        lii.display(swapNodes(lii.head, 4));
        Node a = new Node(14);
        Node b = new Node(14);
        a.next = b;
        Node c = new Node(14);
        b.next =c;
        Node d = new Node(14);
        c.next = d;
        Node e = new Node(14);
        d.next = e;
        Node f = new Node(14);
        e.next = f;



        Node list6 = lii.copyRandomList(lii.head);
        display(list6);

    }




    public Node copyRandomList(Node head) {
        Node newHead = new Node(0);
        Node t = newHead;
        Node temp = head;
        while(temp != null){
            Node copy = new Node(temp.val);
            t.next = copy;
            t= t.next;
            temp=temp.next;
        }
        t = newHead.next;
        temp = head;
//        while(temp != null){
//            if(temp.random != null){
//                int i = temp.random.val;
//                Node t1 = newHead.next;
//                while(i>0){
//                    i--;
//                    t1 = t1.next;
//                }
//                t.random = t1;
//            }
//            temp = temp.next;
//            t = t.next;
//        }
        return newHead.next;
    }


    public static Node swapNodes(Node head, int k) {
        Node temp1 = head;
        int c = 1;
        Node temp2 = head;
        while(temp1 != null){
            if(c == k) temp2 = temp1;
            temp1 = temp1.next;
            c++;
        }
        temp1 = head;
        while(--c != k){
            temp1 = temp1.next;
        }
        int temp = temp1.data;
        temp1.data = temp2.data;
        temp2.data = temp;
        return head;
    }

    private static Node removeNthFromLast(Node head, int n) {
        Node temp = head;
        int s = 1;
        while(temp.next != null){
            s++;
            temp = temp.next;
        }

        if(s == n) {
            return head.next;
        }
        else s = s-n;
        temp = head;
        for(int i=1; i<s; i++){
            temp = temp.next;
        }
        Node curr = temp;
        temp = temp.next;
        curr.next = temp.next;
        return head;
    }
}