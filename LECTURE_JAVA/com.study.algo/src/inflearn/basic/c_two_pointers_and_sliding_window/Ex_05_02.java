package inflearn.basic.c_two_pointers_and_sliding_window;

import java.util.Scanner;

/**
 * 연속된 자연수의 합 수학적으로 풀기
 */
public class Ex_05_02 {
  public static int solution(int n) {
    int answer = 0, cnt = 1;
    
    n--;
    while (n > 0) {
      cnt++;
      n = n - cnt;
      if (n % cnt == 0) answer++;
    }
    
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(solution(n));
  }
}