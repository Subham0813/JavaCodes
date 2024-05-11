package DataStructures.Recursion_Backtrack;

public class p10_printAMaxOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,76,7,98,9,7,5,3,45,56,0};
        System.out.println(printMax(arr,0));
    }
    static int printMax(int[] arr, int id){

        if(id == arr.length-1) return arr[id];  //base

        return Math.max(printMax(arr, id + 1),arr[id]); // comparing recursive case & self work
    }
}
