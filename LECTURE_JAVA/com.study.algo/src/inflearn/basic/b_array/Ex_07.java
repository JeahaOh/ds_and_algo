package inflearn.basic.b_array;

import java.util.Scanner;

public class Ex_07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] scores = new int[n];
    
    for (int i = 0; i < n; i++) {
      scores[i] = sc.nextInt();
    }
    
    System.out.println(solution(scores));
  }
  
  public static int solution(int[] scores) {
    int answer = 0;
    int cnt = 0;
    
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] == 0) cnt = 0;
      else {
        cnt++;
        answer += cnt;
      }
    }
    
    return answer;
  }
}