package DataStructures.Recursion_Backtrack;

import java.util.*;

public class NumpadCombinations {
    public static void main(String[] args) {
        String[] numpad = {"", "", "abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        System.out.println(combiArr("","8"));
//        System.out.println(combinationsList(numpad,"8",""));
        System.out.println("hello");
        System.out.println((char)('a' + 2));
        StringBuilder s = new StringBuilder("hello");
        s = s.deleteCharAt(s.length()-1);
        System.out.println(s);
        List<String> list = new ArrayList<>();
        combinationsList(list,numpad,"8","");
        System.out.println(list);
    }

    static void combinationsList(List<String> res, String[] numpad, String num, String p) {
        if (num.isEmpty()) {
            res.add(p);
            return;
        }

        String curr = numpad[num.charAt(0) - '0'];
        for (int i = 0; i < curr.length(); i++) {
            p+=curr.charAt(i);
            combinationsList(res, numpad, num.substring(1),p );
            p = p.substring(0, p.length() - 1);
        }
    }

    static void combinations(String[] numpad, String num, String s) {
        if(num.isEmpty()){
            System.out.println(s);
            return;
        }

        if(num.charAt(0) == '1' || num.charAt(0) == '0') {
            combinations(numpad, num.substring(1), s);
        }

        String curr = numpad[num.charAt(0)-'0'];
        for (int i = 0; i < curr.length(); i++) {
            combinations(numpad,num.substring(1),s+curr.charAt(i));
        }
    }

    static List<String> combinationsList(String[] numpad, String num, String s) {
        if(num.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }

        List<String> li = new ArrayList<>();
        if(num.charAt(0) == '1' || num.charAt(0) == '0') {
            li.addAll(combinationsList(numpad, num.substring(1), s));
        }

        String curr = numpad[num.charAt(0)-'0'];
        for (int i = 0; i < curr.length(); i++) {
            li.addAll(combinationsList(numpad,num.substring(1),s+curr.charAt(i)));
        }
        return li;
    }

    static void combinationsProper(String[] numpad, String num, String s, int count1) {
        if(num.isEmpty()){
            System.out.println(s);
            return;
        }

        if (num.charAt(0) == '0'){
            combinationsProper(numpad,num.substring(1),s,count1);
        }
        if(num.charAt(0) == '1') {
            combinationsProper(numpad,num.substring(1), s,count1+1);
        }

        String curr = numpad[num.charAt(0)-'0'];
        if(count1 == 1) {
            curr = curr.toUpperCase();
        } else count1=0;
        for (int i = 0; i < curr.length(); i++) {
            combinationsProper(numpad,num.substring(1),s+curr.charAt(i),count1);
        }
    }

    static void combi(String p, String unP){
        if(unP.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = unP.charAt(0) - '0';
        for (int i = (digit -1) *3; i < (digit * 3) ; i++) {
            char ch = (char) ('a' + i);
            combi(p + ch, unP.substring(1));
        }
    }

    static ArrayList<String> combiArr(String p, String unP){
        if(unP.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        int digit = (unP.charAt(0) - '0');

        if(digit==1 || digit == 0) {
            list.addAll(combiArr(p, unP.substring(1)));
        }
        else if(digit==7 ){
            for (int i = (digit -2) *3; i <= (digit-1)*3  ; i++) {
                char ch = (char) ('a' + i);
                list.addAll(combiArr(p + ch, unP.substring(1)));
            }
        }else if(digit==8){
            for (int i = 1+(digit - 2) * 3; i <= (digit-1)*3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(combiArr(p + ch, unP.substring(1)));
            }
        }
        else if (digit ==9){
            for (int i = 1+(digit -2) *3; i <= 1+(digit-1)*3  ; i++) {
                char ch = (char) ('a' + i);
                list.addAll(combiArr(p + ch, unP.substring(1)));
            }
        }
        else {
            for (int i = (digit - 2) * 3; i < (digit-1)*3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(combiArr(p + ch, unP.substring(1)));
            }
        }
        return list;
    }
}
