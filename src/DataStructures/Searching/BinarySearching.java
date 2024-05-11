package DataStructures.Searching;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BinarySearching {
    public static int BinarySearch(int[] arr , int target){
        int start = 0 ,end = arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target){
                end = mid-1;
            } else start = mid+1;
        }
        return -1; //if target not found
    }


    public static void main(String[] args) {
        int[] arr = {1,2,6,7,9,30,32,100}; //Array should be sorted
        System.out.println(BinarySearch(arr,30)); // output 5
        System.out.println(BinarySearch(arr,55)); // output -1
    }
}
