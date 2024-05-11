package DataStructures.Recursion_Backtrack;

import java.util.Scanner;

public class p8_printAlternateSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(printSeriesSum(num));
    }

    static int printSeriesSum(int n) {
        if (n <= 0) return 0;

        if(n%2 == 0){
            return printSeriesSum(n-1) - n;
        } else{
         return printSeriesSum(n-1) + n;
        }
    }
}
