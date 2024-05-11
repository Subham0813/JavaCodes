package DataStructures.Recursion_Backtrack;

import java.util.Arrays;

public class SortingByRecursion {
    public static void main(String[] args) {
        int[] arr = { 0,0,1,1,2,3,2};
        System.out.println("before Sorting " + Arrays.toString(arr));
//        bubble(arr,0,0);
//        bubble2(arr,arr.length);
        insRec(arr,arr.length);
        System.out.println("After Sorting " + Arrays.toString(arr));
    }

    private static void bubble(int[] arr, int i, int j) {

        //base
        if(i>arr.length-1 || j>=arr.length-i-1  ) return;

        if(arr[j]>arr[j+1]){
            int t = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = t;
        }
        //recursive work
        bubble(arr, i, j+1);
        bubble(arr, i+1,i+1);
    }

    public static void bubble2(int[] arr, int n){
        if(n<=1) return ;
        int count =0;          // check if swapping happen or not
        for (int j = 0; j < n-1; j++) {
            if(arr[j] > arr[j+1]) {
                int t = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = t;
                count+=1;
            }
        }
        if (count==0) return;   // if swapping not happen it means that array is already sorted so return
        bubble2(arr,n-1);
    }

    static void insRec(int[] arr, int n){
        if(n <=1) return;

        insRec(arr,n-1);

        for (int i = n-1; i >=0 && arr[i]<arr[i-1]; i--) {
            int t = arr[i];
            arr[i] = arr[i-1];
            arr[i-1]= t;
        }
    }
}
