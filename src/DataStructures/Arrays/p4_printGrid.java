package DataStructures.Arrays;

public class p4_printGrid {
    public static void main(String[] args) {
        for (int i =1; i<11; i++){
            for (int j=1; j<11; j++){
                System.out.print("- ");
            }
            System.out.println();
        }

        //by 2D array

        int[][] a = new int[10][10];
        for (int i =0; i<a.length; i++){
            for (int j=0; j<10; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
