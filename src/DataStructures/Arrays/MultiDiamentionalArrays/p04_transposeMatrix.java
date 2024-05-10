package DataStructures.Arrays.MultiDiamentionalArrays;

import java.util.Scanner;

public class p04_transposeMatrix {

    static void printArray(int[][] a){
        for (int i=0; i<a.length;i++){
            for (int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transposeMatrix(int[][] a,int r, int c){
        int[][] trr = new int[c][r];
        for (int j=0; j<c;j++){
            for (int i=0; i<r; i++){
                trr[j][i] = a[i][j];
            }
        }
        printArray(trr);
    }
    static void transposeInplace(int[][] mat, int r, int c){
        for (int i=0; i<c; i++){
            for (int j=i; j<r; j++){
                int temp= mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i]= temp;
            }
        }
        printArray(mat);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row:");
        int row = sc.nextInt();
        System.out.println("enter col:");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("enter matrix element");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("initial array");
        printArray(arr);
        System.out.println("after Transpose");
        if (row == col){
            transposeInplace(arr,row,col);
        }
        else{
            transposeMatrix(arr,row,col);
        }

    }
}
