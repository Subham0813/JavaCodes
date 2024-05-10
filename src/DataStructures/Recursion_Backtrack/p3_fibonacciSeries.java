package DataStructures.Recursion_Backtrack;

import java.util.Scanner;

public class p3_fibonacciSeries {
    public static void main(String[] args) {
        System.out.println("enter N:");
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i=0; i<n; i++){
//            System.out.print(fibbo(i) + " ");
//        }
        System.out.println(fibboEff(sc.nextInt()));
    }
    static int fibbo(int n){
        if(n==1 || n==0) return 1;
        return fibbo(n-1) + fibbo(n-2);
    }
    static long fibboEff(int n){
        if(n == 0 || n == 1) return 1;
        return (long) ( Math.pow((1+Math.sqrt(5))/2,n) / Math.sqrt(5));

    }
}
