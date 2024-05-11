package DataStructures.Searching;
import java.util.Arrays;

public class FairCandySwap_888LeetCode {
    public static void main(String[] args) {
        int[] aliceSizes={8,73,2,86,32};
        int[] bobSizes = {56,5,67,100,31};
        int[] ans = fairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(ans));
    }
    public static int getSum(int[] arr){
        int ans=0;
        for(int val : arr) ans += val;
        return ans;
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int A = getSum(aliceSizes);
        int B = getSum(bobSizes);
        int target = (A+B)/2;
        Arrays.sort(bobSizes);
        int[] arr = new int[2];
        for(int i : aliceSizes){
            int ans = A-i;
            arr = BSearch(bobSizes,target,ans,i);
            if(arr[0] >0) break;
        }
        return arr;
    }
    public static int[] BSearch(int[]bobSizes, int target, int ans, int i){
        int start = 0 ,end = bobSizes.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(ans + bobSizes[mid] == target)
                return new int[] {i,bobSizes[mid]};
            else if(ans + bobSizes[mid] > target) end = mid-1;
            else start= mid+1;
        }
        return new int[2];//if target not found
    }
}