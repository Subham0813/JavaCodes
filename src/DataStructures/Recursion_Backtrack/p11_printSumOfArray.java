package DataStructures.Recursion_Backtrack;

public class p11_printSumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,10,3,5};
        System.out.println(printSum(arr,0));
    }
    static int printSum(int[] ar, int i){
        if(i == ar.length-1) return ar[i]; // base case

        return printSum(ar,i+1) + ar[i]; //recursive case + self work
    }
}
