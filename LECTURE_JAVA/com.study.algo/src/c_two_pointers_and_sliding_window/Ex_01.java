package c_two_pointers_and_sliding_window;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Ex_01 {
  // 쉽지만 효율적이지 않음 -> O(n log n)
//  public static int[] solution(int n, int[] arr1, int m, int[] arr2) {
//    int[] answer = new int[n + m];
//    System.arraycopy(arr1, 0, answer, 0, arr1.length);
//    System.arraycopy(arr2, 0, answer, arr1.length, arr2.length);
//    Arrays.sort(answer);
//    return answer;
//  }
  
  // O(n)
  public static ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
    ArrayList<Integer> answer = new ArrayList<>();
    
    int p1 = 0, p2 = 0;
    
    while (p1 < n && p2 < m) {
      if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
      else answer.add(arr2[p2++]);
    }
    
    while (p1 < n) answer.add(arr1[p1++]);
    while (p2 < m) answer.add(arr2[p2++]);
    
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] arr1 = new int[n];
    for (int i = 0; i < n; i++) {
      arr1[i] = sc.nextInt();
    }
    
    int m = sc.nextInt();
    int[] arr2 = new int[m];
    for (int i = 0; i < m; i++) {
      arr2[i] = sc.nextInt();
    }
    
    for (int x : solution(n, arr1, m, arr2)) {
      System.out.print(x + " ");
    }
  }
}