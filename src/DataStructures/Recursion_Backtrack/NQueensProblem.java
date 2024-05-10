package DataStructures.Recursion_Backtrack;

import java.util.Arrays;

public class NQueensProblem {
    public static void main(String[] args) {
        char[][] board = new char[4][4];

        for(char[] arr : board){
            Arrays.fill(arr,'.');
        }
        putQueens(board,0);
    }

    private static void putQueens(char[][] board, int row) {
        if(row == board.length){
            for(char[] arr : board){
                StringBuilder sb = new StringBuilder();
                sb.append(arr);
                System.out.println(sb);
            }
            System.out.println();
            return;
        }

        for(int col=0; col<board[0].length; col++) {
            if (isSafe(board,row,col)) {
                board[row][col] = 'Q';
                putQueens(board,row+1);
                board[row][col]='.';
            }
        }
    }
    private static boolean isSafe(char[][] board,int row, int col){
        int currRow = row;
        int currCol= col;
        //vertical check
        for(int i=currRow-1; i>=0; i--){
            if(board[i][col] == 'Q') return false;
        }
        //left diagonal check
        while(currRow>=0 && currCol>=0){
            if(board[currRow][currCol] == 'Q') return false;
            currRow--;currCol--;
        }
        //right diagonal check
        while(row>=0 && col<board[0].length){
            if(board[row][col] == 'Q') return false;
            row--; col++;
        }
        return true;
    }
}
