package inflearn.DFS.type2;

import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/16173
 * Created by jeaha on 2023/08/13
 */
public class Ex_05 {
    private static int MAX = 3 + 10 + 100;
    private static int[][] map;
    private static int[] dirY = {1, 0};
    private static int[] dirX = {0, 1};
    private static int N;
    
    public static void dfs(int y, int x) {
        int curr = map[y][x];
        map[y][x] = 0;
        
        if (y == N && x == N) {
            return;
        }
        
        for (int i = 0; i < 2; i++) {
            int newY = y + dirY[i] * curr;
            int newX = x + dirX[i] * curr;
            
            if (map[newY][newX] != 0) {
                dfs(newY, newX);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N = Integer.parseInt(br.readLine());
        map = new int[MAX][MAX];
        
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        dfs(1, 1);
        
        if (map[N][N] == 0) bw.write("HaruHaru");
        else bw.write("Hing");
        
        br.close();
        bw.close();
    }
}
