package DataStructures.Graphs_Matrix;
import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvinces_547 {
    public static void main(String[] args) {
        /* https://leetcode.com/problems/number-of-provinces/ */

        int[][] matrix = {{1,1,0},{1,1,0},{0,0,1}};
        int n = findCircleNum(matrix);
        System.out.println(n);
    }
    public static int findCircleNum(int[][] isConnected) {
        boolean[] vis = new boolean[isConnected.length];
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!vis[i]) {
                count++;
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                while (!q.isEmpty()) {
                    int j = q.poll();
                    for (int k = 0; k < isConnected.length; k++) {
                        if (isConnected[j][k] == 1 && !vis[k]) {
                            vis[k] = true;
                            q.offer(k);
                        }
                    }
                }

            }
        }
        return count;
    }
}
