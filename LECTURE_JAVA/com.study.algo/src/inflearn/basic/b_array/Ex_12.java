package inflearn.basic.b_array;

import java.util.Scanner;

public class Ex_12 {
  public static int solution(int n, int m, int[][] array) {
    int answer = 0;
    
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        // 멘토 멘티의 짝을 이룰수 있는지
        int cnt = 0;
        // 테스트 만큼 반
        for (int k = 0; k < m; k++) {
          // i, j 학생의 등수
          int pi = 0, pj = 0;
          for (int s = 0; s < n; s++) {
            // i와 j의 등수 가져오기
            if (array[k][s] == i) pi = s;
            if (array[k][s] == j) pj = s;
          }
          // i가 j보다 등수가 높다면, 멘토 멘티를 이룰 수 있음.
          if (pi < pj) cnt++;
        }
        // 모든 경우에 등수가 앞선다면
        if (cnt == m) answer ++;
      }
    }
    
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 총 학생 수
    int n = sc.nextInt();
    // 총 시험의 수
    int m = sc.nextInt();
    int[][] array = new int[m][n];
    
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        array[i][j] = sc.nextInt();
      }
    }
    
    System.out.println(solution(n, m, array));
  }
}