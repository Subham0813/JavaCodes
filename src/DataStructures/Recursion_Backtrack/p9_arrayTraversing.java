package DataStructures.Recursion_Backtrack;

public class p9_arrayTraversing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-5,76,7,98,9,7,5,3,45,56,0};
        printArray(arr,0);
        System.out.println("\n"+printMax(arr,0));
        printMaxMin(arr,0, 0,0);
    }
    static void printArray(int[] arr, int i){
        if(i >= arr.length) return;   //base

        System.out.print(arr[i]+" "); //self

        printArray(arr, i + 1);    //recursive
    }

    static int printMax(int[] arr, int i, int max){
        if(i >= arr.length) return max;   //base

        if(arr[i] > max) max=arr[i];      //self
        return printMax(arr, i + 1,max);    //recursive
    }
    static int printMax(int[] arr, int i){
        if(i >= arr.length) return arr[i-1];   //base
        /*         self
                    |
                    v           */
        return Math.max(arr[i],printMax(arr, i + 1));    //recursive
    }

    static void printMaxMin(int[] arr, int i, int max, int min){
        if(i>= arr.length){
            System.out.println("MAX ==> "+max + " & MIN ==> "+min);
            return;
        }

        if(arr[i]>max){
           max= arr[i];
        }
        if(arr[i]<min){
           min = arr[i];
        }
        printMaxMin(arr,i+1, max, min);
    }

}
