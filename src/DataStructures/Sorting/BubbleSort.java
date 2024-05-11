package DataStructures.Sorting;

import java.util.*;

public class BubbleSort {
    static void bubbleSortRecursion(int[] arr,int i, int j){
        if(i >= arr.length) return;
        if(j >= arr.length-1-i) return;

        if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }

        bubbleSortRecursion(arr,i,j+1);
        bubbleSortRecursion(arr,i+1,0);
    }
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean check = false;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    check = true;
                }
            }
            if(!check){
                return;
            }
        }
    }
    public static void bubbleSortDecreasingOrder(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean check = false;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    check = true;
                }
            }
//            if(!check){
//                return;
//            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {};
        /*bubbleSort(arr);
        //Printing Array
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSortDecreasingOrder(arr);
        //Printing Array
        System.out.println(Arrays.toString(arr));
        System.out.println(); */
        bubbleSortRecursion(arr,0,0);
        System.out.println(Arrays.toString(arr));

    }
}
