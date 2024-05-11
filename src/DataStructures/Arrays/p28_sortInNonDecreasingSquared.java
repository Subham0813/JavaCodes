package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class p28_sortInNonDecreasingSquared {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int size = sc.nextInt();
        int[] a = new int[size];
        int i = 0;
        System.out.println("elements");
        while (i < size) {
            a[i] = sc.nextInt();
            i++;
        }
        System.out.println("original is :" + Arrays.toString(a));
        int[] ans = sortSquaredArray(a);
        System.out.println("sorted :" + Arrays.toString(ans));
    }
    static int[] sortSquaredArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int k =n-1,left =0, right = n-1;
        while(left <= right){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
               ans[k--] = arr[left] * arr[left];
               left++;
            }
            else {
                ans[k--]= arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }

//    static void swap(int[]arr,int l,int r){
//        int tmp = arr[l];
//        arr[l] = arr[r];
//        arr[r] =tmp;
//    }
}
