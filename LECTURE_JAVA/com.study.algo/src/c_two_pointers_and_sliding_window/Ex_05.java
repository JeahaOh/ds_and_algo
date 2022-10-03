package c_two_pointers_and_sliding_window;

import java.util.Scanner;

public class Ex_05 {
  public static int solution(int n) {
    int answer = 0, sum = 0;
    int right, left = 0;
    int m = n / 2 + 1;
    int[] arr = new int[m];
    
    for (int i = 0; i < m; i++) arr[i] =  i + 1;
    
    for (right = 0; right < m; right++) {
      sum += arr[right];
      if (sum == n) answer++;
      while (sum >= n) {
        sum -= arr[left++];
        if (sum == n) answer++;
      }
    }
    
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(solution(n));
  }
}