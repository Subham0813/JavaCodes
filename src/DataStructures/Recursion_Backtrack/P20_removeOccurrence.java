package DataStructures.Recursion_Backtrack;

import java.util.Scanner;

public class P20_removeOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss  = in.nextLine();
        String tar = in.nextLine();
//        System.out.println(removeElement(ss,0,tar));
        System.out.println(removeTargetString(ss,tar));
    }
    static String removeElement(String s, int i, char ch){

        if(i == s.length()) return " ";

        String ans = "";
        if(s.charAt(i) != ch) ans += s.charAt(i);

        return ans + removeElement(s,i+1,ch);
    }
    static String removeElementAlternative(String s, char c){

       if(s.isEmpty()) return "";

       String ans = "";
       if(s.charAt(0) != c ) ans.concat(String.valueOf(s.charAt(0)));

       return ans + removeElementAlternative(s.substring(1),c);
    }
    static String removeTargetString (String s, String target) {
        if(s.isEmpty()) return "";

        if(s.startsWith(target)) return removeTargetString(s.substring(target.length()),target);
        else return s.charAt(0) + removeTargetString(s.substring(1),target);

    }
}
