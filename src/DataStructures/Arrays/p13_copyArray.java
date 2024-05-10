package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p13_copyArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int index = sc.nextInt();
        int[] arr ={1, 2, 3, 4, 5, 6, 7, 99, 44, 23, 6, 88, 7 ,67 ,78};
        int[] ans = copy(arr);
        System.out.println("\noriginal: " +Arrays.toString(arr));
        System.out.println("\nCopy: "+Arrays.toString(ans));
    }

//    static int[] copy(int[] arr){
//        int[] arr2 = new int[arr.length];
//        for (int i=0; i<arr.length; i++){               //for loops
//            arr2[i] = arr[i];
//        }
//        return arr2;
//    }

    static int[] copy(int[] arr){
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);  //arraycopy inbuilt method
        return arr2;
    }
}
