package h_advance_dfs_and_bfs;

import java.util.Scanner;

/**
 * 최대점수 구하기
 */
public class Ex_03 {
    static int answer = Integer.MIN_VALUE;
    static int n, m;
    
    public static void dfs(int level, int sum, int wasted, int[] scores, int[] times) {
        if (wasted > m) return;
        if (level == n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(level + 1, sum + scores[level], wasted + times[level], scores, times);
            dfs(level + 1, sum, wasted, scores, times);
        }
    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        
        int[] scores = new int[n];
        int[] times = new int[n];
        
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
            times[i] = sc.nextInt();
        }
        
        dfs(0, 0, 0, scores, times);
        System.out.println(answer);
    }
}