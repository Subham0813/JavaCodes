package DataStructures.Arrays;

import java.util.Arrays;

public class p18_uniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,5,0,2,3,1,2,7};
        int[] ans = findUnique(arr);
        System.out.println(Arrays.toString(ans));
        int uniqueNum = uniqueIs(ans);
        System.out.println(uniqueNum);
//        Arrays.sort(ans);
//        System.out.println(Arrays.toString(ans));

        for (int ele: ans) {
            if (ele>-1)
                    System.out.print(ele+" ");
        }

    }
    static int[] findUnique(int[] arr){
        int[] newArray = new int[arr.length];
        for (int i =0; i<arr.length; i++){
            for (int j=i+1;j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }

            }
            newArray[i]=arr[i];
        }
        return newArray;
    }
    static int uniqueIs(int[] arr){
        int ans = -1;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]!=-1){
                ans =arr[i] ;
            }
        }
        return ans;
    }

}
