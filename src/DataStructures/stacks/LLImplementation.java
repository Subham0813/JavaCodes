package DataStructures.stacks;

class Node{
    Node next;
    int val;
    Node(int val){
        this.val = val;
    }
}

class LLStack {
    private int val;
    int size=0;
    Node head = null;
    void push(int val){
        Node x = new Node(val);
        x.next = head;
        head = x;
        size++;
    }
    int pop(){
        if(head == null){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int res = head.val;
        head= head.next;
        size--;
        return res;
    }

    int peek(){
        return head.val;
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println("| "+temp.val+" |");
            System.out.println("-----");
            temp=temp.next;
        }
    }
    int getSize(){
        return size;
    }
}

public class LLImplementation {
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(7);
        st.push(9);
        st.push(3);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();
        System.out.println(st.getSize());
    }
}
