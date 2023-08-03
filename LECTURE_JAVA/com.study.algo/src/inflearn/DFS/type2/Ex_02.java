package inflearn.DFS.type2;

import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/13565
 * Created by jeaha on 2023/08/12
 */
public class Ex_02 {
    private static final int MAX = 1000 + 10;
    private static int[] dirX = {0, 0, -1, 1};
    private static int[] dirY = {1, -1, 0, 0};
    private static boolean[][] graph;
    private static int M, N;
    private static boolean answer;
    
    private static void dfs(int y, int x) {
        if (answer) return;
        
        if (y == M) {
            answer = true;
            return;
        }
        
        graph[y][x] = false;
        
        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            
            if (graph[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        
        graph = new boolean[MAX][MAX];
        
        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                graph[i + 1][j + 1] = line.charAt(j) != '1';
            }
        }
        
        for (int i = 1; i <= N; i++) {
            if (graph[1][i]) {
                dfs(1, i);
            }
        }
        
        if (answer) bw.write("YES");
        else bw.write("NO");
        
        br.close();
        bw.close();
    }
}
