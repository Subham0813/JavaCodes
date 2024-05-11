package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p33_equalSubArrayPossible {

    static int[] preSum(int[] a) {
        int n = a.length;
        int[] arr = new int[n];
        arr[0] = a[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + a[i];
        }
        return arr;
    }

    static int[] suffSum(int[] a){
        int n = a.length;
        int[] brr  = new int[n];
        brr[n-1] = a[n-1];
        for (int i=n-2; i>=0; i--){
            brr[i] = a[i]+brr[i+1];
        }
        return brr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int size = sc.nextInt();
        int[] a = new int[size];

        System.out.println("elements");
        for (int i=0 ; i<size; i++){
            a[i] =sc.nextInt();
        }
//        System.out.println(Arrays.toString(a));
        int[] prr = preSum(a);
//        System.out.println(Arrays.toString(prr));
        int[] srr = suffSum(a);
//        System.out.println(Arrays.toString(srr));

        boolean check = false;
        for (int k = 0; k<a.length-1; k++){
            if (prr[k] == srr[k+1]) {
                check = true;
                break;
            }
        }
        System.out.println("Equal SubArray possible ?");
        if (check){
            System.out.println("YES");
        }
        else System.out.println("NO");

    }

}
