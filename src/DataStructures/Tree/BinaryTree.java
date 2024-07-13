package DataStructures.Tree;

import java.util.*;

public class BinaryTree {

    public static class Node{
        int val;
        Node left;
        Node right;
        Node(){}
        Node (int val){
            this.val = val;
        }

        void printTree(Node node){
            if(node == null){
//                System.out.print("N" + " ");
                return;
            }
            System.out.print(node.val + " ");
            printTree(node.left);
            printTree(node.right);
        }
        void printBFS(Node node){

            Queue<Node> q = new LinkedList<>();
            q.offer(node);
            while(!q.isEmpty()){
                int size = q.size();
                for(int i =0; i< size; i++){
                    Node curr = q.poll();
                    if(curr == null ) System.out.print("N ");
                    else System.out.print(curr.val + " ");
                    if(curr!=null){
                        q.offer(curr.left);
                        q.offer(curr.right);
                    }
                }
            }
        }

        static Map<Node, Integer> map = new HashMap<>();
        public int longestUnivaluePath(Node root) {
            dfs(root);
            int max = Integer.MIN_VALUE;
            for (Map.Entry<Node, Integer> entry : map.entrySet()) {
                max = Math.max(max, entry.getValue());
            }
            return max;
        }
        private void dfs(Node root){
            if(root == null) return;
            if(root.left!=null && root.left.val == root.val){
                map.put(root, map.getOrDefault(root, 0) +1);
            }
            dfs(root.left);
            if(root.right!=null && root.right.val == root.val){
                map.put(root, map.getOrDefault(root, 0) +1);
            }
            dfs(root.right);
        }
        public int widthOfBinaryTree(Node root) {
            if (root == null)
                return 0;
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            int maxWidth = 0;
            int tn = 1; //total nodes
            int mn = 0; //missing nodes
            int lvl = 0;
            while (!queue.isEmpty()) {
                int n = queue.size();
                int tm = 0; //tempMissing
                for(int i=0; i<n; i++){

                    Node x = queue.poll();
                    if(x.left!=null) {
                        queue.offer(x.left);
                        if(tm>0) tm = 0;
                    } else tm++;

                    if(x.right!=null) {
                        queue.offer(x.right);
                        if(tm>0) tm = 0;
                    } else tm++;

                }
                if(queue.isEmpty()) return maxWidth;
                mn += tm;
                tn = (2 << lvl++) - mn;
                maxWidth = Math.max(maxWidth, tn);
                mn *= 2;
            }
            return maxWidth;
        }
        public static Node removeLeafNodes(Node root, int target) {
            if(root == null) return root;
            root.left = removeLeafNodes(root.left, target);
            root.right = removeLeafNodes(root.right, target);
            if(root.left == null && root.right == null && root.val == target){
                root = null;
            }
            return root;
        }

        public static List<Node> findDuplicateSubtrees(Node root) {
//            Map<Integer, Node> map = new HashMap<>();
            Set<String> set = new HashSet<>();
            List<Node> list = new ArrayList<>();
            dfs(root, set, list);

            return list;
        }
//        static void dfs2(Node root, Map<Integer, Node> map, List<Node> list){
//            if(root == null) return;
//            dfs2(root.left, map, list);
//            dfs2(root.right, map, list);
//            if(!map.containsKey(root.val)) map.put(root.val, root);
//            else if(matchedTree(root, map.get(root.val))) list.add(root);
//        }
public static String dfs(Node root, Set<String> set, List<Node> list) {
    if (root == null)
        return "N";
    StringBuilder s = new StringBuilder();
    s.append((char) (root.val + '0'));
    s.append(dfs(root.left, set, list));
    s.append(dfs(root.right, set, list));

    if (set.contains(s.toString())) list.addFirst(root);
    else set.add(s.toString());
    return s.toString();
}
        public static boolean matchedTree(Node root_A, Node root_B){
            if(root_A == null && root_B == null) return true;
            if(root_A == null || root_B == null) return false;
            if(root_A.val != root_B.val) return false;
            else return true & matchedTree(root_A.left, root_B.left) &  matchedTree(root_A.right, root_B.right);
        }

    }
    static Node root;
    BinaryTree(){

    }
    private static void insert(Scanner sc){
        System.out.println("enter root node value :");
        root = new Node(sc.nextInt());
        insertMore(sc, root);
    }

    private static void insertMore(Scanner sc, Node root) {
        System.out.print("do you want to create left child of Node " +root.val + " ?");
        String left = sc.next();
        if(left.equals("yes")){
            System.out.print("enter child node value :");
            root.left = new Node(sc.nextInt());
            insertMore(sc, root.left);
        }
        System.out.print("do you want to create right child of Node " +root.val + " ?");
        String right = sc.next();
        if(right.equals("yes")){
            System.out.print("enter child node value :");
            root.right = new Node(sc.nextInt());
            insertMore(sc, root.right);
        }

    }
    private static void printTree(Node node){
        if(node == null) {
            System.out.print('N' + " ");
            return;
        }
        System.out.print(node.val + " ");
        printTree(node.left);
        printTree(node.right);
    }
    public static Node removeLeafNodes(Node root, int target) {
        if(root == null) return root;
        Node left = removeLeafNodes(root.left, target);
        Node right = removeLeafNodes(root.right, target);
        if(left == null && right == null && root.val == target){
            return new Node();
        }
        else return root;
    }


    public static void main(String[] args) {
//        BinaryTree bt = new BinaryTree();
//        Scanner sc = new Scanner(System.in);
//        bt.insert(sc);
//        bt.printTree(bt.root);
        //[5,4,5,1,1,null,5]

        Node r = new Node(0);
        r.left = new Node(0);
        r.right = new Node(0);

        Node ch1 = r.left;
        ch1.left = new Node(0);
        Node ch2 = r.right;
//        ch2.left = new Node(2);
//        ch2.left.left= new Node(4);
        ch2.right = new Node(0);
        ch2.right.left = new Node(0);

//        Node ch3 = ch1.left;
//        ch3.left = new Node(6);
//        Node ch4 = ch2.right;
//        ch4.left = new Node(7);
        r.printBFS(r);
        System.out.println();
//        r.printTree(Node.removeLeafNodes(r, 2));

//        System.out.println(r.longestUnivaluePath(r));
//        List<List<Integer>> list = r.closestNodes(r,Arrays.asList(2,5,16));
//        for(List<Integer> li : list){
//            System.out.println(Arrays.toString(li.toArray()));
//        }
//        System.out.println();
//        System.out.println(r.widthOfBinaryTree(r));
        System.out.println(r.findDuplicateSubtrees(r));
    }
}
