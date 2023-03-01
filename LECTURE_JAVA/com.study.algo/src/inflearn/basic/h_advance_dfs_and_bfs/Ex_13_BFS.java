package inflearn.basic.h_advance_dfs_and_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 섬나라 아일랜드 BFS
 */
public class Ex_13_BFS {
    static int answer = 0, n;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static Queue<Point> queue = new LinkedList<>();
    
    static int[][] map;
    
    public static void bfs(int x, int y) {
        queue.add(new Point(x, y));
        
        while (!queue.isEmpty()) {
          Point pos = queue.poll();
          for (int i = 0; i < dx.length; i++) {
            int nx = pos.x + dx[i];
            int ny = pos.y + dy[i];
            boolean isValidRange = (nx >= 0 && nx < n) && (ny >= 0 && ny < n);
            if (isValidRange && map[nx][ny] == 1) {
              map[nx][ny] = 0;
              queue.add(new Point(nx, ny));
            }
          }
        }
    }
    
    public static void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    answer++;
                    map[i][j] = 0;
                    bfs(i, j);
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