package Others;
import java.util.*;


/*
class LockingTree {
    class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
        int id = -1;
    }

    private Node traverse(Node root, int num){
        if(root == null) return null;
        if(root.val == num) return root;
        Node left = traverse(root.left, num);
        Node right = traverse(root.right, num);

        if(left != null) return left;
        if(right != null) return right;
        else return null;
    }

    private Node decendentId(Node node){
        if(node == null) return null;
        if(node.id != -1) return node;
        Node left = decendentId(node.left);
        Node right = decendentId(node.right);

        if(left != null && left.id != -1) return left;
        if(right != null && right.id != -1) return right;
        else return null;
    }

    Node root;
    public LockingTree(int[] parent) {

        if(parent.length>0) root = new Node(0);
        else root = null;
        for(int i=1; i<parent.length; i++){
            Node node = traverse(root, parent[i]);
            if(node == null) continue;
            if(node.left == null) node.left = new Node(i);
            else if(node.right == null) node.right = new Node(i);
            parent[i] = -1;
        }
        for(int i = parent.length-1; i>=1; i--){
            if(parent[i] != -1){
                Node node = traverse(root, parent[i]);
                if(node == null) continue;
                if(node.left == null) node.left = new Node(i);
                else if(node.right == null) node.right = new Node(i);
                parent[i] = -1;
            }
        }
    }

    public boolean lock(int num, int user) {
        Node node = traverse(root, num);
        if(node == null || node.id != -1) return false;
        else {
            node.id = user;
            return true;
        }
    }

    public boolean unlock(int num, int user) {
        Node node = traverse(root, num);
        if(node == null || node.id != user) return false;
        else{
            node.id = -1;
            return true;
        }
    }

    public boolean upgrade(int num, int user) {
        Node node = traverse(root,num);
        if(node == null) return false;
        if(node.id == -1){
            Node left = decendentId(node.left);
            Node right = decendentId(node.right);
            if(left!=null){
                node.id = user;

                left.id = -1;
                return true;
            } else if(right!=null){
                node.id = user;
                right.id = -1;
                return true;
            } else return false;
        }
        else return false;
    }
}
*/
class LockingTree {
    Map<Integer, Queue<Integer>> parent_child;
    int[] p;
    int[] id;

    public LockingTree(int[] parent) {
        parent_child = new HashMap<>();
        p = parent;
        id = new int[parent.length];
        Arrays.fill(id, -1);
        for (int i = 0; i < parent.length; i++) {
            parent_child.put(i, new LinkedList<>());
        }
        for (int i = 1; i < parent.length; i++) {
            parent_child.get(parent[i]).add(i);
        }
    }

    private boolean hasLockedDescendant(int num) {
        if (parent_child.containsKey(num)) {
            Queue<Integer> q = new LinkedList<>(parent_child.get(num));
            while (!q.isEmpty()) {
                //check id of each child
                int child = q.poll();
                if (id[child] != -1) return true;
                else {
                    q.addAll(new LinkedList<>(parent_child.get(child)));
                }
            }
        }
        return false;
    }

    private boolean hasLockedAncestor(int num) {
        num = p[num];
        while (num >= 0) {
            if (id[num] != -1) return true;
            else num = p[num];
        }
        return false;
    }

    public boolean lock(int num, int user) {
        if (parent_child.containsKey(num)) {
            // check id
            if (id[num] == -1) {
                id[num] = user;
                return true;
            }
        }
        return false;
    }

    public boolean unlock(int num, int user) {
        if (parent_child.containsKey(num)) {
            // check id
            if (id[num] == user) {
                id[num] = -1;
                return true;
            }
        }
        return false;
    }

