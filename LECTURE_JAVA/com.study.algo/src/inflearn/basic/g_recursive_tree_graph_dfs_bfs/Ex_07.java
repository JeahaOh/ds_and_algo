package inflearn.basic.g_recursive_tree_graph_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 이진트리 순회
 * 너비 우선 탐색 [BFS; Breath First Search] : 레벨 탐색
 */
public class Ex_07 {
    Node root;
    public void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        
        while (!q.isEmpty()) {
            int length = q.size();
            System.out.print("level -> " + L + " : ");
            
            for (int i = 0; i < length; i++) {
                Node cur = q.poll();
                System.out.print(cur.data + " ");
                
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            L++;
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Ex_07 tree = new Ex_07();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.bfs(tree.root);
    }
}