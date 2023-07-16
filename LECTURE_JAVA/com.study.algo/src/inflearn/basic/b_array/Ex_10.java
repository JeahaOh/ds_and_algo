package inflearn.basic.b_array;

import java.util.Scanner;

public class Ex_10 {
  // 전우좌후를 구하기 위한 배열
  private static final int[] D_X = {-1, 0, 1, 0};
  private static final int[] D_Y = {0, 1, 0, -1};
  
  public static int solution(int n, int[][] array) {
    int answer = 0;
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        
        boolean flag = true;
        for (int k = 0; k < 4; k++) {
          int nx = i + D_X[k];
          int ny = j + D_Y[k];
          
          // 범위가 완충지대로 나가지 않게 계산
          boolean isComparable = (0 <= nx && nx < n && 0 <= ny && ny < n);
          if (isComparable && array[nx][ny] >= array[i][j]) {
            flag = false;
            break;
          }
        }
        
        if (flag) answer++;
        
      }
    }
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] array = new int[n][n];
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        array[i][j] = sc.nextInt();
      }
    }
    System.out.println(solution(n, array));
  }
}