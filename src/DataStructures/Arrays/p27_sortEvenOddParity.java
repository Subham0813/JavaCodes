package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p27_sortEvenOddParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("elements");
        for (int i =0; i<size; i++){
            a[i]= sc.nextInt();
        }
        System.out.println("orginal array :"+ Arrays.toString(a));
        sortEvnOdd(a);
        System.out.println("sorted array :"+Arrays.toString(a));
    }
    static void swap(int[]arr,int l, int r){
        int temp =arr[l];
        arr[l]= arr[r];
        arr[r] = temp;
    }

    static void sortEvnOdd(int[] arr){
        int left= 0, right = arr.length-1;
        while(left<right){
            if( (arr[left] % 2 > 0) && (arr[right] % 2 ==0)){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0) left++;
            if (arr[right]>0) right--;
        }
    }
}
