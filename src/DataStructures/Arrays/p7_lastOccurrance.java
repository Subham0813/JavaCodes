package DataStructures.Arrays;
import java.util.Scanner;
public class p7_lastOccurrance {
    static int lastCountAt(int[] arr, int x){
        int countAt =-1;
        for (int i=0; i<arr.length; i++){
            if (x == arr[i]) {
                countAt = arr[i];
            }
        }
        return countAt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter size of Array: ");
        int size = in.nextInt();
        int[] arr = new int [size];
        System.out.print("enter the elements of Array: ");
        for (int i= 0; i<size; i++){
            arr[i]= in.nextInt();
        }
        System.out.print("enter the key to find last occurrence of it: ");
        int key = in.nextInt();


        if (lastCountAt(arr,key)==-1){
            System.out.println("not found");
        }
        else System.out.println("last occurrence of "+key+" at "+lastCountAt(arr,key)+"th index of the array");

     }
}

