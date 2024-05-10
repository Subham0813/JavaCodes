package DataStructures.Arrays;

public class p21_countEvenDigitsInArray {
    public static void main(String[] args) {
        int[] arr = {12, 122, -1224, 45, -33, 6480};
        int ans = countEvenInArray(arr);
//        System.out.println(digitcount(arr[3]));
        System.out.println("Output:" +ans);
    }
    static int countEvenInArray(int[] arr) {
        int ans = 0;
        for (int i=0; i<arr.length; i++) {
        int count = digitCount(arr[i]);
        if (count%2 == 0) ans ++;
        }
        return ans;
    }

    static int digitCount(int digit){
        int count = 0;
        if(digit<0) digit = digit*(-1);
        if(digit==0) return 1;
        while(digit>0){
            count++;
            digit = digit/10;
        }
        return count;
    }
}
