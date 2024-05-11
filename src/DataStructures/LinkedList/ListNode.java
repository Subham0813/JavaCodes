package DataStructures.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ListNode {
        int val;
        ListNode head;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    private void insertAtBegin(int val){
        ListNode newNode = new ListNode(val);

        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    private ListNode makeLL(int[] arr){
        ListNode dummy = new ListNode(arr[0]);
        head = dummy;
        for(int i=1; i<arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            dummy.next = newNode;
            dummy = newNode;
        }
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        int sum =0, carry = 0;
        while(l1!= null ||l2 != null){
            if(l1 != null && l2 != null)sum = carry + l1.val + l2.val;
            else if (l1 != null) sum = carry + l1.val;
            else sum = carry + l2.val;
            if(sum>9){
                carry = sum/10;
                sum = sum%10;
            } else carry = 0;
            ListNode curr = new ListNode(sum);
            temp.next = curr;
            temp = temp.next;
            if(l1 != null)l1= l1.next;
            if(l2 != null)l2= l2.next;
        }
        ListNode curr = new ListNode(carry);
        temp.next = curr;
        return head.next;
    }

    static void showList(ListNode head){
        ListNode temp = head;
            while(temp != null){
                System.out.print(temp.val + "-> ");
                temp = temp.next;
            }
        System.out.print("null");
        System.out.println();
    }

    static ListNode Dhead = null;
    static int carry = 0;
    public void addTwoNumbers2(ListNode l1, ListNode l2, int s1, int s2){
        if(s1>s2) addTwoNumbers2(l1.next,l2,s1,s2+1);
        else if(s1<s2)addTwoNumbers2(l1,l2.next,s1+1,s2);
        else addTwoNumbers3(l1, l2);
        if(s1>s2){
            helperSum(carry + l1.val);
        }
        if(s1<s2){
            helperSum(carry + l2.val);
        }
        return;
    }
    public void addTwoNumbers3(ListNode l1, ListNode l2) {
        if(l1.next != null && l2.next != null){
            addTwoNumbers3(l1.next, l2.next);
        }

        helperSum(carry + l1.val + l2.val);
        return;
    }
    public void helperSum(int sum){
        ListNode curr = new ListNode(sum % 10, Dhead);
        carry = sum / 10;
        Dhead = curr;
    }

    ListNode newHead = null;
    ListNode newTail = null;
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        int n = 1;
        while(curr.next != null){
            n++;
            curr = curr.next;
        }
        if(k%n==0) return head;
        curr = head;
        for(int i=1; i<n - (k%n); i++){
            curr= curr.next;
        }
        helperTail(curr);
        newTail.next = head;
        if(newHead != null && newHead != newTail){
            head = newHead;
        }
        else head = newTail;
        curr.next = null;
        return head;
    }
    void helperTail(ListNode head){
        newHead = head.next;
        while(head.next != null){
            head = head.next;
        }
        newTail = head;
    }

    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode curr = head;
        ListNode prev = head;
        while(curr != null && curr.next != null){
            if(curr.next.val + curr.val == 0){
                if(curr == head) head = curr.next.next;
                else prev.next = curr.next.next;
                prev = head;
                curr = prev;
            } else {
                prev = curr;
                curr = curr.next;
            }

        }
        return head;
    }

    public ListNode reverseEvenLengthGroups(ListNode head) {
        if(head.next == null || head.next.next == null) return head;
        ListNode st = head;
        ListNode prev = head;
        int length = 1;
        while(st!=null && st.next!=null){
            ListNode en = st;
            int count = 1;
            while(en.next!=null && count!=length){
                en=en.next;
                count++;
            }
            if(count%2 == 0) {
                ListNode curr = st;
                ListNode grpPrev = null;
                while (curr != en) {
                    ListNode next = curr.next;
                    curr.next = grpPrev;
                    grpPrev = curr;
                    curr = next;
                }
                en = en.next;
                curr.next = grpPrev;
                prev.next = curr;
                st.next = en;
            } else {
                st = en;
            }
            prev = st;
            st = st.next;
            length++;
        }
        return head;
    }
    List<Integer> list = new ArrayList();
    public ListNode sortList(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        temp = head;
        for(int i=0; i<list.size(); i++){
            temp.val = list.get(i);
            temp= temp.next;
        }
        return head;
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        ListNode curr = head;
        int length = 0;
        while(curr!=null){
            length++;
            curr = curr.next;
        }
        int rem = length%k;
        int parts = length/k;
        curr = head;
        ListNode prev = null;
        for(int i=0; i<res.length; i++){
            if(curr==null) break;
            int count = 0;
            while(count<parts && curr!=null){
                count++;
                prev = curr;
                curr = curr.next;
            }
            if(rem>0 && curr!=null){
                rem--;
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            res[i] = head;
            head = curr;
        }
        return res;
    }
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode curr = head, prev = head;
        int max = curr.val;
        curr = curr.next;
        while(curr != null){
            if(curr.val>=max){
                max = curr.val;
                prev.next = curr;
                prev = curr;
            }
            curr = curr.next;
        }
        prev.next = curr;
        return reverse(head);
    }
    private ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode curr = head, prev = null;
        while(curr!= null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,13,3,8};
        ListNode l1 = new ListNode();
        l1.makeLL(arr);
        showList(l1.head);
        showList(l1.removeNodes(l1.head));

//        ListNode[] arr1 = l1.splitListToParts(l1.head,3);
//        for(int i=0; i<arr1.length; i++){
//            showList(arr1[i]);
//        }
//        showList(l1.makeLL(arr));
//        showList(l1.reverseEvenLengthGroups(l1.makeLL(arr)));
//        showList(l1.sortList(l1.makeLL(arr)));
//        l1.insertAtBegin(-2);
//        l1.insertAtBegin(-3);
//        l1.insertAtBegin(3);
//        l1.insertAtBegin(2);
////        l1.insertAtBegin(-1);
//        l1.insertAtBegin(1);
//        showList(l1.head);
//        showList(l1.removeZeroSumSublists(l1.head));

//        showList(l1.rotateRight(l1.head, 4)); 1,2,3,-3,-2
//
//        ListNode l2 = new ListNode();
//        l2.insertAtBegin(9);
//        l2.insertAtBegin(9);
//        l2.insertAtBegin(9);
//        showList(l2.head);
//
//        ListNode l3 = new ListNode();
//        showList(l3.addTwoNumbers(l1.head,l2.head));
//
//        l3.addTwoNumbers2(l1.head,l2.head,6,3);
//        l3.helperSum(carry);
//        showList(Dhead);





    }
}
