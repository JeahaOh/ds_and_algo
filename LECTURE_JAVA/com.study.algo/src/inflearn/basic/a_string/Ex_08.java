package inflearn.basic.a_string;

import java.util.Scanner;

public class Ex_08 {
  public static String solution(String str) {
    str = str.toLowerCase().replaceAll("[^a-z]", "").trim();
    int limit = str.length();
    for (int i = 0; i < limit / 2; i++) {
      if (!Character.isAlphabetic(str.charAt(i))) continue;;
      
      if (str.charAt(i) != str.charAt(limit - i - 1)) return "NO";
      
    }
    return "YES";
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(solution(str));
  }
}