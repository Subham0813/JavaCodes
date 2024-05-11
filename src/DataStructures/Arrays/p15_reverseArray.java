package DataStructures.Arrays;

import java.util.Arrays;

public class p15_reverseArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int index = sc.nextInt();
        int[] arr ={1, 2, 3, 4, 5, 100 ,8, 9, 3, 5, 8 ,91, 10};
        System.out.println("original: "+ Arrays.toString(arr));
        reverseInArray(arr);
        System.out.println("Revesre: "+Arrays.toString(arr));
    }
    static void reverseInArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr,int a, int b){
//        int temp = arr[a];
//        arr[a]= arr[b];           //with using create a new temp variable
//        arr[b]= temp;
        arr[a] = arr[a]+ arr[b];
        arr[b] = arr[a] - arr[b];       //without creating a new variable
        arr[a] = arr[a]- arr[b];

    }
//    static int[] reverse(int[] arr){
//        int[] arr1 = new int[arr.length];
//        int start = 0;
//        int end = arr.length-1;
//        for (int i=0; i<arr.length; i++){
//            int temp = arr[start];
//            arr1[start]=arr[end];
//            arr1[end]=temp;
//            start++;
//            end--;
//
//        }
//        return arr1;
//    }
}
