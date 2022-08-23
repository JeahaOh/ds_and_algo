package a_string;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex_04 {
  public static ArrayList<String> solution(int n, String[] array) {
    ArrayList<String> answer = new ArrayList<>();
    
//    for (String e : array) {
//      String temp = new StringBuilder(e).reverse().toString();
//      answer.add(temp);
//    }
    
    for (String e : array) {
      char[] chars = e.toCharArray();
      int head = 0, tail = e.length() - 1;
      while (head < tail) {
        chars[head] ^= chars[tail];
        chars[tail] ^= chars[head];
        chars[head] ^= chars[tail];
        head++;
        tail--;
      }
      answer.add(String.valueOf(chars));
    }
    
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] str = new String[n];
    for (int i = 0; i < n; i++) {
      str[i] = sc.next();
    }
    for (String e : solution(n, str)) {
      System.out.println(e);
    }
  }
}