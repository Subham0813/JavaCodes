package DataStructures.Searching;

import java.util.Arrays;

public class FindPeakElementII_Leetcode1901 {
    public static void main(String[] args) {
        int[][] mat =  {{78,96,64},{37,100,30},{78,46,29},{82,25,80},{33,87,97},{93,99,85},{88,18,81},{13,81,83},{6,40,57},{5,75,47},{94,17,12},{38,42,96},{54,23,26},{17,70,47},{68,65,35},{22,33,62},{38,96,44},{15,60,10},{19,97,29},{87,93,87},{51,72,47},{12,51,2},{34,69,16},{59,48,87},{96,87,34}};
        System.out.println(mat.length);
        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }
    static int[] findPeakGrid(int[][] mat) {
        int col=0,row=0;
        for(int i=0; i<mat.length; i++){
            int rowPeak=0, colPeak=0;
            col = findPeak(mat[i],rowPeak,0,mat[0].length);
            rowPeak=mat[i][col];
            row = findPeakII(mat, col, colPeak,0,mat.length);
            colPeak=mat[row][col];
            if(colPeak == rowPeak) break;
        }
        return new int[] {row,col};
    }
    static int findPeak(int[] arr, int peak, int St,int En){
        int id=0;
        for(int i= St; i<En; i++){
            if(arr[i] > peak) {
                peak = arr[i];
                id=i;
            }
        }
        return id;
    }
    static int findPeakII(int[][] arr, int col, int peak, int St,int En){
        int id=0;
        for(int i= St; i<En; i++){
            if(arr[i][col] > peak) {
                peak = arr[i][col];
                id=i;
            }
        }
        return id;
    }

}
