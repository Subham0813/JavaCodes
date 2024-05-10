package DataStructures.Arrays.MultiDiamentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P10_rotateAnyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row:");
        int row = sc.nextInt();
        System.out.println("enter col:");
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("enter matrix element");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                mat[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<mat.length; i++){
            System.out.println(Arrays.toString(mat[i]));
        }

        int [][] rot = rotate(mat);
        for(int i=0; i<rot.length; i++){
            System.out.println(Arrays.toString(rot[i]));
        }

        System.out.println( Arrays.deepEquals(mat, rot) );

    }
    static int[][] rotate(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        int[][] myMat = new int[col][row];
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
              myMat[i][j] = mat[j][col-1-i];
            }
        }
        return myMat;
    }
}
