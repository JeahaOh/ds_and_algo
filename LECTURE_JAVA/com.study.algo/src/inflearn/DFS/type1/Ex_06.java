package inflearn.DFS.type1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2644
 * Created by jeaha on 2023/07/26
 */
public class Ex_06 {
    private static boolean[][] graph;
    private static boolean[] visited;
    private static int MAX;
    private static int N, bgn, end, M;
    private static int answer = -1;
    
    private static void dfs(int idx, int count) {
        visited[idx] = true;
        
        if (idx == end) {
            answer = count;
            return;
        }
        
        for (int i = 1; i < N; i++) {
            if (!visited[i] && graph[idx][i]) {
                dfs(i, count + 1);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
    
        MAX = N + 10;
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
    
        st = new StringTokenizer(br.readLine());
        bgn = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
    
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            graph[x][y] = true;
            graph[y][x] = true;
        }
        
        dfs(bgn, 0);
        
        bw.write(String.valueOf(answer));
        
        br.close();
        bw.close();
    }
}
