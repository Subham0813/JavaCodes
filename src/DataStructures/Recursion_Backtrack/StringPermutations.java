package DataStructures.Recursion_Backtrack;

import java.sql.Array;
import java.util.*;

public class StringPermutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        permute("","123");

        ArrayList<String> li = permutationList("","123");
        System.out.println("\n"+li);

        System.out.println();
        List<List<Integer>> res = new ArrayList<>();
        res = backTrack(res, new ArrayList<>(),arr);

        for(List<Integer> list : res ){
            System.out.print(list+" ");
        }
    }
    static void permute (String p, String unP) {
        if(unP.isEmpty()) {
            System.out.print(p+" ");
            return;
        }

        char curr = unP.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String F = p.substring(0,i);
            String S = p.substring(i);
            permute(F + curr + S, unP.substring(1));
        }
    }

    static ArrayList<String> permutationList (String p, String unP) {
        if(unP.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char curr = unP.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            String F = p.substring(0,i);
            String S = p.substring(i);
            String x = F + curr + S;
            ans.addAll(permutationList(x, unP.substring(1)));
        }
        return ans;
    }

    static List<List<Integer>> backtrack (List<List<Integer>> res,List<Integer> p,int[] nums){

        if(p.size() == nums.length) {
            System.out.println(p);
            res.add(new ArrayList<>(p));
            return res;
        }

        for(int i=0; i< nums.length; i++){

            if(p.size() > 0) {
                boolean check = false;
                for(int j=0; j<p.size(); j++){
                   if(p.get(j) == nums[i]) {
                       check = true;
                       break;
                   }
                }
                if(!check){
                    p.add(nums[i]);
                    backtrack(res, p, nums);
                    p.remove(p.size()-1);
                }
            } else {
                p.add(nums[i]);
                backtrack(res, p, nums);
                p.remove(p.size()-1);
            }
        }
        return res;
    }


    static List<List<Integer>> backTrack (List<List<Integer>> res,List<Integer> p, int[] nums){

        if(p.size() == nums.length) {
            System.out.println(p);
            res.add(new ArrayList<>(p));
            return res;
        }

        for(int i=0; i< nums.length; i++){

            if(p.contains(nums[i])) continue;
            p.add(nums[i]);
            backTrack(res,p,nums);
            p.remove(p.size()-1);

        }
        return res;
    }
}
