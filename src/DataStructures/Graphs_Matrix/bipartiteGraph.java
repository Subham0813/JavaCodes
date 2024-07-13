package DataStructures.Graphs_Matrix;

import java.util.ArrayList;
import java.util.List;

public class bipartiteGraph {
    public static void main(String[] args) {
        int[][] graph =
                {{0,1,1,1},{1,0,0,1},{1,0,0,1},{1,1,1,0}};
        System.out.println(isBipartite(graph));

    }

    private static boolean isBipartite(int[][] graph){
        int n = graph.length;
        int m = graph[0].length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(graph[i][j] == 1) adj.get(i).add(j);
            }
        }
        int[] color = new int[n];
        color[0] = 1;
        return dfs(adj,color,0,1);

/*

        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        while(!q.isEmpty()){
            int source = q.poll();
            int iniColor = color[source];
            for(int neighbour : adj.get(source)) {
                if (color[neighbour] == 0) {
                    if (iniColor == 1) color[neighbour] = 2;
                    else color[neighbour] = 1;
                    q.offer(neighbour);
                }
                else if (color[neighbour] == iniColor) return false;
            }
        }
        return true; */
    }
    private static boolean dfs(List<List<Integer>> adj, int[] color, int source, int iniColor){


        for(int node : adj.get(source)){
            if(color[node] == 0){
                if(iniColor == 1) color[node] = 2;
                else color[node] = 1;
                if(!dfs(adj,color,node,color[node])) return false;
            }
            else if(color[node] == color[source]) return false;
        }
        return true;
    }
}
