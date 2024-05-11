package DataStructures.Recursion_Backtrack;

import java.util.*;

public class DiceCombination {
    public static void main(String[] args) {
        combine("", 5);
        System.out.println(combineArr("",5));
        int[] arr = {2,3,6,7};

    }

    private static int combineCount(int target) {
        if(target == 1) return 1;
        return 2 * combineCount(target-1);
    }

    static void combine (String p, int target){
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= target; i++) {
            char ch = (char) (i + '0');
            combine(ch + p, target-i);
        }
    }

    static ArrayList<String> combineArr (String p, int target){
        if(target == 0) {
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= target; i++) {
            char ch = (char) (i + '0');
            list.addAll(combineArr(ch + p, target-i));
        }
        return list;
    }
}
