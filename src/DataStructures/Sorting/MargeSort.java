package DataStructures.Sorting;

import java.util.Arrays;

public class MargeSort {
    public static void main(String[] args) {
        int[] nums = {7,-2,-6,-6,8,-2,9};
        System.out.println("Before Sorting : " + Arrays.toString(nums));
        mergeSort(nums,0,nums.length-1);
        System.out.println("After Marge : " + Arrays.toString(nums));
    }

    public static void mergeSort(int[] arr, int l, int r){
        if(l>=r) return;

        int mid = l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        mergeProcedure(arr,l,r);

    }
    public static void mergeProcedure(int[] arr, int l, int r){
        int mid = l+(r-l)/2;
        int j=0, k=0;

        int[] left = new int[mid+1-l];
        int[] right = new int[r-mid];

        for(int i=l; i<=r; i++){
            if(i<=mid) left[j++] = arr[i];
            else right[k++] = arr[i];
        }

        j=0; k=0; int m = l;
        while(j<left.length && k<right.length){
            if(left[j] >= right[k]) arr[m++] = right[k++];
            else  arr[m++] = left[j++];
        }
        while(j<left.length){
           arr[m++] = left[j++];
        }
        while(k<right.length){
            arr[m++] = right[k++];
        }
    }
}
