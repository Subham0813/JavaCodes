package DataStructures.Recursion_Backtrack;

import java.util.Scanner;

public class p16_findLastOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,5,4,5,4,3,3,3,3,2,4,1,0};
        int k = in.nextInt();
        System.out.println(lastIndex(arr,0,k));
    }
    static int lastIndex(int[] arr, int i, int target){

        if(i == arr.length) return -1;            //base case

        int pos = -1;                            // initially position -1
        if(arr[i] == target){                   //self work
            pos = i;
        }

        return Math.max(pos,lastIndex(arr, i+1, target));      //compare positions ,
    }                                                             //and return maximum of them (recursively)
}
