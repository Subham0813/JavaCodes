package DataStructures.strings;
import java.util.*;
public class Solution {
    public static String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder buildString = new StringBuilder();
        StringBuilder output = new StringBuilder();
        int number = 0, factor = 1;
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch >= '0' && ch <= '9'){
                int num = (int) (ch - '0');
                number = number*10 + num;

            }

            else if(ch == '[' || ch >= 'a' && ch <= 'z'){
                if(number>0){
                    numStack.push(number);
                    number = 0;
                }
                if(numStack.isEmpty()) {
                    if(!result.isEmpty()) {
                        output.append(result);
                        result = new StringBuilder();
                    }
                    output.append(ch);
                }
                else charStack.push(ch);
            }

            else {

                while(!charStack.isEmpty()) {
                    char c = charStack.pop();
                    if (c != '[') buildString.insert(0, c);
                    else break;
                }
                int tempNum = numStack.pop();

                while(tempNum>0){
                    result.append(buildString);
                    tempNum--;
                }

                if(!numStack.isEmpty()) {
                    buildString = new StringBuilder(result.toString());
                    result = new StringBuilder();
                }else buildString = new StringBuilder();
            }
        }
        if(output.isEmpty()) return result.toString();
        return output.toString();
    }


    public static void main(String[] args) {
        System.out.println(decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
    }

}
