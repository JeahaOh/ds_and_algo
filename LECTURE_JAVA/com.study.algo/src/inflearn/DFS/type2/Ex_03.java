package inflearn.DFS.type2;

import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/4963
 * Created by jeaha on 2023/08/13
 */
public class Ex_03 {
    
    private static final int MAX = 50 + 10;
    private static boolean[][] map;
    private static int[] dirY = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] dirX = {0, 1, 1, 1, 0, -1, -1, -1};
    
    private static int N, M, count;
    
    public static void dfs(int x, int y) {
        map[x][y] = false;
        
        for (int i = 0; i < 8; i++) {
            int newX = x + dirX[i];
            int newY = y + dirY[i];
            
            if (map[newX][newY]) {
                dfs(newX, newY);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            
            if (N == 0 && M == 0) break;
            
            map = new boolean[MAX][MAX];
            count = 0;
            
            // map 반영
            for (int i = 1; i <= N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= M; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken()) == 1;
                }
            }
            
            // dfs 수행
            for (int x = 1; x <= N; x++) {
                for (int y = 1; y <= M; y++) {
                    if (map[x][y]) {
                        dfs(x, y);
                        count++;
                    }
                }
            }
            
            // 출력
            bw.write(String.valueOf(count));
            bw.newLine();
        }
        
        br.close();
        bw.close();
    }
}
