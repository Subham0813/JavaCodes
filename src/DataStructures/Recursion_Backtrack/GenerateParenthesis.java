package DataStructures.Recursion_Backtrack;
import java.util.*;
public class GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(genList(new ArrayList<>(),new StringBuilder(),0,0,3));

    }
    static void gen(String p,int open,int close, int num){
        if(p.length() == 2*num){
            System.out.println(p);
            return;
        }

        if(open<num){
            gen(p+'(',open+1,close,num);
        }
        if(close<open){
            gen(p+')',open,close+1,num);
        }
    }
    static List<String> genList(List<String> list, String p,int open,int close, int num){
        if(p.length() == 2*num){
            list.add(p);
            return list;
        }

        if(open<num){
            genList(list, p+'(',open+1,close,num);
        }
        if(close<open){
            genList(list,p+')',open,close+1,num);
        }
        return list;
    }

    static List<String> genList(List<String> list, StringBuilder p, int open, int close, int num){
        if(p.length() == 2*num){
            list.add(0,p.toString());
            return list;
        }

        if(open<num){
            genList(list, p.append("("), open+1, close, num);
            p.deleteCharAt(p.length()-1);
        }
        if(close<open){
            genList(list, p.append(")"), open, close+1, num);
            p.deleteCharAt(p.length()-1);
        }
        return list;
    }
}
