package DataStructures.LinkedList.Questions;

class BrowserHistory {
    public class ListNode {
    ListNode next;
    ListNode prev; 
    String val;
        ListNode(String val){
            this.val = val;
        }
    }
    ListNode head;
    ListNode pointer;
    public BrowserHistory(String homepage) {
        head = new ListNode(homepage);
        head.next = null;
        head.prev = null;
        pointer = head;
    }
    
    public void visit(String url) {
       ListNode page = new ListNode(url);
        pointer.next = page;
        page.prev = pointer;
        pointer = page;
        head = pointer;
    }
    
    public String back(int steps) {
        while(pointer.prev != null && steps > 0){
            steps--;
            pointer= pointer.prev;
        }
        return pointer.val;
    }
    
    public String forward(int steps) {
        while(pointer.next != null && steps > 0){
            steps--;
            pointer= pointer.next;
        }
        return pointer.val; 
    }

    public static void main(String[] args) {
        BrowserHistory obj = new BrowserHistory("leetcode");
        obj.visit("google");
        obj.visit("FB");
        obj.visit("YT");
        System.out.println(obj.back(1));
        System.out.println(obj.back(1));
        System.out.println(obj.forward(1));
        obj.visit("linkedin");
        System.out.println(obj.forward(2));
        System.out.println(obj.back(2));
        System.out.println(obj.back(7));
    }
}
