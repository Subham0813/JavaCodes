package DataStructures.Arrays;
import java.util.*;
public class p9_ArraySortedOrNot {
    static boolean arraySorted (int[] arr){
        boolean check = true;
        for(int i=1; i<arr.length; i++){
           if (arr[i-1]>arr[i]){
               check = false;
               break;
           }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter elements of Array: ");
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("isSorted : "+arraySorted(arr));
    }
}
