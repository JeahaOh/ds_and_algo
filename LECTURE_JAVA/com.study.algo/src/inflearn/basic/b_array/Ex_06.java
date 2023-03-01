package inflearn.basic.b_array;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex_06 {
  public static boolean isPrime(int num) {
    if (num < 2) return false;
    if (num == 2) return true;
    
    for (int i = 2; i < num; i++) {
      if (num % i == 0) return false;
    }
    
    return true;
  }
  
  public static ArrayList<Integer> solution(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();
    
    for (int i = 0; i < n; i++) {
      int temp = arr[i];
      int res = 0;
      while (temp > 0) {
        int t = temp % 10;
        res = res * 10 + t;
        temp = temp / 10;
      }
      
      if (isPrime(res)) answer.add(res);
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