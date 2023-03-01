package inflearn.basic.h_advance_dfs_and_bfs;

import java.util.Scanner;

/**
 * 섬나라 아일랜드 DFS
 */
public class Ex_13_DFS {
    
    // 8방향 좌표 {좌, 좌상, 상, 우상, 우, 우하, 하, 좌하}
    static int[] dx = {-1, -1, 0, 1, 1, 1 ,0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    
    static int n, answer = 0;
    static int[][] map;
    
    public static void dfs(int x, int y) {
        // loop 안에서 8 방향 좌표 만들기
        for (int i = 0; i < dx.length; i++) {
             int nx = x + dx[i];
             int ny = y + dy[i];
             // 유효한 범위인가?
             boolean isValidRange = (nx >= 0 && nx < n) && (ny >= 0 && ny < n);
             // 해당 위치가 육지라면
             if (isValidRange && map[nx][ny] == 1) {
                 // 부분 출발 지점을 의 값 변경
                 map[nx][ny] = 0;
                 dfs(nx, ny);
             }
        }
    }
    
    public static void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    answer++;
                    // 출발 지점을 의 값 변경
                    map[i][j] = 0;
                    dfs(i, j);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        
        solution();
        
        System.out.println(answer);
    }
}