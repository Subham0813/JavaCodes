package DataStructures.Arrays;
import java.util.*;
public class p17_tripleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int size = sc.nextInt();
        if (size <= 0){
            System.out.println("error!!");
        }
        else {
            System.out.print("input array: ");
            int[] arr = takeInput(size);
            System.out.print("target: ");
            int target = sc.nextInt();
            int sum = findSum(arr, target);
            System.out.println("total pairs of " + target + " is: " + sum);
        }

    }
    static int findSum(int[] arr, int x){
        int count = 0;
        int n = arr.length;
        Arrays.sort(arr);
        for (int k=0; k< n-2 ; k++) {

                for (int j = k + 1; j < n - 1; j++) {

                        for (int i = j + 1; i < n; i++) {

                            if (arr[k] + arr[j] + arr[i] == x) {
                                count++;
                            }
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
