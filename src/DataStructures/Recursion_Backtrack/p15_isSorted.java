package DataStructures.Recursion_Backtrack;

public class p15_isSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7};
        System.out.println(findSortedOrNot(arr,0));
        System.out.println(findSortedAlternative(arr,0));
    }
    static boolean findSortedOrNot(int[] arr, int i){

        if(i == arr.length-1) return true;      //base case

        if (arr[i] > arr[i+1]) return false;    //self work

        return (findSortedOrNot(arr,i+1));       //recursive work
    }

    static boolean findSortedAlternative(int[] arr, int i){
        if(i == arr.length-2) {
            if(arr[i]> arr[i+1])return false;
            else return true;                  //base case
        }

        boolean sort  = true;
        if (arr[i] > arr[i+1]) sort = false;    //self work

        return (sort & findSortedAlternative(arr,i+1));       //recursive work
    }

}
