package DataStructures.Arrays;

import java.util.Scanner;

public class p34_equalSubArrayPossibleWithoutExtraSpace {

    static boolean checkPossible(int[] a){
        int totalSum = 0, prefSum =0 ;

        for (int k : a) {
            totalSum += k;
        }
        for (int i : a) {
            prefSum += i;
            int suffixSum = totalSum - prefSum;
            if (suffixSum == prefSum)
                return true;
        }
        return false;

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
        boolean ans = checkPossible(a);
        System.out.println(ans);
    }
}
