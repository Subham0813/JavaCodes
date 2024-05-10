package DataStructures.Arrays;

public class p22_findLastRepeatingValue {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,5,6,6,1,9,-10,-10};
        int ans = findLastRep(arr);
        System.out.println("last repeating value: "+ans);
    }
    static int findLastRep(int[] arr){
        int element = -1;
        for (int i =0; i<arr.length; i++) {
            for (int j= i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    element = arr[i];
                }
            }
        }
        return element;
    }
}
