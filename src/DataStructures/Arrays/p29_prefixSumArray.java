package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p29_prefixSumArray {
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
        preSumInPlace(a);
        int[] preArr = preSum(a);
        System.out.println("Prefix Sum Array :" + Arrays.toString(a));
//        System.out.println("Prefix Sum Array is :" + Arrays.toString(preArr));
    }
    
    
    static void preSumInPlace(int[] arr){
        int n =arr.length;
        for (int i=1; i<n; i++){
            arr[i] = arr[i-1]+arr[i];
        }
    }
    static int[] preSum(int[] a){
        int n= a.length;
        int[] p_arr = new int[n];
//        p_arr[0] = a[0];
        for (int i =1; i<n; i++){
            p_arr[i] = a[i]+ p_arr[i-1];
        }
        return p_arr;
    }

}
