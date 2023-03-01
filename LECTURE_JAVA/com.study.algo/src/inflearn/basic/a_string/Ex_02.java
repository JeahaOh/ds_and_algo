package inflearn.basic.a_string;

import java.util.Scanner;

public class Ex_02 {
  public static String solution(String str) {
    String answer = "";
    for (char c : str.toCharArray()) {
//      if (Character.isLowerCase(c)) answer += Character.toUpperCase(c);
//      else answer += Character.toLowerCase(c);
      if (97 <= c && c <= 122) answer += (char) (c - 32);
      else answer += (char) (c + 32);
    }
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(solution(str));
  }
}
