package inflearn.basic.a_string;
import java.util.Scanner;
public class Ex_11 {
//  public static String solution(String str) {
//    str += " ";
//    char c = str.charAt(0);
//    int cnt = 1;
//
//    StringBuilder answer = new StringBuilder();
//
//    for (int idx = cnt; idx < str.length(); idx++) {
//      if (c == str.charAt(idx)) {
//        cnt++;
//        continue;
//      }
//
//      answer.append(c);
//      if (cnt > 1) answer.append(cnt);
//
//      c = str.charAt(idx);
//      cnt = 1;
//    }
//
//    return answer.toString();
//  }
  
  public static String solution(String str) {
    str += " ";
    String answer = "";
    int cnt = 1;
    
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) cnt++;
      else {
        answer += str.charAt(i);
        if (cnt > 1) answer += String.valueOf(i);
        cnt = 1;
      }
    }
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(solution(str));
  }
}