package DataStructures.Arrays;

public class p23_findSecondSmallestInArray {
    public static void main(String[] args) {
        int[] arr ={-2,4,1,6,3,7,9,10,-3,11};
        int ans1 = smallest(arr);
        System.out.println("Smallest: "+ans1);
        int ans2 = secondSmallest(arr,ans1);
        System.out.println("Second Smallest: "+ans2);
    }

    static int smallest(int[] arr){
        int small = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
        if(arr[i] < small) small = arr[i];
        }
        return small;
    }

    static int secondSmallest(int[] arr, int ans){
        for(int i=0; i<arr.length; i++){
            if (arr[i]==ans){
                arr[i]= Integer.MAX_VALUE;
            }
        }
        return smallest(arr);
    }

}

