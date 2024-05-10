package DataStructures.Sorting;

import java.util.Arrays;

public class CycleSort {
   /*
    Cycle sort is basically works for 0 to n range or 1 to n range array with same element present in the array
    basically arrays like {0,1,2,3,......} or {1,2,3,4.........} can be sorted by this method
   */
    public static void main(String[] args) {
        int[] ar = {0,1,2,4,5,6,3};
        cycleSortZeroToN(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println();
        int[] a = {1,2,4,5,3};
        cycleSortOneToN(a);
        System.out.println(Arrays.toString(a));

    }
    static void cycleSortZeroToN(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i] == i) i++;
            else{
                swap(arr,arr[i],i);
            }
        }
    }
    static void cycleSortOneToN(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]-1 == i) i++;
            else{
                swap(arr,arr[i]-1,i);
            }
        }
    }
    static void swap(int[] arr, int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
