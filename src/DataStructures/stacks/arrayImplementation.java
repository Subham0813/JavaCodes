package DataStructures.stacks;

class Stack {
    private int[] arr = new int[10];
    private int size = 0;
    private int val;

    void push(int val){
        if(size == arr.length) System.out.println("🚩Stack OverFlow!!🚩");
        arr[size++] = val;
    }
    int pop(){
       if(size == 0) {System.out.println("🚩Stack UnderFlow!!🚩");return -1;}
       int x = arr[size-1];
       arr[--size] = 0;
       return x;
    }

    int peek(){
       return arr[size-1];
    }

    int getSize(){
        return size;
    }
    void display(){
        for(int i = 0; i< size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    boolean isEmpty(){
        return size>0;
    }

    boolean isContains(int val){
        for(int ele: arr){
            if(ele == val) return true;
        }
        return false;
    }
}
public class arrayImplementation {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(7);
        st.push(9);
        st.push(3);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();
        System.out.println(st.getSize());
        System.out.println(st.isContains(5));
        System.out.println(st.isContains(9));
        System.out.println(st.isEmpty());
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
    }
}
