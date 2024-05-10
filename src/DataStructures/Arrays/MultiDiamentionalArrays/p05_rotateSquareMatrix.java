package DataStructures.Arrays.MultiDiamentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class p05_rotateSquareMatrix {
    static void printArray(int[][] a){
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    static void revArray(int[] arr){
        int i=0, j= arr.length-1;
        while(i<j) {
            //swap
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }

    }
    static void transposeInPlace(int[][] mat, int n){
        for (int i=0; i<n; i++){
            for (int j = i; j < n; j++){
                int temp= mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i]= temp;
            }
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

        //transpose then reverse each Array of that matrix
        transposeInPlace(matrix,row);

        //reverse each array
        for (int i=0; i<row; i++){
            revArray(matrix[i]);
        }
        System.out.println("Rotated Matrix");
        //printing Array
        printArray(matrix);

    }
}
