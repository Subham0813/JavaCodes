package DataStructures.Arrays;
import java.util.*;

public class p2_arraySortWithoutAlgorithm {
//    static void printArray(int[] array) {
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//    }
//    static void arraySort(int[] arr){
//
//    }


    public static void main(String[] args) {
        System.out.println("enter size of array :");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("enter array elements :");
        for (int i = 0; i<size; i++){
            arr[i]= in.nextInt();
        }

        System.out.println("before sorting :"+Arrays.toString(arr));        //using inbuilt array methods
        Arrays.sort(arr);
        System.out.println("after sorting: "+Arrays.toString(arr));          //using inbuilt array method

    }
}
