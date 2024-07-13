package Others;
import java.util.*;

public class problem {
    public static void main(String[] args) {
        int[] parents = {-1,7,4,6,6,0,5,0,3,4};
        function(parents);
        System.out.println(countHighestScoringNodes(parents));


    }
    static int[] dp;
    static Map<Integer, List<Integer>> graph ;
    static Map<Integer, List<Integer>> children;
    static void function(int[] p){
        graph = new HashMap<>();
        children  = new HashMap<>();
        dp = new int[p.length];
        for(int i =0; i<p.length; i++){
            children.put(i, new ArrayList<>());
            graph.put(i, new ArrayList<>());
        }
        for(int i =0; i<p.length; i++){
            if(p[i] != -1){children.get(p[i]).add(i);
            graph.get(p[i]).add(i);
            graph.get(i).add(p[i]);}
        }
        /*
        for (int node : children.keySet()) {
            System.out.print(node + ": ");
            for (int neighbor : children.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
        for (int node : graph.keySet()) {
            System.out.print(node + ": ");
            for (int neighbor : graph.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
         */
        dfs(0);
        System.out.println(Arrays.toString(dp));
        int[] max = new int[p.length];
        for(int i =0; i<p.length; i++){
            int par = p[i];
            List<Integer> ch = children.get(i);
            int score = 1;
            for(int c : ch) score *= dp[c];
            if(par!=-1){
                score *= dp[0] - dp[i];
            }
            max[i] = score;

        }
        System.out.println(Arrays.toString(max));
    }
    static int dfs(int node){
        int height = 1;
        for(int child : children.get(node)){
            if (dp[child]==0) height += dfs(child);
            else height += dp[child];
        }
        dp[node] = height;
        return height;
    }

    public static int countHighestScoringNodes(int[] parents) {
        int n = parents.length;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            if (parents[i] != -1) {
                graph.get(parents[i]).add(i);
            }
        }
        int[] height = new int[n];
        long[] max = new long[n];
        Arrays.fill(height, 1);
        help(0, graph, height);
        long maxScore = 0;
        for(int i =0; i<parents.length; i++){
            int par = parents[i];
            List<Integer> ch = graph.get(i);
            long score = 1;
            for(int c : ch) score *= height[c];
            if(par!=-1) score *= height[0] - height[i];
            max[i] = score;
            maxScore = Math.max(maxScore, score);
        }
        int res = 0;
        for(long num : max){
            if(num == maxScore) res++;
        }
        return res;
    }

    private static int help(int node, List<List<Integer>> graph, int[] scores) {
        int size = 1;
        for (int child : graph.get(node)) {
            size += help(child, graph, scores);
        }
        scores[node] *= size;
        return size;
    }


}
