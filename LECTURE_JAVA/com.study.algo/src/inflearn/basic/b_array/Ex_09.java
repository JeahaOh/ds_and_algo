package inflearn.basic.b_array;

import java.util.Scanner;

public class Ex_09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[][] board = new int[n][n];
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = sc.nextInt();
      }
    }
    
    System.out.println(solution(n, board));
  }
  
  public static int solution(int n, int[][] board) {
    int answer = Integer.MIN_VALUE;
    int sum1;
    int sum2;
    
    for (int i = 0; i < n; i++) {
      sum1 = 0;
      sum2 = 0;
      
      for (int j = 0; j < n; j++) {
        sum1 += board[i][j];
        sum2 += board[j][i];
      }
      
      answer = Math.max(sum1, sum2);
    }
    
    sum1 = 0;
    sum2 = 0;
    
    for (int i = 0; i < n; i++) {
      sum1 += board[i][i];
      sum2 += board[i][n - i - 1];
    }
    
    answer = Math.max(answer, Math.max(sum1, sum2));
    
    return answer;
  }
}