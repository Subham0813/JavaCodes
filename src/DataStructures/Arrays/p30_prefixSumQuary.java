package DataStructures.Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class p30_prefixSumQuary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int size = sc.nextInt();
        int[] a = new int[size+1];

        System.out.println("elements");
        for (int i=1 ; i<=size; i++){
            a[i] =sc.nextInt();
        }
        System.out.println("original is :" + Arrays.toString(a));

        presum(a);

        System.out.println("quaries");
        int que = sc.nextInt();

        while ( que-- > 0) {
            System.out.println("enter range");
            int l=sc.nextInt(), r= sc.nextInt();
            int ans = a[r]-a[l-1];
            System.out.println("Sum is :"+ans);
        }
//        System.out.println("sorted :" + Arrays.toString(a));
    }
    static void presum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
    }
}
