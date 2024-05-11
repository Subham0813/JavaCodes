package DataStructures.stacks;

import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        System.out.println(st);
        st.push(1);
        System.out.println(st);
        st.push(2);
        System.out.println(st);
        st.push(3);
        System.out.println(st);
        st.push(4);
        System.out.println(st);

        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.empty());

    }
}
