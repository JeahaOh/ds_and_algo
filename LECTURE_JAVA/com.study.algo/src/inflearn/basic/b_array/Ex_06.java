package inflearn.basic.b_array;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex_06 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] arr = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.next();
//        }
//
//        for (int x : solution(n, arr)) {
//            System.out.printf("%d ", x);
//        }
//    }
//
//    public static List<Integer> solution(int n, String[] arr) {
//        List<Integer> answer = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            String reversed = reverseStr(arr[i]);
//            int num = Integer.parseInt(reversed);
//            if (isPrime(num)) answer.add(num);
//        }
//
//        return answer;
//    }
//
//    public static String reverseStr(String str) {
//        StringBuilder sb = new StringBuilder(str);
//        return sb.reverse().toString();
//    }
//
  public static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    
    return true;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    
    for (int x : solution(n, arr)) {
      System.out.printf("%d ", x);
    }
  }
  
  public static List<Integer> solution(int n, int[] arr) {
    List<Integer> answer = new ArrayList<>();
    
    for (int i = 0; i < n; i++) {
      int tmp = arr[i];
      int res = 0;
      
      while (tmp > 0) {
        int t = tmp % 10;
        res = res * 10 + t;
        tmp = tmp / 10;
      }
      
      if (isPrime(res)) answer.add(res);
    }
    
    return answer;
  }
}