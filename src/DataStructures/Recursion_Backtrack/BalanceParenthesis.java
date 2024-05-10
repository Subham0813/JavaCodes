package DataStructures.Recursion_Backtrack;

public class BalanceParenthesis {
    public static void main(String[] args) {
        String s = "[[()()(){}{}{}]]]";

        System.out.println(checkBalance("",s));

    }
    static boolean checkBalance(String p,String s){
        if(p.isEmpty() && s.isEmpty()) return true;
        if(!p.isEmpty() && s.isEmpty()) return false;

        if(p.isEmpty() || s.charAt(0) != findClosure(p.charAt(p.length()-1))) {
            return checkBalance(p + s.charAt(0), s.substring(1));
        }
        else return true && checkBalance(p.substring(0, p.length() - 1), s.substring(1));

    }

    private static char findClosure(char c) {
        if(c=='(') return ')';
        else if( c== '{') return '}';
        else return ']';

    }
}
