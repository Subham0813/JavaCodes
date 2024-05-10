package DataStructures.Arrays;
import  java.util.*;
public class p6_CountOccurancce {
    static int count(int[] arr, int n){
        int c = 0;
        for (int i=0; i<arr.length; i++){
            if (n==arr[i]) {
                c += 1;
            }
        }
        return c;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr ={5,7,8,9,11,14,23,3,7,5,5,3,3,4,5,11,7};
        System.out.println("enter a number to find in array :");
        int key = sc.nextInt();
        System.out.print(key+ " is present in the array "+count(arr,key)+ " times");
    }
}
