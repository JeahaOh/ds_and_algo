package inflearn.basic.a_string;

import java.util.Scanner;

public class Ex_12 {
  public static String solution(int n, String s) {
    String answer = "";
    
    for (int i = 0; i < n; i++) {
      String t = s.substring(0, 7).replace('#', '1').replace('*', '0');
      int ascii = Integer.parseInt(t, 2);
      answer += (char) ascii;
      s = s.substring(7);
    }
    
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    String str = sc.next();
    System.out.println(solution(length, str));
  }
}