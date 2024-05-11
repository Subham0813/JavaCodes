package DataStructures.stacks;

import java.util.Stack;

class Solution {
    public static boolean find132pattern(int[] nums) {
        /*
         * Time complexity O(n^3) Space complexity O(1)
         * for(int i=0; i<nums.length-2; i++){
         * for(int k=i+1; k<nums.length-1; k++){
         * for(int j = k+1; j<nums.length; j++){
         * if(nums[i]<nums[j] && nums[i]<nums[k] && nums[j]<nums[k])
         * return true;
         * }
         * }
         * }
         * return false;
         */

        Stack<Integer> stack = new Stack<>();
        int k = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (k > nums[i])
                return true;
            while (!stack.isEmpty() && nums[i] > stack.peek())
                stack.pop();
            stack.push(nums[i]);
        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, -4, -3 };
        System.out.println(find132pattern(nums));
    }
}