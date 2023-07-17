package inflearn.basic.b_array;
import java.util.Scanner;

public class Ex_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[][] board = new int[n + 1][6];
    
    // 0 학년으로 계산하는 것 보다 1학년으로 계산하는 것이 편하다.
    for (int stdntNo = 1; stdntNo <= n; stdntNo++) {
      for (int grade = 1; grade <= 5; grade++) {
        board[stdntNo][grade] = sc.nextInt();
      }
    }
    
    System.out.println(solution(n, board));
  }
  
  public static int solution(int stdntCnt, int[][] board) {
    int clssPrsidnt = 0;
    int max = Integer.MIN_VALUE;
    
    for (int i = 1; i <= stdntCnt; i++) {
      int cnt = 0;
      
      for (int j = 1; j <= stdntCnt; j++) {
        for (int k = 1; k <= 5; k++) {
          // i 학생이 j 학생과 k 학년 때 같은 반이였는가?
          if (board[i][k] == board[j][k]) {
            cnt++;
            // 한번이라도 같은 반이었다면 다음 학년은 카운트 할 필요가 없다.
            break;
          }
        }
      }
      
      if (cnt > max) {
        max = cnt;
        clssPrsidnt = i;
      }
    }
    
    return clssPrsidnt;
  }
}