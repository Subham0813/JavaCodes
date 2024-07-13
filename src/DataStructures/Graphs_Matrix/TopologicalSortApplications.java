package DataStructures.Graphs_Matrix;

import java.util.*;

public class TopologicalSortApplications {
    public static void main(String[] args) {
        /*
        *** the graph should be a Directed acyclic graph

        *** using topological sort in a directed graph we can find cycles also

        *** using topological sort we can find shortest path for a weighted DAG
        */

        int[][] graph = {
                {1},    //0
                {3},    //1
                {3},    //2
                {},     //3
                {0,2},  //4
                {4},    //5
                {4,5}   //6
        };
        int[][] weight = {
                {2},    //0
                {1},    //1
                {3},    //2
                {},     //3
                {3,1},  //4
                {1},    //5
                {2,3}   //6
        };
        int[] shortestPath = findShortest(graph, weight, 4);
        System.out.println(Arrays.toString(shortestPath));
    }
    private static void topoSortDFS(int i , ArrayList<ArrayList<int[]>> adj, boolean[] vis, Stack<Integer> stack){
        vis[i] = true;
        for(int[] pair : adj.get(i)){
            int neigh = pair[0];
            if(!vis[neigh]) topoSortDFS(neigh,adj,vis,stack);
        }
        stack.push(i);
    }


    private static int[] findShortest(int[][] graph, int[][] weight, int startNode){
        //build adjacent list with weights
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i =0; i<graph.length; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i< graph.length; i++){
            for(int j =0; j< graph[i].length; j++){
                adj.get(i).add(new int[]{graph[i][j], weight[i][j]});
            }
        }

        //toposort mechanism
        //accessing components if disjoint graph
        boolean[] vis = new boolean[adj.size()];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< adj.size(); i++) {
            if (!vis[i]) {
                topoSortDFS(i, adj, vis, stack);
            }
        }
        int[] dist = new int[stack.size()];
        Arrays.fill(dist, (int)(1e9));
        dist[startNode] = 0;
        while(!stack.isEmpty()){
            int node = stack.pop();
            for(int[] pair : adj.get(node)){
                dist[pair[0]] = Math.min(dist[pair[0]], dist[node] + pair[1]);
            }
        }
        for(int i =0; i< dist.length; i++){
            if(dist[i] == (int)(1e9)) dist[i] = -1;//no reachable node
        }

        return dist;
    }
}
