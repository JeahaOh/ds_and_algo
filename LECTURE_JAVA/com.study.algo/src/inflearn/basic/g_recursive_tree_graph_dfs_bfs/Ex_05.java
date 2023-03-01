package inflearn.basic.g_recursive_tree_graph_dfs_bfs;

// 이진트리의 깊이 우선 탐색(DFS: Depth First Search)
public class Ex_05 {
    Node root;
    
    public static void dfs(Node root) {
        if (root == null) return;
        else {
            // 전위순회
            //System.out.print(root.data + " ");
            
            dfs(root.left);
            
            // 중위순회
            //System.out.print(root.data + " ");
            
            dfs(root.right);
            
            // 후위순회
            System.out.print(root.data + " ");
        }
    }
    
    public static void main(String[] args) {
        Ex_05 tree = new Ex_05();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.dfs(tree.root);
    }
}