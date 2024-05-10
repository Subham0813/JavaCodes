package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p26_sortIncreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean num = true;
        System.out.println("enter binary number");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
            if (arr[i]>1) num = false;
        }

        if(num){
            sortArray(arr);
            System.out.println("sorted array is :"+ Arrays.toString(arr));
        }
        else System.out.println("invalid array element");
    }
    static void swap(int[] arr,int left, int right ){
        int temp =arr[left];
        arr[left]= arr[right];
        arr[right] = temp;
    }
    static void sortArray(int[] arr){
        int left= 0, right=arr.length-1;
        while(left<right) {
            if (arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0) left++;
            if (arr[right]==1) right--;
        }
    }
//    static void sortArray(int[] arr){
//
//        int n=arr.length, c0=0;
//        for (int j : arr) {
//            if (j == 0) c0++;
//        }
//        for (int i=0; i<n; i++){
//            if(i<c0){
//                arr[i]=0;
//            }
//            else arr[i]= 1;
//        }
//
//    }
}
