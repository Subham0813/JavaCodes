package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p32_suffixSumQuary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int size = sc.nextInt();
        int[] a = new int[size+1];

        System.out.println("elements");
        for (int i=1 ; i<=size; i++){
            a[i] =sc.nextInt();
        }
        System.out.println("original is : " + Arrays.toString(a));
//        presum(a);
        System.out.println("enter quary number");
        int qua = sc.nextInt();
        while(qua-- >0) {
            System.out.println("enter range");
            int n = a.length, ans = 0;
            int r = n - sc.nextInt(), l = n - sc.nextInt();
            for (int i = l; i <= r; i++) {
                ans += a[i];
            }
            System.out.println("Sum is: " + ans);
        }

    }

    static void presum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
    }


}
