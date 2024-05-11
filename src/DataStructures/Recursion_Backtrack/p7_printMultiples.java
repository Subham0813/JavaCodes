package DataStructures.Recursion_Backtrack;

import java.util.Scanner;

public class p7_printMultiples {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int num = in.nextInt();
        int k = in.nextInt();
        printKthMultiple(num, k);
    }
    static void printKthMultiple(int n, int k){
        if(k==1){
            System.out.print(n);
            return;
        }
        printKthMultiple(n,k-1);
        System.out.print(" "+n*k);

    }
}
