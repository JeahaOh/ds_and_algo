package b_array;

import java.util.Scanner;

public class Ex_08 {
  public static int[] solution(int n, int[] arr) {
    int[] answer = new int[n];
    
    for (int i = 0; i < n; i++) {
      int cnt = 1;
      for (int j = 0; j < n; j++) {
        if (arr[i] < arr[j]) cnt++;
      }
      answer[i] = cnt;
    }
  
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    
    for (int x : solution(n, arr)) {
      System.out.print(x + " ");
    }
  }
}