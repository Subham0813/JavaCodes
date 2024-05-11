package DataStructures.Arrays;
import java.util.*;

public class p3_sumOfTheElementsOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter 5 elements of Array: ");
        for (int i=0; i<5; i++){
            arr[i]= sc.nextInt();
        }
//        arr[0]= 2;
//        arr[1]= 1;
//        arr[2]= 4;
//        arr[3]= 6;
//        arr[4]= 1;
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("sum is : "+sum);
    }
}
