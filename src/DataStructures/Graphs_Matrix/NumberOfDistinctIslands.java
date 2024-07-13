package DataStructures.Graphs_Matrix;


import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctIslands {
    public static void main(String[] args) {
        int[][] mat = { {1,1,0,1,1},
                        {1,0,0,0,0},
                        {0,0,0,1,1},
                        {1,1,0,1,0} };
        System.out.println(distinctLands(mat));
    }

    private static int distinctLands(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean[][] vis = new boolean[m][n];
        Set<String> uniq = new HashSet<>();
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!vis[i][j] && mat[i][j] == 1) {
                    uniq.add(dfs(mat, vis, i, j, i, j, ""));
                }
            }
        }
        return uniq.size();
    }

    private static String dfs(int[][] mat, boolean[][] vis,int sr, int sc, int i, int j, String s){
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length || mat[i][j] != 1 || vis[i][j]) return "";

        vis[i][j] = true;
        if(sr == i && sc == j) s += "B";

        //top
        if(j-1 >= 0 && !vis[i][j-1] && mat[i][j-1] == 1){
            s += "T";
            dfs(mat,vis,sr,sc,i,j-1,s);
        }
        //left
        if(i-1 >= 0 && !vis[i-1][j] && mat[i-1][j] == 1){
            s += "L";
            dfs(mat,vis,sr,sc,i-1,j,s);
        }
        //right
        if(j+1 < mat[0].length && !vis[i][j+1] && mat[i][j+1] == 1){
            s += "R";
            dfs(mat,vis,sr,sc,i,j+1,s);
        }
        //down
        if(i+1 < mat.length && !vis[i+1][j] && mat[i+1][j] == 1){
            s += "D";
            dfs(mat,vis,sr,sc,i+1,j,s);
        }
        return s;
    }

}
