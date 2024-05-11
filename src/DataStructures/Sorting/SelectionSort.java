package DataStructures.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void selectionSortRecursion(int[] arr,int i,int j, int maxIdx){
        if(i >= arr.length) return;
        if(j >= arr.length) return;

        if(arr[j] > arr[maxIdx]) maxIdx = j;
        selectionSortRecursion(arr,i,j+1,maxIdx);
        //swapping
        int t = arr[maxIdx];
        arr[maxIdx] = arr[i];
        arr[i] = t;
        selectionSortRecursion(arr,i+1,i+1,maxIdx);
    }
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]) minIndex = j;
            }
            //swapping
            int t = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = t;
        }
    }
    public static void selectionSortDecreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) maxIndex = j;
            }
            int t = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = t;
        }
    }
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        //Printing Array
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSortDecreasing(arr);
        //Printing Array
        for (int i: arr) {
            System.out.print(i + " ");
        } */
        int[] arr = {11,3,2,5,9};
        selectionSortRecursion(arr,0,1,0);
        System.out.println(Arrays.toString(arr));

    }
}
