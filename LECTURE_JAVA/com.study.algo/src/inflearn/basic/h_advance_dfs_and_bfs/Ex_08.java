package inflearn.basic.h_advance_dfs_and_bfs;

import java.util.Scanner;

/**
 * 수열 추측하기
 * 4 16
 */
public class Ex_08 {
    /**
     * b : combination을 저장
     * p : 순열 저장
     * check : 중복되지 않도록 표시
     */
    static int[] b, p, check;
    /**
     * 입력 n
     * final f
     */
    static int n, f;
    //
    static boolean flag = false;
    // 메모이제이션 dy
    static int[][] dy = new int[35][35];
    
    // 콤비네이션 (Ex_07)
    public static int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }
    
    // permutation
    public static void dfs(int level, int sum) {
        if (flag) return;
        if (level == n) {
            if (sum == f) {
                for (int x : p) System.out.print(x + " ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    p[level] = i;
                    dfs(level + 1, sum + (p[level] * b[level]));
                    check[i] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        check = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            b[i] = combi(n - 1, i);
        }
        
        dfs(0, 0);
    }
}