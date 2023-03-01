package inflearn.basic.g_recursive_tree_graph_dfs_bfs;

// 재귀함수를 이용해서 2진수 출력하기
public class Ex_02 {
    public static void dfs(int n) {
        if (n == 0) return;
        
        dfs(n / 2);
        System.out.print(n % 2 + " ");
    
    }
    
    public static void main(String[] args) {
        dfs(11);
    }
}