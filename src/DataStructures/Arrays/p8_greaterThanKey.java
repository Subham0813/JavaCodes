package DataStructures.Arrays;
import java.util.*;
public class p8_greaterThanKey {
    static int countGreaterThan(int[] arr, int x){
        int count = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>x) count+=1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size of the Array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.print("enter Elements of the Array: ");
        for (int i =0; i<size; i++){
            arr[i]= scan.nextInt();
        }
        System.out.print("enter key: ");
        int key = scan.nextInt();
        System.out.println(countGreaterThan(arr,key)+" elements are strictly greater than "+key+" in the Array.");

    }
}
