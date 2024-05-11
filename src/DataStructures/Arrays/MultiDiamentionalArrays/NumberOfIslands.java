package DataStructures.Arrays.MultiDiamentionalArrays;

import java.util.Arrays;

class NumberOfIslands {
    public static void main(String[] args) {
        char[][] arr = {
                {'1','1','0','0','0'},
                {'1','1','0','1','0'},
                {'0','0','0','1','1'}
        };
        System.out.println(numIslands(arr));
    }
    public static int islandPerimeter(char[][] grid) {
        int perimeter = 0;
        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[0].length; col++){
                int connect = 0;
                if(grid[row][col] == '1'){
                    if(col<grid[row].length-1 && grid[row][col+1] == '1')
                        connect++;
                    if(col>0 && grid[row][col-1] == '1')
                        connect++;
                    if(row<grid.length-1 && grid[row+1][col] == '1')
                        connect++;
                    if(row>0 && grid[row-1][col] == '1')
                        connect++;

                    perimeter += 4 - connect;
                }
            }
        }
        return perimeter;
    }
    public static int numIslands(char[][] grid) {
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[] arr = new int[4];
        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[row].length; col++){
                if(grid[row][col] == '1' ) {
                    arr[0] = row;
                    arr[1] = col;
                    explore(grid, row, col);
                    count++;
                    arr[2] = r < 0 ? row : r;
                    arr[3] = c < 0 ? col : c;
                    System.out.println(Arrays.toString(arr));
                    r=-1;
                    c=-1;
                }
            }

        }
        return count;
    }
    static int r = -1;
    static int c = -1;
    private static void explore(char[][] grid, int row, int col){

        grid[row][col] = '0';
        r = Math.max(r,row);
        c = Math.max(c,col);
        if(col<grid[row].length-1 && grid[row][col+1] == '1' ){

            explore(grid, row, col+1);
        }
        if(col>0 && grid[row][col-1] == '1'){
            explore(grid, row, col-1);
        }
        if(row>0 && grid[row-1][col] == '1'){
            explore(grid, row-1, col);
        }
        if(row<grid.length-1 && grid[row+1][col] == '1'){
            explore(grid, row+1, col);
        }
    }
    private static void explore(char[][] grid, boolean[][] visited, int row, int col){
        if(row == grid.length && col==grid[0].length) return;
        visited[row][col] = true;

        if(col<grid[row].length-1 && grid[row][col+1] == '1' && !visited[row][col+1]){
            explore(grid, visited, row, col+1);
        }
        if(col>0 && grid[row][col-1] == '1' && !visited[row][col-1]){
            explore(grid, visited, row, col-1);
        }
        if(row>0 && grid[row-1][col] == '1' && !visited[row-1][col]){
            explore(grid, visited, row-1, col);
        }
        if(row<grid.length-1 && grid[row+1][col] == '1' && !visited[row+1][col]){
            explore(grid, visited, row+1, col);
        }
    }
}