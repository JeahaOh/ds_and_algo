package h_advance_dfs_and_bfs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 피자 배달 거리 (삼성 SW 역량평가 기출 DFS 활용)
 */
public class Ex_14 {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    // 가정집과 피자집들의 좌표.
    static ArrayList<Point> houses, pizza_house;
    static int[][] map;
    
    public static void dfs(int level, int s) {
        if (level == m) {
            // for (int x : combi) {
            //     System.out.print(x + " ");
            // }
            // System.out.println();
            int sum = 0;
            for (Point h : houses) {
                int dist = Integer.MAX_VALUE;
                for (int i : combi) {
                    dist = Math.min(dist, Math.abs(h.x - pizza_house.get(i).x) + Math.abs(h.y - pizza_house.get(i).y));
                }
                sum += dist;
            }
            
            answer = Math.min(answer, sum);
            
        } else {
             for (int i = s; i < len; i++) {
                 combi[level] = i;
                 dfs(level + 1, i + 1);
             }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // 도시에서 살려야 하는 피자집의 수
        m = sc.nextInt();
        map = new int[n][n];
        
        houses = new ArrayList<>();
        pizza_house = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = sc.nextInt();
                if (temp == 1) houses.add(new Point(i, j));
                else if (temp == 2) pizza_house.add(new Point(i, j));
            }
        }
        
        // 피자집의 갯수, len에서 m을 뽑아야 함 -> len combination m
        len = pizza_house.size();
        combi = new int[m];
        
        dfs(0, 0);
        
        System.out.println(answer);
        
    }
}