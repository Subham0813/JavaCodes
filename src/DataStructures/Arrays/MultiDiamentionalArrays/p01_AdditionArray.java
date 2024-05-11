package DataStructures.Arrays.MultiDiamentionalArrays;

import java.util.Scanner;

public class p01_AdditionArray {


    static void printMat(int[][] a){
//        System.out.println("{");
        for (int i=0; i< a.length; i++){
            for (int j=0; j < a[i].length ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
//        System.out.println("}");
    }

    static void add(int[][] a, int[][] b,int r1, int r2, int c1, int c2 ){
        int[][] c = new int[r1][c1];
        if (r1 != r2 || c1 != c2){
            System.out.println("addition not posible");
            return;
        }
        for (int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                c[i][j]  = a[i][j] + b[i][j];
            }
        }
        printMat(c);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input row col. for 1st matrix");
        int r1 = sc.nextInt();
        int c1 =sc.nextInt();
        int[][] matrix1  = new int[r1][c1];
        System.out.println("enter Matrix elements row-wise");
        for (int i=0; i< r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }


        System.out.println("input row col. for 2nd matrix");
        int r2 = sc.nextInt();
        int c2 =sc.nextInt();
        int[][] matrix2  = new int[r2][c2];
        System.out.println("enter Matrix elements row-wise");
        for (int i=0; i< r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrix1 :");printMat(matrix1);
        System.out.println("matrix2 :");printMat(matrix2);
        System.out.println("addition matrix :");
        add(matrix1,matrix2,r1,r2,c1,c2);


    }
}