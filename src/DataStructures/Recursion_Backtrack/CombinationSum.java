package DataStructures.Recursion_Backtrack;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5}; // 2,3,6,7
////        Arrays.sort(arr);
//        Set<List<Integer>> result = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            result.addAll(combSum(Arrays.copyOfRange(arr,i,arr.length),"",0,35));
//        }
//        List<List<Integer>> result2 = new ArrayList<>(combineSum(new ArrayList<>(), arr,35,0));

        List<List<Integer>> list = new ArrayList<>(combineList(new ArrayList<>(),new ArrayList<>(),0,8,0));

        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

    }
    static Set<List<Integer>> combSum (int[] arr, String p, int c, int target){
        if(c == target){
            List<Integer> list = new ArrayList<>();
            Set<List<Integer>> res = new HashSet<>();
            res.add(helper(list,p));
            return res;
        }

        Set<List<Integer>> li = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            int count= arr[i] + c;
            if (count<=target) {
                char ch = (char) (arr[i] + '0');
                li.addAll(combSum(arr,p+ch,count,target));
            }
        }
        return li;
    }

    private static List<Integer> helper(List<Integer> list, String p) {
        char[] arr = p.toCharArray();
        Arrays.sort(arr);
        for (char c : arr){
            list.add((int) c - '0');
        }
        return list;
    }

    static List<List<Integer>> combineSum (List<Integer> p, int[] un, int target, int id){
        if(target == 0){
            List<List<Integer>> res2 = new ArrayList<>();
            res2.add(new ArrayList<>(p));
            return res2;
        }

        List<List<Integer>> res1 = new ArrayList<>();
        for(int i=id; i< un.length; i++){
            if(un[i]<= target) {
                p.add(un[i]);
                res1.addAll(combineSum(p,un,target-un[i],i));
                p.remove(p.size()-1);
            }
        }
        return res1;
    }

    static void combine (List<Integer> p, int n, int k, int curr){
        if(p.size() == k) {
            System.out.println(p);
            return;
        }
        if(n==0) return;

        combine(p,n-1,k,curr+1);
        p.add(curr);
        combine(p,n-1,k,curr+1);
        p.remove(p.size()-1);
    }

    static List<List<Integer>> combineList (List<List<Integer>> res, List<Integer> p, int n, int k, int curr){
        if(p.size() == k) {
            res.add(new ArrayList<>(p));
            return res;
        }
        if(n==0) return new ArrayList<>();

        combineList(res, p,n-1,k,curr+1);
        p.add(curr);
        combineList(res, p,n-1,k,curr+1);
        p.remove(p.size()-1);
        return res;
    }


}
