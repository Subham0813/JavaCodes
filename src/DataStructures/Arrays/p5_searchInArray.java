package DataStructures.Arrays;

import java.util.*;
public class p5_searchInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("enter arrays size: ");
//        int size = in.nextInt();
//        System.out.println("enter array elements: ");
//        int[] arr = new int[size];
//        for(int i =0; i <size; i++){
//            arr[i] = in.nextInt();
//        }

        int[] arr = {13,23,45,6,7,99,0,22,1,3,6};
        System.out.println("enter the element to find :");
        int n = in.nextInt();
        int index = -1;
        boolean isFound = false;
        for (int i = 0; i<arr.length;i++){
            if(n==arr[i]){
                isFound = true;
                index= i;
                break;
            }
        }
        if(isFound==true){
            System.out.println("element found at "+index+"th index of the array");
        }
        else System.out.println(isFound);

    }
}
