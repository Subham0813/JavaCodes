package DataStructures.Searching;
import java.util.Scanner;

public class LinearSearching {
    public static int search(int[] arr, int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,4,2,6,7,90,33,6,32};
        System.out.println("Enter element to search in Array :");
        int k = sc.nextInt();
        System.out.println(search(arr,k));
    }
}
