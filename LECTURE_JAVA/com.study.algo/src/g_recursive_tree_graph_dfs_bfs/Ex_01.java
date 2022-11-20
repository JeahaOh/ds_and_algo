package g_recursive_tree_graph_dfs_bfs;

// 재귀함수 스택 프라임
public class Ex_01 {
    public static void dfs(int n) {
        if (n == 0) return;
        
        dfs(n - 1);
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        dfs(3);
    }
}