package b_array;

import java.util.Scanner;

public class Ex_09 {
  public static int solution(int n, int[][] arr) {
    int answer = Integer.MIN_VALUE;
    
    int sumRow, sumColumn;
    
    for (int i = 0; i < n; i++) {
      sumRow = sumColumn = 0;
      for (int j = 0; j < n; j++) {
        sumRow += arr[i][j];
        sumColumn += arr[j][i];
      }
      answer = Math.max(answer, sumRow);
      answer = Math.max(answer, sumColumn);
    }
    
    sumRow = sumColumn = 0;
    for (int i = 0; i < n; i++) {
      sumRow += arr[i][i];
      sumColumn += arr[i][n - i - 1];
    }
    
    answer = Math.max(answer, sumRow);
    answer = Math.max(answer, sumColumn);
    
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[][] arr = new int[n][n];
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println(solution(n, arr));
  }
}