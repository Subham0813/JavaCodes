package DataStructures.Arrays;

public class p20_firstRepeatingValue {
    public static void main(String[] args) {
//        int[] array = {0, 6, 3, 10, 5, 8, 9, 13, 4, 2, 5, 1, 7, 9};
        int[] array = {2,2,3,4,5,6,6,1,9,0};
        int val = findRepeat(array);
        System.out.println("1st repeating value: "+val);
    }
    static int findRepeat(int[] arr){
        int value = -1;
//        boolean isFound = false;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    value = arr[i];
                    return value;
//                    isFound = true;
//                    break;
                }
            }
//            if (isFound){
//                break;
//            }
        }
        return value;
    }
}
