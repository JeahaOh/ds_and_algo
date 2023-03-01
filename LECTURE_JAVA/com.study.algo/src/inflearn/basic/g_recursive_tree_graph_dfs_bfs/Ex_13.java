package inflearn.basic.g_recursive_tree_graph_dfs_bfs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 경로탐색 (인접리스트, ArrayList)
 */
public class Ex_13 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] checks;
    
    public static void dfs(int v) {
        if (v == n) answer++;
        else {
            for (int nv : graph.get(v)) {
                if (checks[nv] == 0) {
                    checks[nv] = 1;
                    dfs(nv);
                    checks[nv] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        
        checks = new int[n + 1];
        
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        
        checks[1] = 1;
        dfs(1);
        
        System.out.println(answer);
    }
    // 5 9 1 2 1 3 1 4 2 1 2 3 2 5 3 4 4 2 4 5
}