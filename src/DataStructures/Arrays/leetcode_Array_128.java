package DataStructures.Arrays;
import java.util.*;
public class leetcode_Array_128 {
    public static void main(String[] args) {
        int[] array ={0,0,-1};
//        System.out.println(longestConsecutive(array));

    }
    public static int longestConsecutive(int[] nums) {
        /*if(nums.length<1) return 0;
        Arrays.sort(nums);
        int count=0, max =1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i]-1)max++;
            else if(nums[i] > nums[i-1]+1){
                if(count<max)count=max;
                max=1;
            }
        }
        return Math.max(count,max); */
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num :nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int count=0, max=0, num=0;
        for(int i=0; i<nums.length; i++){

            if(!mp.containsKey(nums[i]-1)){
                num= nums[i];
                max=1;
                while(mp.containsKey(num+1)){
                    max++;
                    num++;
                }
            }
            if(max>count) count=max;

        }
        return count;
    }
}
