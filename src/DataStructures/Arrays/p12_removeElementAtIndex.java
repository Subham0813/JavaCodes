package DataStructures.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class p12_removeElementAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] arr ={1, 2, 3, 4, 5, 6, 7};
        System.out.println("before removing element : "+Arrays.toString(arr));
        remove(arr,index);
        System.out.println("after removing element from array : "+ Arrays.toString(arr));
    }
    static void remove(int[] arr, int x){
        for (int i=x; i< arr.length-1; i++){
            arr[i]= arr[i+1];
        }
    }
}
