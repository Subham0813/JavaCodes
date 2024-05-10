package DataStructures.Arrays.MultiDiamentionalArrays;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLongArray;

public class p06_SpiralTraversalArray {
    static void printArray(int[][] a){
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    static void spiralTraverse(int[][] mat, int row, int col){
         int topRow= 0, bottomRow= row-1, leftCol= 0, rightCol= col-1,
                 totalElements = 0;

         while (totalElements< row*col){

             //first Row
             for (int i= leftCol; i<= rightCol && totalElements< row*col; i++){
                 System.out.print(mat[topRow][i]+" ");
                 totalElements++;
             }
             topRow++;

             //right Col
             for (int j= topRow; j<= bottomRow && totalElements < row*col; j++){
                 System.out.print(mat[j][rightCol]+" ");
                 totalElements++;
             }
             rightCol--;

             //bottom Row
             for (int i= rightCol; i>= leftCol && totalElements< row*col; i--){
                 System.out.print(mat[bottomRow][i]+" ");
                 totalElements++;
             }
             bottomRow--;

             //left Col
             for (int j= bottomRow; j>= topRow && totalElements< row*col; j--){
                 System.out.print(mat[j][leftCol]+" ");
                 totalElements++;
             }
             leftCol++;
         }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row:");
        int row = sc.nextInt();
        System.out.println("enter col:");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("enter matrix element");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Original Matrix");
        printArray(matrix);

        spiralTraverse(matrix,row,col);

    }
}
