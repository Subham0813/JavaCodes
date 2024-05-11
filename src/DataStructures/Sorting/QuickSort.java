package DataStructures.Sorting;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7,-6,4,0,18,41,-4,8,14,8,-1,34};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int p, int q){
        if(p>=q) return;
        int pivotIndex = partition(arr, p,q);
        quickSort(arr,p,pivotIndex-1);
        quickSort(arr,pivotIndex+1,q);

    }
    static int partition(int[] arr, int p, int q){
        int X = arr[p]; //pivot element   , it can be any element of choice
        int i = p;     //smaller element
        for(int j = p+1; j<=q; j++){
            if(arr[j] <= X ) {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i,p);
        return i;
    }
    static void swap (int[] arr, int a, int b){
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }
}
