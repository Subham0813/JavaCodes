package DataStructures.Arrays;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[] a = {0,0,0,0,0,0,0,0,0,0};

        System.out.println(longestSubarrayWithSumK(a,0));
    }
    public static int longestSubarrayWithSumK(int []nums, int k) {
//        int length =0;
//        for(int i=0; i<a.length; i++){
//            int count =0;
//            int tempLength=0;
//            for(int j=i; j<a.length; j++){
//                count += a[j];
//                tempLength++;
//                if(count==k) {
//                    length=Math.max(length,tempLength);
//                }
//                if(count>k) break;
//            }
//        }
//        return length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0, count=0;

        for (int i=0; i<nums.length; i++){

            sum += nums[i];

            if(map.containsKey(sum-k)) count+= map.get(sum-k);

            map.put(sum, map.getOrDefault(sum,0)+1);

        }
        return count;
    }
}