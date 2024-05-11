package DataStructures.Recursion_Backtrack;

import java.util.Arrays;

public class CycleSortRecursion {
    public static void main(String[] args) {
        int[] arr = { 0,1,2,4,6,3,5};
        System.out.println("before Sorting " + Arrays.toString(arr));
        cycle(arr,0);
        System.out.println("After Sorting " + Arrays.toString(arr));
    }

    private static void cycle(int[] arr, int i) {
        if(i>=arr.length-1)return;

        if(arr[i] == i) cycle(arr,i+1);
        else {
            int t = arr[i];
            arr[i] = arr[t];
            arr[t] = t;
            cycle(arr,i);
        }

    }
}
