package DataStructures.Arrays;
import java.util.*;

public class p24_rotateKthStepsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter Array elements : ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        //System.out.print("array is  : "+ Arrays.toString(arr));
        System.out.println("Enter Steps to rotate the Array :");
        int step = sc.nextInt();
        step = step % size;

        //if(step>0){
        rotate(arr,0,size-step-1);
        rotate(arr,size-step, size-1);
        rotate(arr, 0, size-1);
        //}
        System.out.println("Rotated Array is : "+Arrays.toString(arr));

    }
    static void rotate(int[] arr,int st, int en){

        while(st< en ){
            swap(arr, st, en);
            st++;
            en--;
        }

    }
    static void swap(int[] arr, int s, int e){
        arr[s]= arr[s]+ arr[e];
        arr[e]= arr[s] - arr [e];
        arr[s] = arr[s]- arr[e];
    }
}
