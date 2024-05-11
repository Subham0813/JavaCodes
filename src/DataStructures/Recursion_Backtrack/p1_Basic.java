package DataStructures.Recursion_Backtrack;

import java.util.Scanner;

public class p1_Basic {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter N :");
        int n = scn.nextInt();
         printIncreasing(n);     //print 1, 2, 3, 4, ................ N
        System.out.println();
        printDecreasing(n);     //print N, N-1, N-2, ................ 1


    }

    static void printIncreasing(int n){
        if( n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n + " ");
    }

    static void printDecreasing(int n){
        if( n == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n-1);
    }

}
