package DataStructures.Recursion_Backtrack;

import java.util.*;

public class ArrayPermutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3,};
        List<List<Integer>> res = new ArrayList<>();
        permute(arr,0, res);

        for( List<Integer> i : res) System.out.println(i);
    }

    private static List<List<Integer>> permute(int[] nums, int idx, List<List<Integer>> res) {
        if(idx == nums.length){
            List<Integer> temp = new ArrayList<>();
           for(int i : nums){
               temp.add(i);
           }
           res.add(temp);
           return res;
        }

        for(int i=idx; i<nums.length; i++) {
            swap (nums,i,idx);
            permute(nums, idx+1, res);
            swap(nums,i,idx);
        }
        return res;

    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

}
