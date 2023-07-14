package inflearn.basic.b_array;

import java.util.Scanner;

public class Ex_08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] scores = new int[n];
    
    for (int i = 0; i < n; i++) {
      scores[i] = sc.nextInt();
    }
    
    for (int x : solution(scores)) {
      System.out.printf("%d ", x);
    }
  }
  
  public static int[] solution(int[] scores) {
    int answer[] = new int[scores.length];
    
    for (int i = 0; i < scores.length; i++) {
      int grade = 1;
      
      for (int j = 0; j < scores.length; j++) {
        if (scores[i] < scores[j]) grade++;
      }
      
      answer[i] = grade;
    }
    
    return answer;
  }
}