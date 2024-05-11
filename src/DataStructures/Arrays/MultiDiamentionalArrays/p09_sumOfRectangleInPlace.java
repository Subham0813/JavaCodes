package DataStructures.Arrays.MultiDiamentionalArrays;

import java.util.Scanner;

public class p09_sumOfRectangleInPlace {
    static int[][] makeMatrix(int r, int c){
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[r][c];
        for (int i =0; i<r; i++){
            for (int j=0; j<c; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }
    static int findSumOfRectangle(int[][] a, int l1,int r1,int l2, int r2){
        int sum =0;
        for (int i =l1; i<=l2; i++){
            for (int j=r1; j<=r2; j++){
                sum += a[i][j];
            }
        }
        return sum;
    }
    static void makePrefixSumMatrix(int[][] a){
        int row = a.length;
        int col =0;
        if (row > 0){
            col = a[0].length;
        }
        //traversing prefix sum row-wise
        for (int i=0; i<row; i++){
            for (int j=1; j<col; j++){
                a[i][j] += a[i][j-1];
            }
        }
        //traversing prefix sum column-wise
        for (int j=0; j<col; j++){
            for (int i=1; i<row; i++){
                a[i][j] += a[i-1][j];
            }
        }

    }

    static int findSumOfRectangle2(int[][] a, int l1,int r1,int l2, int r2){
        int ans = 0, sum= 0, up= 0, left =0, common =0;
        makePrefixSumMatrix(a);
//        printArray(a);
        sum = a[l2][r2];
        if (l1>0){
            up = a[l1-1][r2];
        }
        if (r1>0){
            left = a[l2][r1-1];
        }
        if (l1>0 && r1>0){
            common =a[l1-1][r1-1];
        }

        ans= sum - up -left + common;
        return ans;
    }

    static void printArray(int[][] mat){
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Size of Matrix");
        int r = sc.nextInt(), c= sc.nextInt();

        System.out.println("Elements of Matrix");
        int[][] matrix = makeMatrix(r,c);

        System.out.println("enter coordinates l1,r1,l2,r2");
        int l1 =sc.nextInt(), r1 =sc.nextInt(), l2 =sc.nextInt(), r2= sc.nextInt() ;

        System.out.println("Sum is : "+findSumOfRectangle(matrix,l1,r1,l2,r2));
        System.out.println("Sum is : "+findSumOfRectangle2(matrix,l1,r1,l2,r2));
    }
}
