import java.util.*;

public class Scrap {
    public static void main(String[] args) {
        String s = "XVI";
        System.out.println(romanToInt(s));
//        int x = 12321;
//        int result =0;
//        while(x>0){
//            int mFac = (int) Math.log10(x);
//            result += x%10 * (int)Math.pow(10,mFac);
//            x /=10;
//        }
//        System.out.println(result);
//        int[] arr = {84,49,5,24,70,77,87,8};
//        System.out.println(timeRequiredToBuy(arr, 3));
        System.out.println(reversePrefix("abcdefd", 'd'));
        int[] parents = {-1,7,4,6,6,0,5,0,3,4};
//        Map<Integer, List<Integer>> child = new HashMap<>();
//        Map<Integer, List<Integer>> graph = convertTreeToGraph(parents,child);

        // Print the graph
//        for (int node : graph.keySet()) {
//            System.out.print(node + ": ");
//            for (int neighbor : graph.get(node)) {
//                System.out.print(neighbor + " ");
//            }
//            System.out.println();
//        }
//        for (int node : child.keySet()) {
//            System.out.print(node + ": ");
//            for (int neighbor : child.get(node)) {
//                System.out.print(neighbor + " ");
//            }
//            System.out.println();
//        }


        System.out.println(countHighestScoreNodes(parents));

    }
    public static Map<Integer, List<Integer>> convertTreeToGraph(int[] parents,Map<Integer, List<Integer>> child) {
        int n = parents.length;
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // Initialize adjacency list
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
            child.put(i, new ArrayList<>());
        }

        // Iterate through the parents array and add edges to the graph
        for (int i = 0; i < n; i++) {
            if (parents[i] != -1) {
                child.get(parents[i]).add(i);
                graph.get(parents[i]).add(i);  // Add edge from parent to child
                graph.get(i).add(parents[i]);  // Add edge from child to parent (for undirected graph)
            }
        }

//        for (int i = 0; i < n; i++) {
//            graph.put(i, new ArrayList<>());
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (parents[i] != -1) {
//                graph.get(parents[i]).add(i);
//            }
//        }


        return graph;
    }

    static Map<Integer, List<Integer>> graph;
    static Map<Integer, List<Integer>> child;
    static public int countHighestScoreNodes(int[] parents) {
        int n = parents.length;
        graph = new HashMap<>();
        child = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
            child.put(i, new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            if (parents[i] != -1) {
                child.get(i).add(parents[i]);
                graph.get(parents[i]).add(i);  // Add edge from parent to child
                graph.get(i).add(parents[i]);  // Add edge from child to parent (for undirected graph)
            }
        }
        int max = Integer.MIN_VALUE;
        int count = 0 ;
        int[] heights = new int[graph.size()];
        for (int node : child.keySet()) {
            int height = 0;
            for (int neighbor : child.get(node)) {
                height += dfs(neighbor,node);

            }
            heights[node] = height;
            if(height==max){
                count += 1;
            }else if(height>max){
                max = height;
                count = 1;
            }
        }
        System.out.println(Arrays.toString(heights));
        return count;

    }

    static int dfs(int node,int parent) {
        int height = 0;
        if(node != parent) height++;
        for (int neighbor : graph.get(node)) {
            if (neighbor != parent) {
                height+=dfs(neighbor, node);
            }
        }
        return height;
    }



    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        helper(sb, word, ch, 0);
        return sb.toString();

    }

    static void helper(StringBuilder res, String word, char ch, int i){
        if(i== word.length()){
            return;
        }
        res.append(word.charAt(i));
        if(word.charAt(i) == ch){
            res = res.reverse().append(word.substring(i+1, word.length()-1));
            return;
        }
        helper(res, word, ch, i+1);
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        while(tickets[k]>0){
            int i;
            for(i=0; i<tickets.length; i++){
                if(tickets[i]==0) continue;
                tickets[i]--;
                count++;
            }
        }
        return count;
    }

    static int romanToInt(String s) {
        int total = 0, value = 0, pVal =0;
        for(int i =s.length()-1; i>=0; i--){
            switch(s.charAt(i)){
                case 'I':
                    value = 1;break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
            }
            if(value < pVal){
                total -= value;
            } else {
                total += value;
                pVal = value;
            }
        }
        return total;
    }
}
