package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p14_insertElementAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int key = sc.nextInt();
        int[] arr ={1, 2, 3, 4, 5, 6, 7, 99, 44, 23, 6, 88, 7 ,67 ,78};
        int[] ans = insert(arr,index,key);
        System.out.println("\nOriginal: "+ Arrays.toString(arr));
        System.out.println("\nAfter Inserting: "+Arrays.toString(ans));
    }

    static int[] insert(int[] arr, int pos, int x) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i]= arr[i];
            if (i == pos) {
                ans[pos] = x;
            }
        }
        return ans;
    }
}
