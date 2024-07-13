package DataStructures.Tree;
import java.util.Stack;
public class CheckPreorderSerialization {
    public static void main(String[] args) {
        System.out.println(isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
    }
    public static boolean isValidSerialization(String preorder) {
        Stack<Character> st = new Stack<>();

        int i = 0;
        st.push(preorder.charAt(i));
        i++;

        while(i<preorder.length() && !st.isEmpty()){

            if(preorder.charAt(i) != ',' && preorder.charAt(i) == '#' && st.peek() == '#'){
                st.pop();
                st.pop();
                if(!st.isEmpty() && st.peek() != '#') st.push('#');
                else {
                    while(!st.isEmpty() && st.peek() == '#') {
                        st.pop();
                        st.pop();
                        st.push('#');
                    }
                }
            }
            else if(preorder.charAt(i) != ',') st.push(preorder.charAt(i));
            i++;
        }

        return st.isEmpty() && i>=preorder.length();
    }
}
