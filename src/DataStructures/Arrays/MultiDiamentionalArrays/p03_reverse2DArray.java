package DataStructures.Arrays.MultiDiamentionalArrays;

import java.util.Scanner;

public class p03_reverse2DArray {

    static void printArray(int[][] a){
//        System.out.println("{");
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
//        System.out.println("}");
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
        System.out.println("Reversed");
        printArray(arr);
        reverseArray(arr,row,col);


        //reversing array in 1D order
        for (int i=0; i<row; i++){
            revArray(arr[i]);
        }

        printArray(arr);

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


    static void reverseArray(int[][] a, int r, int c){
        int start =0, end = c;
        for (int i=0; i<r; i++){
            for (int j=0; j< c/2; j++){
                 {
                    swap(a,i,j,c);
                }
            }
        }
        printArray(a);
    }
    static void swap(int[][]a , int i, int j, int c){
        int temp = a[i][j];
        a[i][j] = a[i][c-1-j];
        a[i][c-1-j] = temp;
    }



}
