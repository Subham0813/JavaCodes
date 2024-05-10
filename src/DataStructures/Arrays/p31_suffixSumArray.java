package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p31_suffixSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int size = sc.nextInt();
        int[] a = new int[size];

        System.out.println("elements");
        for (int i=0 ; i<size; i++){
            a[i] =sc.nextInt();
        }
        System.out.println("original is : " + Arrays.toString(a));
        suffSum(a);
        System.out.println("Suffix Sum Array : "+Arrays.toString(a));
    }

    static void suffSum(int[] arr){
        int n = arr.length;
        for (int i=n-2; i>=0; i--){
            arr[i] = arr[i]+arr[i+1];
        }
    }

}
