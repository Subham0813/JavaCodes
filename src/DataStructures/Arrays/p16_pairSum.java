package DataStructures.Arrays;
import java.util.*;
public class p16_pairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int size = sc.nextInt();
        System.out.print("input array: ");
        int[] arr = takeInput(size);
        System.out.print("target: ");
        int target = sc.nextInt();
        int sum = findSum(arr,target);
        System.out.println("total pairs of "+target+ " is: "+sum);

    }
    static int findSum(int[] arr, int x){
        int count = 0;
        Arrays.sort(arr);
        for (int j=0; j<arr.length; j++)
            if (x>arr[j]) {
//          System.out.println("for i running");
                for (int i = j + 1; i < arr.length; i++) {
//              System.out.println("for i running");
                    if (arr[i] + arr[j] == x) {
                        count++;
                    }
                }
            }
        return count;
    }
    static int[] takeInput(int s){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[s];
        for (int i=0; i<arr1.length; i++ ){
            arr1[i]=sc.nextInt();
        }
        return arr1;
    }
}
