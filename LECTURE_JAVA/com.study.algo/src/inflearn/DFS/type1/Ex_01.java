package inflearn.DFS.type1;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2606
 * 바이러스
 * <p>
 * 예제 입력
 * 7
 * 6
 * 1 2
 * 2 3
 * 1 5
 * 5 2
 * 5 6
 * 4 7
 * <p>
 * 예제 출력
 * 4
 * Created by jeaha on 2023/07/24
 */
public class Ex_01 {
    static boolean[][] graph;
    static boolean[] visited;
    static int n;
    static int m;
    static int answer;
    
    public static void dfs(int idx) {
        visited[idx] = true;
        answer++;
        
        for (int i = 1; i <= n; i++) {
            if (visited[i] == false && graph[idx][i]) {
                dfs(i);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        
        graph = new boolean[n + 1][n + 1];
        visited = new boolean[n + 1];
        
        int x, y;
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            
            graph[x][y] = true;
            graph[y][x] = true;
        }
        
        dfs(1);
        
        bw.write(String.valueOf(answer - 1));
        
        br.close();
        bw.close();
    }
}
