package DataStructures.Arrays;

public class p19_findSecondLargest {
    public static void main(String[] args) {
        int[] arr ={-2,-4,1,-6,-3,-7,9,-10,-3,11};
        int ans = largest(arr);
        System.out.println("Largest: "+ans);
        int ans1 = secondLarge(arr,ans);
        System.out.println("Second Largest: "+ans1);
    }
    static int largest(int[] arr){
        int n=arr.length;
        int max = Integer.MIN_VALUE;
        for (int ele:arr) {
            if (ele>max) max = ele;
        }
        return max;

    }
    static int secondLarge(int[] arr, int max){
        for (int i=0; i<arr.length; i++){
            if (arr[i]==max){
                arr[i]= Integer.MIN_VALUE;
            }
        }
        return largest(arr);
    }
}
