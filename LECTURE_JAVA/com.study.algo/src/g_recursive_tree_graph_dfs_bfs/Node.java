package g_recursive_tree_graph_dfs_bfs;

public class Node {
    int data;
    Node left, right;
    
    public Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}
