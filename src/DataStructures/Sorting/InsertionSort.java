package DataStructures.Sorting;

import java.util.Arrays;

public class InsertionSort {
    void insertionRecursion(int[] a, int i,int j){
        if(i >= a.length) return;
        if(j <= 0) return;

        if(a[j] < a[j-1]){
            // whenever i-th element is lesser than element at (i-1)-th we'll swap
            int temp = a[j];
            a[j] = a[j - 1];
            a[j - 1] = temp;
            insertionRecursion(a,i,j-1);
        }

        insertionRecursion(a,i+1,i+1);
    }
    void insertionSortIncreasing(int[] a){
        //we're assuming that 0th part of the array is already sorted, so we're starting from 1st index
        for(int i=1; i<a.length; i++){
            int idx = i;
            while(idx>0 && a[idx]<a[idx-1]){
                // whenever idx-th element is lesser than element at (idx-1)-th we'll swap
                int temp = a[idx];
                a[idx] = a[idx-1];
                a[idx-1] = temp;
                idx--;
            }
        }
    }
    void insertionSortDecreasing(int[] a){
        //we're assuming that 0th part of the array is already sorted, so we're starting from 1st index
        for(int i=1; i<a.length; i++){
            int index = i;
            while(index>0 && a[index]>a[index-1]){
                // whenever i-th element is greater than element at (i-1)-th we'll swap
                int temp = a[index-1];
                a[index-1] = a[index];
                a[index] = temp;
                index--;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {8,9,6,-50,1,2,-6,-3,9};
        InsertionSort inS = new InsertionSort(); //creating Object of class
        inS.insertionSortIncreasing(a);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("\n");
        inS.insertionSortDecreasing(a);
        for(int data : a){
            System.out.print(data+ " ");
        }
        System.out.println("\n");
        //we're assuming that 0th part of the array is already sorted, so we're starting from 1st index
        inS.insertionRecursion(a,1,1);
        System.out.println(Arrays.toString(a));
    }
}
