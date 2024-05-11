package DataStructures.Arrays.MultiDiamentionalArrays;

import java.util.Scanner;

public class p08_sumOfRectangle {

    static int findSum(int[][] mat, int l1, int r1, int l2, int r2){
        int sum =0;
        for (int i=l1; i<=l2; i++){
            for (int j=r1; j<=r2; j++){
                sum += mat[i][j];
            }
        }
        return sum;
    }

    static int[][] findPrefixSumMatrixRow(int[][] a){
        // we are assuming row and column of the matrix is always greater than ZERO
        int row = a.length;
        int col = a[0].length;
        int[][] preMat = new int[row][col];
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if(j==0){
                    preMat[i][j] = a[i][j];
                }
                else{
                preMat[i][j] = preMat[i][j-1] + a[i][j];
                }
            }
        }
        return preMat;
    }
    static int[][] findPrefixMatrixCol(int[][] a){
        int row=a.length;
        //assuming there is at least one row always in the matrix, otherwise col can not be calculated
        int col= a[0].length;
        int[][] preMat = findPrefixSumMatrixRow(a);
        for (int j=0; j<col; j++){
            for (int i=0; i<row; i++){
                if (i==0)
                    preMat[i][j] = preMat[i][j];
                else
                    preMat[i][j] += preMat[i-1][j];
            }
        }

        return preMat;
    }

    static void printArray(int[][] mat){
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    static int findSum2(int[][] mat, int l1, int r1, int l2, int r2){
        int sum=0;
        int[][] pMat = findPrefixSumMatrixRow(mat);
        printArray(pMat);

        for (int i=l1; i <= l2; i++){
            if(r1 >= 1){
            sum += pMat[i][r2] - pMat[i][r1 -1];
            }
            else {
                sum += pMat[i][r2];
            }
        }
        return sum;
    }
    static int findSum3(int[][] mat, int l1, int r1, int l2, int r2){
        int ans=0, sum =0, up=0, left=0, leftUp=0;
        int[][] preMat = findPrefixMatrixCol(mat);
        printArray(preMat);
        sum = preMat[l2][r2];
        if (l1>0)
            up = preMat[l1-1][r2];
        if (r1>0)
            left = preMat[l2][r1-1];
        if (l1>0 && r1>0)
            leftUp = preMat[l1-1][r1-1];
        ans = sum - up -left -leftUp;
        return ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimension of the Matrix :");
        int row = sc.nextInt(), col= sc.nextInt();
        System.out.println("enter Matrix elements :");
        int[][] mat= new int[row][col];
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Coordinates to find Sum of Rectangle");
        System.out.print("enter L1, R1 : ");
        int l1=sc.nextInt(), r1= sc.nextInt();
        System.out.print("enter L2, R2 : ");
        int l2=sc.nextInt(), r2= sc.nextInt();
        System.out.println("Sum is :"+findSum(mat,l1,r1,l2,r2));
        System.out.println("Sum is :"+findSum2(mat,l1,r1,l2,r2));
        System.out.println("Sum is :"+findSum3(mat,l1,r1,l2,r2));

    }
}
