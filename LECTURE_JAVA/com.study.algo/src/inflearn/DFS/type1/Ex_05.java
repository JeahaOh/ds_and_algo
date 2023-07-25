package inflearn.DFS.type1;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1260
 * DFS와 BFS
 * Created by jeaha on 2023/07/25
 */
public class Ex_05 {
    private static int MAX;
    private static int N, M, V;
    private static boolean[][] graph;
    private static boolean[] visited;
    private static ArrayList<Integer> queue;
    
    public static void dfs(int idx) {
        visited[idx] = true;
        System.out.print(idx + " ");
        
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[idx][i]) {
                dfs(i);
            }
        }
    }
    
    public static void bfs() {
        queue = new ArrayList<>();
        visited = new boolean[MAX];
        
        queue.add(V);
        visited[V] = true;
        
        while (!queue.isEmpty()) {
            int idx = queue.remove(0);
            System.out.print(idx + " ");
            
            for (int i = 1; i <= N; i++) {
                if (!visited[i] && graph[idx][i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
    
        MAX = N + 10;
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            graph[x][y] = true;
            graph[y][x] = true;
        }
        
        dfs(V);
        System.out.println();
        bfs();
        
        br.close();
    }
}