    public boolean upgrade(int num, int user) {
        if (parent_child.containsKey(num)) {
            // Check if the node itself is unlocked and has at least one locked child and no
            // locked parent
            if (id[num] == -1 && hasLockedDescendant(num) && !hasLockedAncestor(num)) {
                id[num] = user; // Lock the current node
                // Unlock all descendants
                Queue<Integer> q = new LinkedList<>(parent_child.get(num));
                while (!q.isEmpty()) {
                    int child = q.poll();
                    id[child] = -1;
                    q.addAll(new LinkedList<>(parent_child.get(child)));
                }
                return true;
            }
        }
        return false;
    }

    /**
     * Your LockingTree object will be instantiated and called as such:
     * LockingTree obj = new LockingTree(parent);
     * boolean param_1 = obj.lock(num,user);
     * boolean param_2 = obj.unlock(num,user);
     * boolean param_3 = obj.upgrade(num,user);
     */


    public static void main(String[] args) {
        int[] parent = {-1, 0, 3, 4, 7, 4, 3, 0, 1, 8};
        LockingTree obj = new LockingTree(parent);
        System.out.println(obj.parent_child);
//    "lock","upgrade","unlock","lock","lock","upgrade","lock","upgrade"
//     [8,25],[9,44],   [6,12],  [8,4], [5,50],[1,15],   [3,21],[9,32]
        System.out.println(obj.lock(8, 5));
        System.out.println(obj.upgrade(9, 44));
        System.out.println(obj.unlock(6, 12));
        System.out.println(obj.lock(8, 4));
        System.out.println(obj.lock(5, 50));
        System.out.println(obj.upgrade(1, 15));
        System.out.println(obj.lock(3, 21));
        System.out.println(obj.upgrade(9, 32));
//    System.out.println(obj.upgrade(9,2));
//    System.out.println(obj.upgrade(8,41));
//    System.out.println(obj.unlock(5,36));
//    System.out.println(obj.unlock(7,29));
        //    System.out.println(obj.upgrade(1, 19));
        System.out.println(isValidSerialization("9,#,92,#,#"));
        int[] a = {123123,11921,1,0,123};
        System.out.println(findRelativeRanks(a));

    }

    //    public static boolean isValidSerialization(String preorder) {
//        String[] pre = preorder.split(",");
//        Stack<String> st = new Stack<>();
//        int nulls = 0;
//        int child = 0;
//        for (int i = 1; i < pre.length; i++) {
//            if (!st.isEmpty() && Objects.equals(st.peek(), "#") && !Objects.equals(pre[i], "#")) {
//                child = nulls;
//                nulls = 0;
//            }
//            st.push(pre[i]);
//
//            if (Objects.equals(pre[i], "#"))
//                nulls++;
//            if (nulls == 2) {
//                while (nulls-- > 0)
//                    st.pop();
//                child++;
//                nulls = 0;
//            }
//            if (child == 2) {
//                while (child > 0){
//                    st.pop();
//                    child = st.size();
//                }
//            }
//        }
//
//        return st.isEmpty();
//    }
    static int i;
    static boolean left;
    static boolean right;

    public static boolean isValidSerialization(String preorder) {
        String[] sb = preorder.split(",");
        i=0;
        return dfs(sb) & (i == sb.length);
    }

    private static boolean dfs(String[] sb) {
        if (i == sb.length) return false;
        if (Objects.equals(sb[i], "#")) {
            sb[i++] = "";
            return true;
        }
        sb[i++] = "";
        boolean left = dfs(sb);
        boolean right = dfs(sb);

        return left & right;
    }
    public static String[] findRelativeRanks(int[] score) {
        int[] id = new int[123124];
        Arrays.fill(id, -1);
        for(int i = 0; i<score.length; i++){
            id[score[i]] = i;
        }

        String[] ans = new String[score.length];
        int count = 0;
        for(int i = id.length - 1; i >=0 ; i--){
            if(id[i] == -1) continue;
            else count++;
            if(count == 1) ans[id[i]] = "Gold Medal";
            else if(count == 2) ans[id[i]] = "Silver Medal";
            else if(count == 3) ans[id[i]] = "Bronze Medal";
            else ans[id[i]] = String.valueOf(count);
        }
        return ans;
    }


}