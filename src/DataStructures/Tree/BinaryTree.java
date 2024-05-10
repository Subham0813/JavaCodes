package DataStructures.Tree;

import java.util.*;

public class BinaryTree {

    public static class Node{
        int val;
        Node left;
        Node right;
        Node (int val){
            this.val = val;
        }

        void printTree(Node node){
            if(node == null){
                return;
            }
            System.out.print(node.val + " ");
            printTree(node.left);
            printTree(node.right);
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
        if(node == null) return;
        System.out.print(node.val + " ");
        printTree(node.left);
        printTree(node.right);
    }


    public static void main(String[] args) {
//        BinaryTree bt = new BinaryTree();
//        Scanner sc = new Scanner(System.in);
//        bt.insert(sc);
//        bt.printTree(bt.root);
        //[5,4,5,1,1,null,5]

        Node r = new Node(1);
        r.left = new Node(3);
        r.right = new Node(2);

        Node ch1 = r.left;
        ch1.left = new Node(5);
        Node ch2 = r.right;
        ch2.right = new Node(9);

        Node ch3 = ch1.left;
        ch3.left = new Node(6);
        Node ch4 = ch2.right;
        ch4.left = new Node(7);
        r.printTree(r);

//        System.out.println(r.longestUnivaluePath(r));
//        List<List<Integer>> list = r.closestNodes(r,Arrays.asList(2,5,16));
//        for(List<Integer> li : list){
//            System.out.println(Arrays.toString(li.toArray()));
//        }
        System.out.println();
        System.out.println(r.widthOfBinaryTree(r));

    }


}
