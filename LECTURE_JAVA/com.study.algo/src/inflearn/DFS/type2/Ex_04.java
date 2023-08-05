package inflearn.DFS.type2;

import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1388
 * Created by jeaha on 2023/08/13
 */
public class Ex_04 {
    private static final int MAX = 50 + 10;
    private static char[][] map;
    
    public static void dfs(int y, int x) {
        char curr = map[y][x];
        map[y][x] = '0';
        
        if (curr == '-' && map[y][x + 1] == '-') {
            dfs(y, x + 1);
        } else if (curr == '|' && map[y + 1][x] == '|') {
            dfs(y + 1, x);
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        map = new char[MAX][MAX];
        int answer = 0;
        
        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            for (int j = 1; j <= M; j++) {
                map[i][j] = line.charAt(j - 1);
            }
        }
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (map[i][j] != '0') {
                    dfs(i, j);
                    answer++;
                }
            }
        }
        
        bw.write(String.valueOf(answer));
        
        br.close();
        bw.close();
    }
}