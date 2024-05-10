package DataStructures.Recursion_Backtrack;

import java.util.ArrayList;

public class P21_PrintSubsequences {
    public static void main(String[] args) {
        String ss = "abc";
        System.out.println(returnSSQ(ss));
        printSSQ(ss,"");
        System.out.println(returnSSQAscii("",ss));
    }


    static ArrayList<String> returnSSQ(String s){

        ArrayList<String> ans = new ArrayList<>();

        if(s.isEmpty()){
            ans.add("_");
            return ans;
        }

        char curr =s.charAt(0);
        ArrayList<String> smallAns = returnSSQ(s.substring(1));

        for (String aa: smallAns) {
            ans.add(aa);
            ans.add(curr+aa);
        }
    return ans;

    }
    static void printSSQ(String s,String ans) {

        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char curr = s.charAt(0);
        printSSQ(s.substring(1),ans+curr);
        printSSQ(s.substring(1),ans);
    }

    static ArrayList<String> returnSSQAscii(String F, String s){

        if(s.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(F);
            return ans;
        }

        char curr =s.charAt(0);
        ArrayList<String> left = returnSSQAscii(F+curr,s.substring(1));
        ArrayList<String> right = returnSSQAscii(F,s.substring(1));
        ArrayList<String> ascii = returnSSQAscii(F+(curr+0), s.substring(1));

        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
