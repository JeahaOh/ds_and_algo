package inflearn.basic.g_recursive_tree_graph_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Ex_09 {
    Node root;
    
    public int dfs(int L, Node root) {
        if (root.left == null && root.right == null) return L;
        else return Math.min(dfs(L + 1, root.left), dfs(L + 1, root.right));
    }
    
    // 최단거리는 bfs이다
    public int bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        
        q.offer(root);
        int L = 0;
        
        while (!q.isEmpty()) {
            int length = q.size();
            for (int i = 0; i < length; i++) {
                Node cur = q.poll();
                if (cur.left == null && cur.right == null) return L;
                
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            
            L++;
        }
        
        return 0;
    }
    
    public static void main(String[] args) {
        Ex_09 tree = new Ex_09();
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println(tree.dfs(0, tree.root));
        System.out.println(tree.bfs(tree.root));
    }
}