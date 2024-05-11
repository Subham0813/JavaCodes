package DataStructures.Arrays;

import java.util.Scanner;

public class p11_findIndex {

    static int find(int[]arr, int key){
        int index = -1;
        for(int i=0; i<arr.length; i++){
            if (key==arr[i]){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10,12};
        int key = sc.nextInt();
        System.out.println("index of the "+key+" is "+find(arr,key));
    }
}
