package h_advance_dfs_and_bfs;

import java.util.Scanner;

/**
 * 순열 구하기
 * <br/>
 * 10 이하의 N 개의 자연수가 주어지면, 이 중 M 개를 뽑아 일렬로 나열하는 방법을 모두 출력.
 * <br/>
 * 입력
 * 첫 번째 줄에 자연수 N(3 <= N <= 10)과 M(2 <= M <= N)이 주어짐
 * 두 번째 줄에 N개의 자연수가 오름차순으로 주어짐
 * <br/>
 * 출력
 * 첫 번째 줄에 결과를 출력
 * 출력 순서는 사전순으로 오름차순
 * <br/>
 * 입력 예
 * 3 2
 * 3 6 9
 * <br/>
 * 출력 예
 * 3 6
 * 3 9
 * 6 3
 * 6 9
 * 9 3
 * 9 6
 */
public class Ex_06 {
    static int n, m;
    static int[] pm, ch, arr;
    
    public static void dfs(int level) {
        if (level == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[level] = arr[i];
                    dfs(level + 1);
                    ch[i] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        ch = new int[n];
        pm = new int[m];
        
        dfs(0);
    }
}