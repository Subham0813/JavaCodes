package DataStructures.Recursion_Backtrack;

import java.util.Scanner;

public class p4_sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumDigits(n));
    }
    static int sumDigits(int n){
        if(n<0) n = n*(-1);   // negative integer

        if(n>=0 && n<=9) return n; //base case

        return sumDigits(n/10) + n%10; // recursive case

    }
}