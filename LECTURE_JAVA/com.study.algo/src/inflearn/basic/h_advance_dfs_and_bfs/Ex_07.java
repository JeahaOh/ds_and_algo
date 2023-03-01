package inflearn.basic.h_advance_dfs_and_bfs;

import java.util.Scanner;

/**
 * 조합의 경우수(메모이제이션)
 *
 * 첫째 줄에 자연수 n (3<= n <= 33)과 r (0 <= r <= n)이 있을 경우
 * 첫째 줄에 조합수를 출력
 *
 * 입력 예 1
 * 5 3
 * 출력 예 1
 * 10
 *
 * 입력 예 2
 * 33 19
 */
public class Ex_07 {
    // 메모이제이션
    static int [][] dy = new int[35][35];
    
    public static int dfs(int n, int r) {
        // 이미 했다면?
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(dfs(n, r));
    }
}