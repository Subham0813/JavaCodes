package Others;
import java.util.*;
class Solution {
    public static void main(String[] args) {
//        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
//        System.out.println(numSquares(25));
//        System.out.println(longestValidParentheses(")()())()()("));
//        int[] arr = {1,1,1,5,2,3,7,5};
//        System.out.println(countSubarrays(arr, 1, 5));
//        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
//        System.out.println(trap(heights));
//        int[] nums = {-104,104,-449,-318,-930,-195,579,-410,822,-814,-388,-863,174,-814,919,-877,993,741,741,-623,-4,-4,542,997,239,447,-317,409,-487,-34,6,-914,607,-622,915,573,666,-229,165,841,-820,703};
//        System.out.println(findMaxK(nums));
        System.out.println(numSquares(12));


    }
    public static int findMaxK(int[] nums) {
//        Arrays.sort(nums);
//        int l = 0, r = nums.length-1;
//        while(l<r){
//            if(Math.abs(nums[l]) == Math.abs(nums[r])) {
//                if (nums[l] + nums[r] == 0) return Math.max(nums[l], nums[r]);
//                l++;
//                r--;
//            }
//            while(Math.abs(nums[l]) > Math.abs(nums[r])) l++;
//            while(Math.abs(nums[l]) < Math.abs(nums[r])) r--;
//        }
//        return -1;
        int[] sum = new int[1001];
        int max = -1;
        for (int n : nums) {
            int index = n > 0 ? n : -n;
            if (sum[index] != n) {
                sum[index] += n;
            }

            if (sum[index] == 0) {
                max = Math.max(max, index);
            }
        }
        return max;
    }

    //trapping rain water LeetCode 42
    public static int trap(int[] heights) {
        int[] pge = new int[heights.length];
        int[] nge = new int[heights.length];
//        Stack<Integer> st = new Stack<>();
        int st =-1;
        int id = 0;
        for(int height : heights){
            if(st<0 || height>=st) st = height;
            else pge[id] = st;
            id++;
        }
//        while(!st.isEmpty()) st.pop();
        st = -1;
        for(id = heights.length -1; id>=0; id--){
            if(st<0 || heights[id]>=st) st = heights[id];
            else nge[id] = st;
        }
        int waterTrapped = 0; id =0;
        for(int height : heights){
            int min = Math.min((pge[id] - height), (nge[id] - height));
            waterTrapped += Math.max(min, 0);
            id++;
        }
        return waterTrapped;
    }
    public static long countSubarrays(int[] nums, int minK, int maxK) {
        return countForMinK(nums, minK, maxK) - countForMaxK(nums, maxK, minK);
    }
    static long countForMinK(int[] nums, int minK, int maxK){
        int left = 0, right = 0;
        long count = 0;

        while (right < nums.length) {

            if(nums[right] > maxK) left = right +1;

            if(nums[right] >= minK && nums[right] <= maxK)
                count += right - left + 1; // Size of subarray

            right++;
        }

        return count;
    }

    static long countForMaxK(int[] nums, int maxK, int minK){
        int left = 0, right = 0;
        long count = 0;

        while (right < nums.length) {

            if(nums[right] == maxK){
                while(left<right){
                    
                    left++;
                }
            }
            if(nums[right] > maxK){
                left = right;
            }

            if(nums[right]<=maxK)count += right - left + 1; // Size of subarray
            right++;
        }

        return count;
    }

    public static int longestValidParentheses(String s) {
        int res1 = 0, res2 = 0, count = 0;
        Stack<Character> st = new Stack();
        for(int i=s.length()-1; i>=0; i--){
            if(i>0 && st.isEmpty() && s.charAt(i) == ')') st.push(s.charAt(i));
            else if(!st.isEmpty() && st.peek() == ')' && s.charAt(i) == '('){
                st.pop();
                count += 2;
            }
            else if(i>0 && !st.isEmpty() && st.peek() == ')' && s.charAt(i) == ')'){
                st.push(s.charAt(i));
                res2 = Math.max(res1,res2);
                res1 = Math.max(res1 , count);
            }
            else if(st.isEmpty() && s.charAt(i) == '('){
                res1 = Math.max(res1 , count);
                count = 0;
            }
        }
        if(st.isEmpty() || st.peek() == ')') return Math.max(count, res1);
        return res2;
    }
    public static int minCostToMoveChips(int[] position) {
        int odd =0, even=0;
        for (int j : position) {
            if (j % 2 == 0) even++;
            else odd++;
        }
        return findMin(even,odd);
    }
    private static int findMin(int even, int odd){
        if(even > odd) return odd;
        return even;
    }
    public static int numSquares(int n) {
//        findPerfect(n,1,n/4+1,0);
//        return minCount;
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j*j<=i; j++){
                dp[i] = Math.min(dp[i], 1 + dp[i-j*j]);
            }
        }
        return dp[n];
    }
    static int minCount = Integer.MAX_VALUE;
    static void findPerfect(int n, int start, int end,int count){
        if (n==0) {
            minCount = Math.min(minCount,count);
            return ;
        }
        if(count>minCount) return;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(end*end == n) {
                 findPerfect(n-end*end,start,end,count+1);
            }
            else if(mid*mid <= n) {
               findPerfect(n-mid*mid, start, mid,count+1);
            }
            end = mid-1;
        }
    }
}