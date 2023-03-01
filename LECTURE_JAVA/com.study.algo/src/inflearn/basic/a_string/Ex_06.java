package inflearn.basic.a_string;

import java.util.Scanner;

public class Ex_06 {
  // 한개의 문자열이 입력되면 중복된 문자를 제거하고 반환
  public static String solution(String str) {
    String answer = "";
    for (int idx = 0; idx < str.length(); idx++) {
      if (idx == str.indexOf(str.charAt(idx))) answer += str.charAt(idx);
    }
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    str = solution(str);
    System.out.println(str);
  }
}