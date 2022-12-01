package g_recursive_tree_graph_dfs_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 그래프 최단거리 (BFS)
 */
public class Ex_15 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] checks, distance;
    
    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        checks[v] = 1;
        distance[v] = 0;
        q.offer(v);
        
        while (!q.isEmpty()) {
            int curV = q.poll();
            for (int nv : graph.get(curV)) {
                if (checks[nv] == 0) {
                    checks[nv] = 1;
                    q.offer(nv);
                    distance[nv] = distance[curV] + 1;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 정점의 갯수
        n = sc.nextInt();
        // 간선의 갯수
        m = sc.nextInt();
        // 인접 리스트
        graph = new ArrayList<>();
        
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        checks = new int[n + 1];
        distance = new int[n + 1];
        
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            graph.get(a).add(b);
        }
        
        bfs(1);
        
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + distance[i]);
        }
    }
    // 6 9 1 3 1 4 2 1 2 5 3 4 4 5 4 6 6 2 6 5
}