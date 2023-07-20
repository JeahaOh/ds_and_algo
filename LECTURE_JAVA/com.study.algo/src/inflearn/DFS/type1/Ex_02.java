package inflearn.DFS.type1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11724
 * Created by jeaha on 2023/07/31
 */
public class Ex_02 {
    private static boolean[][] graph;
    private static boolean[] visited;
    private static int N, M;
    private static int MAX;
    private static int answer = 0;
    
    private static void dfs(int idx) {
        visited[idx] = true;
        
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[idx][i]) {
                dfs(i);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        // 그래프에 연결 정보 채우기
        MAX = N + 10;
        
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            graph[u][v] = true;
            graph[v][u] = true;
        }
        
        // dfs 호출
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        
        // 출력 및 종료
        bw.write(String.valueOf(answer));
        br.close();
        bw.close();
    }
}
