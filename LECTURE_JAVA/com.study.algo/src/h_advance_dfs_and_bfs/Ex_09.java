package h_advance_dfs_and_bfs;

import java.util.Scanner;

/**
 * 조합 구하기
 * 1부터 N 까지늬 수중 M개를 뽑는 방법의 수를 구하기
 *
 * 입력
 * 첫 줄에 자연수 N (3 <= N 1 <= 10) M (2 <= M <= N)
 *
 * 출력
 * 사전순 오름차순 출력
 *
 * 입력 예
 * 4 2
 *
 * 출력 예
 * 1 2
 * 1 3
 * 1 4
 * 2 3
 * 2 4
 * 3 4
 *
 * 조합 패턴은 기억해 두는 것이 좋다
 */
public class Ex_09 {
    
    static int[] combi;
    static int n, m;
    
    public static void dfs(int level, int s) {
        if (level == m) {
            for (int x : combi) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[level] = i;
                dfs(level + 1, i + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        
        dfs(0, 1);
    }
}