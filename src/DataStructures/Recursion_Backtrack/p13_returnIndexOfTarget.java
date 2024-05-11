package DataStructures.Recursion_Backtrack;

import java.util.Scanner;

public class p13_returnIndexOfTarget {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" enter Array size : " );
        int s = in.nextInt();
        int[] arr = new int [s];
        System.out.print("enter Array elements : ");
        for (int i = 0; i < s; i++ ){
            arr[i] =in.nextInt();
        }
        System.out.print("enter element to be searched : ");
        int k = in.nextInt();
        System.out.println(searchIndex(arr,0, k));

    }
    static int searchIndex(int[] ar,int i, int k){
        if(i == ar.length) return -1; //base case

        if (ar[i] == k) return i;       //self work

        return searchIndex(ar,i+1,k); //recursive case
    }
}
