package h_advance_dfs_and_bfs;

import java.util.Scanner;

/**
 * 중복 순열 구하기
 * 1부터 N 까지 번호가 적힌 구슬이 있음.
 * 이 중 중복을 허락하여 M번 뽑아 일렬로 나열하는 방법을 모두 출력
 *
 * 입력
 * 첫 번째 줄에 자연수 N(3 <= N <= 10)과 M(2 <= M <= N)이 주어짐
 *
 * 출력
 * 첫 번째 줄에 결과를 출력
 * 출력순서는 사전순으로 오름차순으로 출력
 *
 * 입력
 * 3 2
 *
 * 출력
 * 1 1
 * 1 2
 * 1 3
 * 2 1
 * 2 2
 * 2 3
 * 3 1
 * 3 2
 * 3 3
 */
public class Ex_04 {
    static int[] pm;
    static int n, m;
  
    public static void dfs(int level) {
        if (level == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println("");
        } else {
          for (int i = 1; i <= n; i++) {
              pm[level] = i;
              dfs(level + 1);
          }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        
        pm = new int[m];
        dfs(0);
    }
}