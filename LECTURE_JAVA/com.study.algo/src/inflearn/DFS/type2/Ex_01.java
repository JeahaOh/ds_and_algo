package inflearn.DFS.type2;

import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1012
 * Created by jeaha on 2023/08/12
 */
public class Ex_01 {
    private static boolean[][] graph;
    private static int MAX = 50 + 10;
    private static int T, N, M, K;
    private static int[] dirX = {0, 0, -1, 1};
    private static int[] dirY = {1, -1, 0, 0};
    private static int answer;
    
    private static void dfs(int y, int x) {
        graph[y][x] = false;
        
        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            
            if (newX < 0 || M < newX) continue;
            if (newY < 0 || N < newY) continue;
            
            if (graph[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        T = Integer.parseInt(st.nextToken());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            
            graph = new boolean[MAX][MAX];
            answer = 0;
            
            // 1. map 정보 반영
            int x, y;
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());
                
                graph[y + 1][x + 1] = true;
            }
            
            // 2. dfs 수행
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if (graph[i][j]) {
                        answer++;
                        dfs(i, j);
                    }
                }
            }
            
            // 3. 출력
            bw.write(String.valueOf(answer));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
