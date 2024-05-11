package DataStructures.Recursion_Backtrack;

import java.util.Scanner;

public class p5_countOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
    }
    static int countDigits(int n){
        if(n<0) n = n*(-1);    //for negative nums

        if(n>=0 && n<=9) return 1; //base case

        return countDigits(n/10) + 1; //recursive work
    }
}

