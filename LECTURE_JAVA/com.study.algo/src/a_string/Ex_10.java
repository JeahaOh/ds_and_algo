package a_string;

import java.util.Scanner;

public class Ex_10 {
  public static String solution(String s, char t) {
    String answer = "";
    int[] distances = new int[s.length()];
    int p = 1000;
    
    for (int idx = 0; idx < s.length(); idx++) {
      if (s.charAt(idx) == t) p = 0;
      else p++;
      distances[idx] = p;
    }
  
    p = 1000;
    for (int idx = s.length() - 1; idx >= 0; idx--) {
      if (s.charAt(idx) == t) p = 0;
      else p++;
      distances[idx] = Math.min(distances[idx], p);
    }
    
    for (int i : distances) {
      answer += i + " ";
    }
    
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char t = sc.next().charAt(0);
    System.out.println(solution(s, t));
  }
}