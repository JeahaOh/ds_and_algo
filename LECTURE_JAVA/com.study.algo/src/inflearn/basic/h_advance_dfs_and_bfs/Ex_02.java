package inflearn.basic.h_advance_dfs_and_bfs;

import java.util.Scanner;

/**
 * 바둑이 승차 (DFS)
 */
public class Ex_02 {
    static int MAX = Integer.MIN_VALUE;
    static int capacity;
    static int n;
    
    
    public static void dfs(int idx, int sum, int[] weights) {
        if (sum > capacity) return;
        if (idx == n) {
            MAX = (Math.max(sum, MAX));
        } else {
            dfs(idx + 1, sum + weights[idx], weights);
            dfs(idx + 1, sum, weights);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        capacity = sc.nextInt();
        n = sc.nextInt();
        int[] weights = new int[n];
        
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        
        dfs(0, 0, weights);
        
        System.out.println(MAX);
    }
}