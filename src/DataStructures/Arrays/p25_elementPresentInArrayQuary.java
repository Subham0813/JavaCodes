package DataStructures.Arrays;

import java.util.*;

public class p25_elementPresentInArrayQuary {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter Array elements");
        for (int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int[] freq = makeFreqArray(arr);

        System.out.println("enter Quary number");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("enter number to be searched");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }
            else System.out.println("No");
            q--;
        }
    }
    static int[] makeFreqArray(int[] arr){
        int[] freq = new int[10007];
        for (int i =0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

}
