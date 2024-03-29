package inflearn.basic.c_two_pointers_and_sliding_window;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex_02 {
  public static ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
    ArrayList<Integer> answer = new ArrayList<>();
    
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    
    int p1 = 0, p2 = 0;
    
    while (p1 < n && p2 < m) {
      if (arr1[p1] == arr2[p2]) {
        answer.add(arr1[p1]);
        p1++;
        p2++;
      } else if (arr1[p1] < arr2[p2]) p1++;
      else if (arr1[p1] > arr2[p2]) p2++;
    }
    
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
    for (int i = 0; i < n; i++) {
      arr2[i] = sc.nextInt();
    }
    
    for (int x : solution(n, arr1, m, arr2)) {
      System.out.print(x + " ");
    }
  }
}