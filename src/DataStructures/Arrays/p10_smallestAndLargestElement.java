package DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p10_smallestAndLargestElement {
    static int[] largestAndSmallest(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
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
        System.out.println("the first and the last elements of the array is "+arr[0]+" and "+arr[size-1]);
        int[] ans = largestAndSmallest(arr);
        System.out.println("largest :"+ans[1]);
        System.out.println("smallest :"+ans[0]);
        System.out.println("smallest & largest are: "+Arrays.toString(ans));
    }
}
