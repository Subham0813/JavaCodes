package DataStructures.Recursion_Backtrack;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        TriangleSum(arr);
    }
    static void TriangleSum (int[] arr) {
        if (arr.length <= 1) {
        System.out.println(Arrays.toString(arr));
        return;
        }
        
        int[] sum = new int[arr.length -1];
        for (int i = 0; i < arr.length-1 ; i++) {
            sum[i] = arr[i] + arr[i+1];
        }
        TriangleSum(sum);
        System.out.println(Arrays.toString(arr));
    }
}
