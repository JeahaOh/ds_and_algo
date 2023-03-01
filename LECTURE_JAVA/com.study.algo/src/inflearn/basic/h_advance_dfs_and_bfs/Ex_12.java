package inflearn.basic.h_advance_dfs_and_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 토마토 bfs
 */
public class Ex_12 {
    // {좌, 상, 우, 하}
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] box, dis;
    static int m, n;
    static Queue<Point> q = new LinkedList<>();
    
    public static void bfs() {
        while (!q.isEmpty()) {
            Point temp = q.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                
                // 새로운 좌표가 박스 내부에 있고,
                // 해당 좌표의 값이 box 안의 익지 않은 사과일 경우
                if (
                        (nx >= 0 && nx < n)
                    &&  (ny >= 0 && ny < m)
                    &&  (box[nx][ny] == 0)
                ) {
                    // 해당 사과가 익었다고 1로 표시
                    box[nx][ny] = 1;
                    // queue에 담음
                    q.offer(new Point(nx, ny));
                    // 익은 날짜를 이전 레벨의 사과 + 1일 하여 저장
                    dis[nx][ny] = dis[temp.x][temp.y] + 1;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 가로
        m = sc.nextInt();
        // 세로
        n = sc.nextInt();
        // 토마토가 담긴 박스
        box = new int[n][m];
        // 토마토가 익는 날짜를 기록하는 2차원 배열
        dis = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 입력값을 2차원 배열 box에 담기
                box[i][j] = sc.nextInt();
                // 이미 익은 토마토는 1 level 이므로 queue에 미리 담아둠
                if (box[i][j] == 1) q.offer(new Point(i, j));
            }
        }
        
        bfs();
        
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        // box에서 dfs 결과에 반영이 안된 값이 있다면 flag는 false
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) flag = false;
            }
        }
        
        if (flag) {
            // dis에서 최댓값을 구한다
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }
        else System.out.println(-1);
    }
}