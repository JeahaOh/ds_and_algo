package inflearn.basic.h_advance_dfs_and_bfs;

import java.util.Scanner;

/**
 * 합이 같은 부분집합
 * Ex_01 이미지 참고
 */
public class Ex_01 {
    static String answer = "NO";
    static int depth, total = 0;
    static boolean flag = false;
    
    public static void dfs(int turn, int sum, int[] arr) {
        if (flag) return;
        if (sum > total / 2) return;
        
        if(turn == depth) {
          if ((total - sum) == sum) {
              answer = "YES";
              flag = true;
          }
        } else {
          dfs(turn + 1, sum + arr[turn], arr);
          dfs(turn + 1, sum, arr);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        depth = sc.nextInt();
        int[] arr = new int[depth];
        
        for (int i = 0; i < depth; i++) {
          arr[i] = sc.nextInt();
          total += arr[i];
        }
        
        dfs(0, 0, arr);
        
        System.out.println(answer);
    }
}
// 6
// 1 3 5 6 7 10