package b_array;
import java.util.Scanner;

public class Ex_11 {
  public static int solution(int n, int[][] array) {
    // 최댓값 비교를 위해 최소값으로 초기화
    int answer = 0, max = Integer.MIN_VALUE;
    
    for (int i = 1; i <= n; i++) {
      int cnt = 0;
      
      for (int j = 1; j <= n; j++) {
        // i 학생의 k 학년 반을 j 학생의 k 학년의 반과 비교
        for (int k = 1; k <= 5; k++) {
          if (array[i][k] == array[j][k]) {
            cnt++;
            // 한번이라도 같은 반이였었다면 다음 학년은 카운트 필요가 없다.
            break;
          }
        }
      }
      
      // cnt가 제일 많은 학생(i)을 찾는다
      if (cnt > max) {
        max = cnt;
        answer = i;
      }
    }
    
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] array = new int[n + 1][6];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= 5; j++) {
        array[i][j] = sc.nextInt();
      }
    }
    System.out.println(solution(n, array));
  }
}