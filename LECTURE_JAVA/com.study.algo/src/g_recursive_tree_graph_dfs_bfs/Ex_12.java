package g_recursive_tree_graph_dfs_bfs;

import java.util.Scanner;

/**
 * Ex_11
 * 그래프와 인접행렬
 * 그래프 = G(V, E)
 * Ex_12
 * 경로 탐색 (인접행렬)
 */
public class Ex_12 {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] checks;
    public static void dfs(int v) {
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && checks[i] == 0) {
                    checks[i] = 1;
                    dfs(i);
                    checks[i] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 노드의 갯수
        n = sc.nextInt();
        // 간선의 갯수
        m = sc.nextInt();
        // 인접행렬 그래프
        graph = new int [n + 1] [n + 1];
        // 방문 확인을 위한 체크 배열
        checks = new int[n + 1];
        
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        
        checks[1] = 1;
        dfs(1);
        System.out.println(answer);
        
    }
    
// 5 9 1 2 1 3 1 4 2 1 2 3 2 5 3 4 4 2 4 5

}
