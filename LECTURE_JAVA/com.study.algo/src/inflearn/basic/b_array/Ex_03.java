package inflearn.basic.b_array;

import java.util.Scanner;

public class Ex_03 {
  public static String[] solution(int n, int[][] arr) {
    String[] answer = new String[n];
    for (int i = 0; i < n; i++) {
      if (arr[i][0] == arr[i][1]) answer[i] = "D";
      else if (arr[i][0] == 1 && arr[i][1] == 3) answer[i] = "A";
      else if (arr[i][0] == 2 && arr[i][1] == 1) answer[i] = "A";
      else if (arr[i][0] == 3 && arr[i][1] == 2) answer[i] = "A";
      else answer[i] = "B";
    }
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][2];
    for (int i = 0; i < n; i++) {
      arr[i][0] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      arr[i][1] = sc.nextInt();
    }
    
    for (String s : solution(n, arr)) {
      System.out.println(s);
    }
  }
}