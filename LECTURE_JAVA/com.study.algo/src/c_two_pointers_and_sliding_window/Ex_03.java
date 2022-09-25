package c_two_pointers_and_sliding_window;

import java.util.Scanner;

public class Ex_03 {
  public static int solution(int n, int m, int[] arr) {
    int answer, tempSum = 0;
    
    for (int i = 0; i < m; i++) {
      tempSum += arr[i];
    }
    answer = tempSum;
    
    // Sliding Window
    for (int i = m; i < n; i++) {
      tempSum += (arr[i] - arr[i - m]);
      answer = Math.max(answer, tempSum);
    }
    
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] arr = new int[n];
    int m = sc.nextInt();
    
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    
    System.out.println(solution(n, m, arr));
  }
}