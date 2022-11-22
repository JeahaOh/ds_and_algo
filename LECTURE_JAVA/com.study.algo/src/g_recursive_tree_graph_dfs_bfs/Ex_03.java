package g_recursive_tree_graph_dfs_bfs;

// 재귀를 이용한 팩토리얼
public class Ex_03 {
    public static int dfs(int n) {
        if (n == 1) return 1;
        else return n * dfs(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(dfs(5));
    }
}