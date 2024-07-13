package DataStructures.Graphs_Matrix;

import java.util.List;
import java.util.ArrayList;

public class FindSafeNodes {
    public static void main(String[] args) {
        int[][] graph = {
                {1,2},
                {2,3},
                {5},
                {0},
                {5},
                {},
                {}
        };
        System.out.println(eventualSafeNodes(graph));
    }
    private static boolean detectCycleDfs(int node, boolean[] vis, boolean[] path,
                                   int[][] graph){
        if(vis[node] && path[node]) return true;

        path[node] = true;
        vis[node] = true;
        for(int neigh : graph[node]){
            if(!vis[neigh]){
                if(detectCycleDfs(neigh, vis, path, graph))
                    return true;
            }
            else if(path[neigh]) return true;
        }
        path[node] = false;
        return false;
    }
    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int ver = graph.length;
        boolean[] vis = new boolean[ver];
        boolean[] path = new boolean[ver];
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i<ver; i++){
            if(!vis[i]){
                if(detectCycleDfs(i, vis, path, graph))
                    path[i] = true;
            }
        }
        for(int i=0; i<path.length; i++){
            if(!path[i]) res.add(i);
        }
        return res;
    }
}
