package DataStructures.Arrays.MultiDiamentionalArrays;

import java.util.Scanner;

public class p07_generateSpiralMatrix {

    static void printArray(int[][] a){
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateMatrix(int n){
        int[][] mat = new int[n][n];
        int topRow= 0, bottomRow= n-1, leftCol= 0, rightCol= n-1,
                totalElements = 1;

        while (totalElements <= n*n){

            //first Row
            for (int i= leftCol; i<= rightCol && totalElements <= n*n; i++){
                mat[topRow][i] = totalElements ;
                totalElements++;
            }
            topRow++;

            //right Col
            for (int j= topRow; j<= bottomRow && totalElements <= n*n; j++){
                mat[j][rightCol]= totalElements;
                totalElements++;
            }
            rightCol--;

            //bottom Row
            for (int i= rightCol; i>= leftCol && totalElements <= n*n; i--){
                mat[bottomRow][i] = totalElements;
                totalElements++;
            }
            bottomRow--;

            //left Col
            for (int j= bottomRow; j>= topRow && totalElements <= n*n; j--){
                mat[j][leftCol]= totalElements;
                totalElements++;
            }
            leftCol++;
        }
        return mat;
    }

    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = generateMatrix(n);
        printArray(matrix);
    }
}
